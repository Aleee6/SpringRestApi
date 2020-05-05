package com.alexbarna.rest.service;

public abstract class AbstractCrudService<T, S, D> implements CrudService<T, S> {
    protected final D dao;

    public AbstractCrudService(final D dao) {
        this.dao = dao;
    }
}
