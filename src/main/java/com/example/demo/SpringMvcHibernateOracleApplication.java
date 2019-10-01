package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
@Controller
public class SpringMvcHibernateOracleApplication {

	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcHibernateOracleApplication.class, args);
	}
	 
//	@RequestMapping("/serviceEmp")
//	public void getAll() {
//		List<Employees> result = employeeService.getAll();
//		System.out.println(result.size());
//		
//	}
	
	@RequestMapping("/")
	public String getAll(Model model) {
		Iterable<Employees> result = employeeService.getAll();
		model.addAttribute("data", result);
		return "index";
	}
	
	@RequestMapping("/view/{id}")
	public String getOne(@PathVariable("id")int id,Model model) {
		Employees emp = employeeService.getOne(id);
		model.addAttribute("emp", emp);
		return "emp/detail";
	}

}
