package com.chenhf.test.controller;

import com.chenhf.test.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenhf on 2017/5/27.
 */
@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @RequestMapping("/")
    public String index(){
        System.out.println(name);
        System.out.println(age);

        return "Hello bootBird";
    }

    @Bean
    public String testString(){
        System.out.println("222");
        return null;
    }

    @Autowired
    User user;
    @RequestMapping("/user")
    public String getUser(){
        return user.getName()+user.getAge();
    }

}
