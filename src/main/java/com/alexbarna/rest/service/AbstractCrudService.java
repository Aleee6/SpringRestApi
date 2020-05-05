package com.alexbarna.rest.service;

import org.modelmapper.ModelMapper;

public abstract class AbstractCrudService<T, S, D> implements CrudService<T, S> {
    protected final D dao;
    protected final ModelMapper mapper;

    public AbstractCrudService(final D dao, final ModelMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }
}
