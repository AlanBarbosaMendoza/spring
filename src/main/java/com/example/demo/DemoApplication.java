package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/hello/{name}")
    String sayHello(@PathVariable String name) {
	System.out.println("SayHello");
        return "Hello " + name + "!!!";
    }

    @RequestMapping("/goodbye/{name}")
    String sayGoodbye(@PathVariable String name) {
	System.out.println("SayGoodBye");
        return "Goodbye " + name +"!!!";
    }

@RequestMapping("/")
    String home() {
	System.out.println("Hello World");
        return "Hello World!";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
