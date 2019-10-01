package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Integer>{

}
