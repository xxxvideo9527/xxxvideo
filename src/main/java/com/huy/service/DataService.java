package com.huy.service;

import java.util.List;

import com.huy.domain.Data;

public interface DataService {

    Iterable<Data> findAll();

    List<Data> search(String q);

    Data findOne(int id);

    void save(Data data);

    void delete(int id);

}