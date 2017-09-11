package com.janjira.spring.springframwork1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    		// read beans.xml 
    		ApplicationContext context = new ClassPathXmlApplicationContext("com/janjira/spring/springframwork1/beans/beans.xml");
    		Person person = (Person) context.getBean("person");
    		person.speak();
    		
    		System.out.println(person);
    		
    		((ClassPathXmlApplicationContext)context).close();
    }
}
