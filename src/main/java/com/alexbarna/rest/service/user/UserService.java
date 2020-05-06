package com.alexbarna.rest.service.user;

import com.alexbarna.rest.api.user.UserRequest;
import com.alexbarna.rest.dao.RoleDao;
import com.alexbarna.rest.dao.UserDao;
import com.alexbarna.rest.exception.UserNotFoundException;
import com.alexbarna.rest.repository.role.RoleEntity;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.AbstractCrudService;
import com.alexbarna.rest.service.jwt.JwtTokenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
public class UserService extends AbstractCrudService<UserDto, UserRequest, UserDao> {
    private final PasswordEncoder bcryptEncoder;
    private final JwtTokenService tokenService;
    private final RoleDao roleDao;

    @Autowired
    public UserService(final UserDao dao, final ModelMapper mapper, final PasswordEncoder bcryptEncoder, JwtTokenService tokenService, RoleDao roleDao) {
        super(dao, mapper);
        this.bcryptEncoder = bcryptEncoder;
        this.tokenService = tokenService;
        this.roleDao = roleDao;
    }

    @Override
    public UserDto getById(Long id) {
        return mapper.map(dao.findById(id), UserDto.class);
    }

    @Override
    public UserDto createFromRequest(UserRequest request) {
        UserDto userDto = new UserDto();
        userDto.setUsername(request.getName());
        userDto.setTempPassword(bcryptEncoder.encode("sometemppwd"));
        UserEntity user = mapper.map(request, UserEntity.class);
        UserEntity savedUser = dao.save(user);
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoles("ROLE_PUBLIC");
        roleEntity.setUser(savedUser);
        roleEntity = roleDao.save(roleEntity);
        savedUser.setRole(roleEntity);
        savedUser = dao.save(user);
        return mapper.map(savedUser, UserDto.class);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public UserDto getCurrentUser(HttpServletRequest request) {
        Optional<String> token = getTokenFromRequest(request);
        String username = tokenService.getUsernameFromToken(token.orElseThrow(UserNotFoundException::new));
        return mapper.map(dao.findByName(username), UserDto.class);
    }

    private Optional<String> getTokenFromRequest(HttpServletRequest request) {
        final String requestTokenHeader = request.getHeader("Authorization");
        Optional<String> jwtToken = Optional.empty();
        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
            jwtToken = Optional.of(requestTokenHeader.substring(7));
        }
        return jwtToken;
    }
}
