package com.app.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.config.AppConfig;
import com.app.spring.dao.UserDaoImpl;
import com.app.spring.entities.Department;
import com.app.spring.entities.Employee;
import com.app.spring.entities.User;

public class Test3 {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		UserDaoImpl userDao = ac.getBean(UserDaoImpl.class);
		/*
		 * Employee emp = new Employee(); Department dept = new Department();
		 * dept.setDeptId(10); dept.setDeptName("Acc");
		 * 
		 * emp.setEmpId(1); emp.setEmpName("J1"); emp.setSalary(834434);
		 * 
		 * emp.setDept(dept);
		 * 
		 * //userDao.saveEmployee(emp); userDao.removeEmp(emp);
		 */

		/*Employee e1 = new Employee(4, "E31", 3421);
		Employee e2 = new Employee(5, "E22", 344);
		Employee e3 = new Employee(6, "E23", 34234);
		Employee e4 = new Employee(7, "E4", 34424);
		Employee e5 = new Employee(8, "E5", 24434);

		Department dept = new Department();
		dept.setDeptId(11);
		dept.setDeptName("Accounts");

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		dept.setEmps(emps);

		userDao.saveDept(dept);
*/
		List<Employee> emps=userDao.getEmps(11);
		for(Employee emp:emps){
			emp.display();
		}
		
		System.out.println("---- Done ----");

	}

}
