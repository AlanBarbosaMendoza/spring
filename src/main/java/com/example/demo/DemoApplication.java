package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/sayHello/{name}")
    String sayHello(@PathVariable String name) {
        return "Hello " + name + "!!!";
    }

    @RequestMapping("/sayGoodbye/{name}")
    String sayGoodbye(@PathVariable String name) {
        return "Goodbye " + name +"!!!";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
