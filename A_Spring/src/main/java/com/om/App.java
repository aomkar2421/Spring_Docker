package com.om;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/om/config.xml");
//        
//        Employee em = context.getBean("employee", Employee.class);
//        System.out.println(em);

        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Employee em = context.getBean("getEmp", Employee.class);
        System.out.println(em);
    }
}
