package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employeee;
import com.example.demo.Repository.EmployeeReapository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	EmployeeReapository Repository;

	@Override
	public void saveEmployeeInDb(Employeee e) {
		Repository.save(e);
		
	}

	@Override
	public void deleteEmployee(int eID) {
		Repository.deleteById(eID);
		
		
	}

	
	

	

}
