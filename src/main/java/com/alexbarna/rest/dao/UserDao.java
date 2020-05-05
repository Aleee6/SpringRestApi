package com.alexbarna.rest.dao;

import com.alexbarna.rest.exception.UserNotFoundException;
import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDao {
    private final UserRepository repository;

    @Autowired
    public UserDao(final UserRepository repository) {
        this.repository = repository;
    }

    public UserEntity findById(Long id) {
        Optional<UserEntity> user = repository.findById(id);
        return user.orElseThrow(UserNotFoundException::new);
    }

    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
        else{
            throw new UserNotFoundException();
        }
    }
}
