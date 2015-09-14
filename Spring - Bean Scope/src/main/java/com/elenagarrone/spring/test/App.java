package com.elenagarrone.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/elenagarrone/spring/test/beans/beans.xml"); 
		
		Person person1 = (Person) context.getBean("person"); 
		Person person2 = (Person) context.getBean("person"); 
		
		person1.setTaxId(666);
		
		// We set person1 to have a taxId=666 but also person2 get the same. This is because the person bean is a singleton and no matter how many times we request the bean from the container, we'll always be given the same bean. So it's just giving us different references for the same object.
		// A bean has a default scope of 'singleton'.
		// If we set the scope of the bean to be prototype the taxId will be different. Now everytime we request a person bean from the container we get a new object being created.
		System.out.println(person2);
	
		((ClassPathXmlApplicationContext)context).close();
	}
	
}
