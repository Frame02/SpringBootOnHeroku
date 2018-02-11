package com.srikar.spring.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vedantas on 2/11/2018.
 */
@RestController
public class HelloRestController {
    @RequestMapping(value = {"/", "/hello"}, method = {RequestMethod.GET})
    public String sayHello(){
        return "Hello, World!";
    }
}
