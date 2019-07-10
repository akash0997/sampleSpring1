package com.wipro.firstSpringbootApp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController//informs the Spring to interpret the result back to the caller
public class helloController {

	@RequestMapping("/")//informs the Spring that any HTTP request should map to the corresponding method(index)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
