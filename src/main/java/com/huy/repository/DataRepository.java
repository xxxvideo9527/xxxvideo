package com.huy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.huy.domain.Data;

public interface DataRepository extends CrudRepository<Data, Integer> {

    List<Data> findByNameContaining(String q);

}