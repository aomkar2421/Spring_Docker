package com.om;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//public class BSpringBootApplication implements CommandLineRunner {
public class BSpringBootApplication {

	@Autowired
	private Employee employee;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BSpringBootApplication.class, args);
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

	//	@Override
	//    public void run(String... args) throws Exception {
	//        System.out.println(employee);
	//    }

}
