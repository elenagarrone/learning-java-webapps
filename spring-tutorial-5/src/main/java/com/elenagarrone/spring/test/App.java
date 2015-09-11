package com.elenagarrone.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// This create my spring bean container:
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml"); // I need to supply the name of the xml file to read. 
		
		// I can now use that container to get bean from it (there is only one bean for now -> Person):
		
		Person person = (Person) context.getBean("person"); // I pass the id of the bean as argument of getBean and then I have to cast it to the correct object.
		person.speak();
	
	}

}
