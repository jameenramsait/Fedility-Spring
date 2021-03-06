package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Employee implements InitializingBean,DisposableBean{
	@Override
	public void destroy() throws Exception {
		System.out.println("----- Object being Destroyed");
		
	}
	
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---- After Properties");	
	}
	
	
	private String empName="Praveen";

	public Employee() {
	System.out.println("--- Employee Object");
	} 
	
	@PostConstruct
	@PreDestroy
	public String getEmpName() {
		System.out.println("------- Post Construct");
		return empName;
	}

    @Required
	public void setEmpName(String empName) {
		System.out.println("---- setter got Called");
		this.empName = empName;
	}
	
	

}
