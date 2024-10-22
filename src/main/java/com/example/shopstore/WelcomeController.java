package com.example.shopstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Create Rest Controller and set it to Map to the home page
@RestController
public class WelcomeController {
	
	//To view the actual home page, change the route to "/api/welcome" so it allows the original view to show up.
    @GetMapping("/")
    public String welcome() {
        return "Hello from the Spring Boot and Welcome to My Store!!!";
    }
}