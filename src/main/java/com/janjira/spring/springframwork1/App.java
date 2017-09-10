package com.janjira.spring.springframwork1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    		// read beans.xml 
    		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    		Person person = (Person) context.getBean("person");
    		person.speak();
    }
}
