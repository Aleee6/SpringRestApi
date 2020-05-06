package com.alexbarna.rest.dao;

import com.alexbarna.rest.repository.role.RoleEntity;
import com.alexbarna.rest.repository.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleDao {
    private final RoleRepository repository;

    @Autowired
    public RoleDao(final RoleRepository repository) {
        this.repository = repository;
    }


    public RoleEntity save(RoleEntity roleEntity) {
        return repository.save(roleEntity);
    }

}
