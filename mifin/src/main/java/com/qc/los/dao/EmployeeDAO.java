package com.qc.los.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qc.los.model.EmpData;
import com.qc.los.model.Employee;

public interface EmployeeDAO {
	
	
	List<Employee> getEmployeeDetails();
	String saveEmployeeDetails(Employee employee);
	String saveEmpData(EmpData empdata);
	List<EmpData> getEmpData();
	
	
}
