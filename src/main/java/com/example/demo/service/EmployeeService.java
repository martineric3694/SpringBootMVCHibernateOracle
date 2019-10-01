package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Iterable<Employees> getAll(){
		Iterable<Employees> result = employeeRepository.findAll();
		return result;
	}
	
	public Employees getOne(int id) {
		Employees result = employeeRepository.findOne(id);
		return result;
	}
}
