package com.alexbarna.rest.service;

public interface CrudService<T> {
    T getById(Long id);

    T createFromRequest(T request);

    void deleteById(Long id);

}
