package com.wipro.firstSpringbootApp;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//same as @Configuration @EnableAutoConfiguration 
//@ComponentScan-scan on package where application is located
public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(application.class, args);//Static method to launch the Spring Application context
	}
	@Bean
	//used in place of @Component that automatically configures
	//It returns an object that spring should register as bean in application context
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
