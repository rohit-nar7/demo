package com.DEMO.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello casper");
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		Student student = applicationContext.getBean("student",Student.class);
		System.out.println(student.yourBalance()+" "+student.total());
		System.exit(0);

	}

}
