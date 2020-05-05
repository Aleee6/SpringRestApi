package com.alexbarna.rest.service.user;

import com.alexbarna.rest.api.user.UserRequest;
import com.alexbarna.rest.dao.UserDao;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<UserDto,UserRequest,UserDao> {

    @Autowired
    public UserService(final UserDao dao) {
        super(dao);
    }

    @Override
    public UserDto getById(Long id) {
        UserEntity userEntity = dao.findById(id);
        //TODO map entity to dto
        return new UserDto();
    }

    @Override
    public UserDto createFromRequest(UserRequest request) {
        return null;
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
