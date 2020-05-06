package com.alexbarna.rest.service;

public interface CrudService<T, R> {
    T getById(Long id);

    T createFromRequest(R request);

    void deleteById(Long id);

}
