package com.jsp.spring_mvc_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.spring_mvc_crud.dao.EmployeeDao;
import com.jsp.spring_mvc_crud.dto.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping(value = "/register")
	public ModelAndView openRegisterPage() {
		ModelAndView andView = new ModelAndView("register");
		return andView.addObject("employee", new Employee());
	}
	
	@RequestMapping(value = "empRegister",method = RequestMethod.POST)
	public ModelAndView saveEmployeeController(Employee employee) {
		System.out.println(employee);
		
		Employee emp = dao.saveEmployeeDao(employee);
		
		ModelAndView andView = new ModelAndView("register");
		return andView.addObject("employee", new Employee());
	}
}
