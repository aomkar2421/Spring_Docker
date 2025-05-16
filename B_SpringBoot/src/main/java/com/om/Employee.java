package com.om;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name = "omkarv";
	
	private String department = "IT";
	
	private int sal = 100000000;
	
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", sal=" + sal + ", address=" + address + "]";
	}

	
}
