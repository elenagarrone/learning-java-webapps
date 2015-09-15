package com.elenagarrone.spring.test;
import com.elenagarrone.spring.test.Person;


public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Using factory to create a person.");
		return new Person(id, name);
	}
}
