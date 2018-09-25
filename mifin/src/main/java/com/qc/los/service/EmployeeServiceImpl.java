package com.qc.los.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qc.los.dao.EmployeeDAO;
import com.qc.los.model.EmpData;
import com.qc.los.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

@Autowired	
private EmployeeDAO employeeDAO;

	public List<Employee> getEmployeeDetails() {
		 
		return employeeDAO.getEmployeeDetails();
	}
	
	public String saveEmployeeDetails(Employee employee) {
		 
		return employeeDAO.saveEmployeeDetails(employee);
	}

	public String saveEmpData(EmpData empdata) {
		return employeeDAO.saveEmpData(empdata);
	}

	public List<EmpData> getEmpData() {
		return employeeDAO.getEmpData();
	}

		
	

}
