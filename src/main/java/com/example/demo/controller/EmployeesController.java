package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeesController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public String getAll(Model model) {
		List<Employees> result = (List<Employees>) employeeService.getAll();
		System.out.println("======"+result.size());
		model.addAttribute("data", result);
		return "index";
	}
}
