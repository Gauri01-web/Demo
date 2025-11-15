package com.example.demo.Service;

import com.example.demo.Entity.Employeee;

public interface EmployeeService {
	
	void saveEmployeeInDb(Employeee e);
	void deleteEmployee(int eID);
	

}
