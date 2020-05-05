package com.alexbarna.rest.service;

import org.springframework.data.repository.CrudRepository;

public abstract class AbstractCrudService<T,S,E,ID> implements CrudService<T,S>{
    protected CrudRepository<E,ID> repository;

    public AbstractCrudService(final CrudRepository<E, ID> repository) {
        this.repository = repository;
    }
}
