package com.alexbarna.rest.service.user;

import com.alexbarna.rest.api.user.UserRequest;
import com.alexbarna.rest.dao.UserDao;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.AbstractCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<UserDto, UserDao> {

    @Autowired
    public UserService(final UserDao dao, final ModelMapper mapper) {
        super(dao, mapper);
    }

    @Override
    public UserDto getById(Long id) {
        return mapper.map(dao.findById(id), UserDto.class);
    }

    @Override
    public UserDto createFromRequest(UserDto request) {
        UserEntity savedUser = dao.save(mapper.map(request, UserEntity.class));
        return mapper.map(savedUser, UserDto.class);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public UserDto getCurrentUser() {
        //TODO get user :)
        return new UserDto();
    }
}
