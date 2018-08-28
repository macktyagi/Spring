package com.qc.los.service;

import java.util.List;

import com.qc.los.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployeeDetails();
	String saveEmployeeDetails(Employee employee);
	
	

}
