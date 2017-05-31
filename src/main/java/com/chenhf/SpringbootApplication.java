package com.chenhf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
        System.out.println("111");
        SpringApplication.run(SpringbootApplication.class, args);
	}

//    public CommandLineRunner commandLineRunner(){
//        System.out.println("222");
//        return null;
//    }


}
