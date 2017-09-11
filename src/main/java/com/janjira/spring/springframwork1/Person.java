package com.janjira.spring.springframwork1;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello I am a peron");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}	
}
