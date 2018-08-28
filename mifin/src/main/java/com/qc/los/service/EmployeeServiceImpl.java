package com.qc.los.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qc.los.dao.EmployeeDAO;
import com.qc.los.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

@Autowired	
private EmployeeDAO loandetailDao;

	public List getEmployeeDetails() {
		 
		return loandetailDao.getEmployeeDetails();
	}
	
	public String saveEmployeeDetails(Employee employee) {
		 
		return loandetailDao.saveEmployeeDetails(employee);
	}
	
	

}
