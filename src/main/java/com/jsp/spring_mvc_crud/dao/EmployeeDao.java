package com.jsp.spring_mvc_crud.dao;

import org.springframework.stereotype.Repository;
import com.jsp.spring_mvc_crud.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Repository
public class EmployeeDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Employee saveEmployeeDao(Employee employee) {
		et.begin();
		em.persist(employee);
		et.commit();
		
		return employee;
	}
}
