package com.qc.los.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qc.los.model.EmpData;
import com.qc.los.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl  implements EmployeeDAO {
	
	Session session = null;
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> getEmployeeDetails() {
		
		List<Employee>  empdata = null;
		try {
			session = sessionFactory.openSession();
			Transaction t  = session.beginTransaction();
			Criteria criteria =  session.createCriteria(Employee.class);
			empdata = criteria.list();
			
			t.commit();			
			}
			catch(Exception e) {
				System.out.println(e);
				session.close();
				
			}
		 
		return empdata;
	}
	
	public String saveEmployeeDetails(Employee employee) {
		
		
		int key = 0 ;
		try {
			session = sessionFactory.openSession();
			Transaction t  = session.beginTransaction();
			  key = (Integer)session.save(employee);
			t.commit();
		}
		catch(Exception e) {
			System.out.println(e);
			session.close();
			
		}
		
		return ""+key;
	}
	
public List<EmpData> getEmpData() {
		
		List<EmpData>  empdata = null;
		try {
			session = sessionFactory.openSession();
			Transaction t  = session.beginTransaction();
			Criteria criteria =  session.createCriteria(EmpData.class);
			empdata = criteria.list();
			
			t.commit();			
			}
			catch(Exception e) {
				System.out.println(e);
				session.close();
				
			}
		 
		return empdata;
	}
	public String saveEmpData(EmpData empData) {
		
		
		int key = 0 ;
		try {
			session = sessionFactory.openSession();
			Transaction t  = session.beginTransaction();
			key = (Integer)session.save(empData);
			t.commit();
		}
		catch(Exception e) {
			System.out.println(e);
			session.close();
			
		}
		
		return ""+key;
	}
	
}
