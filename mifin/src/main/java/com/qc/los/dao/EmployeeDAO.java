package com.qc.los.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qc.los.model.Employee;

public interface EmployeeDAO {
	
	
	List getEmployeeDetails();
	String saveEmployeeDetails(Employee employee);
	
	
}
