package com.elenagarrone.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Supposing that I want to be able to load the beans.xml file from any folder on the class path I can do that by doing:
		ApplicationContext context = new ClassPathXmlApplicationContext("com/elenagarrone/spring/test/beans/beans.xml"); // In this case the path can start from the package directory.
		
		// ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/elenagarrone/spring/test/beans/beans.xml"); // To get the path right click on the file and select 'Copy Qualified Name'. 
		
		Person person = (Person) context.getBean("person"); 
		person.speak();
	
		((ClassPathXmlApplicationContext)context).close();
	}
	
	// Often is convenient to put the .xml files in some package or subfolder.

}
