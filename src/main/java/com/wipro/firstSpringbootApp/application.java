package com.wipro.firstSpringbootApp;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication//same as @Configuration @EnableAutoConfiguration 
//@ComponentScan-scan on package where application is located
public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(application.class, args);//Static method to launch the Spring Application context
	}
}
