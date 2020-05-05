package com.alexbarna.rest.service.user;

import com.alexbarna.rest.api.user.UserRequest;
import com.alexbarna.rest.exception.UserNotFoundException;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.AbstractCrudService;
import com.alexbarna.rest.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends AbstractCrudService<UserDto,UserRequest,UserEntity,Long> {

    @Autowired
    public UserService(CrudRepository<UserEntity, Long> repository) {
        super(repository);
    }

    @Override
    public UserDto getById(Long id) {
        Optional<UserEntity> userEntity = repository.findById(id);
        return null;
    }

    @Override
    public UserDto createFromRequest(UserRequest request) {
        return null;
    }

    @Override
    public UserDto deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
        else{
            throw new UserNotFoundException();
        }
        return null;
    }
}
