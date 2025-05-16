package com.om;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String name;
	
	private String department;
	
	private int sal;
	
	@Autowired
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(String name, String department, int sal) {
		super();
		this.name = name;
		this.department = department;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", sal=" + sal + ", address=" + address + "]";
	}

	
}
