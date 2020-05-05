package com.alexbarna.rest.service;

public interface CrudService<T,S> {
    T getById(Long id);

    T createFromRequest(S request);

    T deleteById(Long id);

}
