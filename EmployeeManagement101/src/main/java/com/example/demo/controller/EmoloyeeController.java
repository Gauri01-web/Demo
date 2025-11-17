package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employeee;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.EmployeeServiceImpl;

@RestController
public class EmoloyeeController {
	
	@Autowired
	
	EmployeeService es;
	@PostMapping("saveeeEmployeeee")
	public String saveEmployeeInDb(@RequestBody Employeee e) {
		
		es.saveEmployeeInDb(e);
		
		return "Employee is Added";
	}
	@DeleteMapping("deleteEmployee/{iD}")
	public String DeleteEmployee(@PathVariable int eID) {
		
		es.deleteEmployee(eID);
		
		return "Employee is Deleted";
	}
	
}
