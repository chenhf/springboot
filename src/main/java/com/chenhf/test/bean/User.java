package com.chenhf.test.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chenhf on 2017/5/31.
 */
@Configuration
@PropertySource(value = "classpath:properties/test.properties")
@ConfigurationProperties(prefix = "com.chenhf")
public class User {
    private String  name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
