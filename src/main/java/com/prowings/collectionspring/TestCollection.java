package com.prowings.collectionspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
	
	public static void main(String[] args) {
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		Employee emp1 = (Employee) ctx2.getBean("empCollection");
		
		
		System.out.println(emp1);
	}

}
