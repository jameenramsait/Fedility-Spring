package com.app.spring.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.spring.entities.Employee;
import com.app.spring.entities.User;

@Repository("userDao")
public class UserDaoImpl {

	
	@Autowired
	private SessionFactory sf;
	
	@Transactional
	public void saveUser(User user){
		Session ses=sf.getCurrentSession();
		ses.save(user);
		System.out.println("---- user Saved to DB");
	}
	
	@Transactional
	public void saveEmployee(Employee emp){
		Session ses=sf.getCurrentSession();
		ses.save(emp);
		System.out.println("---- emp Saved to DB");
	}
	
	@Transactional
	public void removeEmp(Employee emp){
		Session ses=sf.getCurrentSession();
		//Employee e1=(Employee)ses.get(Employee.class, empId);
		ses.delete(emp);
		System.out.println("---- emp Deleted from DB");
	}
	
}
