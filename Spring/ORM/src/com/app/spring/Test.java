package com.app.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.config.AppConfig;
import com.app.spring.dao.UserDaoImpl;
import com.app.spring.entities.Department;
import com.app.spring.entities.Employee;
import com.app.spring.entities.User;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		UserDaoImpl userDao= ac.getBean(UserDaoImpl.class);
		Employee emp = new Employee();
		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("Acc");

		emp.setEmpId(1);
		emp.setEmpName("J1");
		emp.setSalary(834434);

		emp.setDept(dept);
		
		//userDao.saveEmployee(emp);
		userDao.removeEmp(emp);

		System.out.println("---- Done ----");

	}

}
