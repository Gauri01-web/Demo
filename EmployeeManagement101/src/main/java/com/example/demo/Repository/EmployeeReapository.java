package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employeee;

public interface EmployeeReapository extends JpaRepository<Employeee, Integer>{

}
