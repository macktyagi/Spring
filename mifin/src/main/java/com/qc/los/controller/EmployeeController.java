package com.qc.los.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qc.los.model.Employee;
import com.qc.los.service.EmployeeService;

@Controller
public class EmployeeController {
	
	String viewName=   "employeeHome";
	
	@Autowired EmployeeService employeeService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		model.addAttribute("employee",new Employee());
		
		return viewName;
	}
	
	@GetMapping("/getEmployeeDetails")
	public String getEmployeeDetails(HttpServletRequest request,Model model) {	
		model.addAttribute("employee",new Employee());
		List<Employee> empdata = employeeService.getEmployeeDetails();
		model.addAttribute("empdata",empdata);
		return viewName;
	}
	
	@PostMapping("/saveEmployeeDetails")
	public String saveEmployeeDetails(HttpServletRequest request, @ModelAttribute Employee employee,Model model) {
	
		String message = employeeService.saveEmployeeDetails(employee);
		getEmployeeDetails(request, model);
		
		return viewName;
	}

}
