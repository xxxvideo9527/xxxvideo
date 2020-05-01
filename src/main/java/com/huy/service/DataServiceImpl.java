package com.huy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.domain.Data;
import com.huy.repository.DataRepository;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepository dataRepository;

	@Override
	public Iterable<Data> findAll() {
		return dataRepository.findAll();
	}

	@Override
	public List<Data> search(String q) {
		return dataRepository.findByNameContaining(q);
	}

	@Override
	public Data findOne(int id) {
		return dataRepository.findOne(id);
	}

	@Override
	public void save(Data data) {
		dataRepository.save(data);
	}

	@Override
	public void delete(int id) {
		dataRepository.delete(id);
	}
}