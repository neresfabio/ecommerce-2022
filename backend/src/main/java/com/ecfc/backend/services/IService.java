package com.ecfc.backend.services;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService <T>{
    T findById(Long id);
    T update(Long id,T t);
    List<T> findAll(Pageable pageable);
    String delete(Long id);
}
