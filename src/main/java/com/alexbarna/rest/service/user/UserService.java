package com.alexbarna.rest.service.user;

import com.alexbarna.rest.api.user.UserRequest;
import com.alexbarna.rest.dao.UserDao;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.AbstractCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<UserDto, UserDao> {
    @Autowired
    private final PasswordEncoder bcryptEncoder;

    @Autowired
    public UserService(final UserDao dao, final ModelMapper mapper, final PasswordEncoder bcryptEncoder) {
        super(dao, mapper);
        this.bcryptEncoder = bcryptEncoder;
    }

    @Override
    public UserDto getById(Long id) {
        return mapper.map(dao.findById(id), UserDto.class);
    }

    @Override
    public UserDto createFromRequest(UserDto request) {
        request.setPassword(bcryptEncoder.encode(request.getPassword()));
        UserEntity savedUser = dao.save(mapper.map(request, UserEntity.class));
        return mapper.map(savedUser, UserDto.class);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public UserDto getCurrentUser() {
        return new UserDto();
    }
}
