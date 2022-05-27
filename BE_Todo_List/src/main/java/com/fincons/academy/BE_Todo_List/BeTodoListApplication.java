package com.fincons.academy.BE_Todo_List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
//@ComponentScan({"com.fincons..academy.controllers"})
@CrossOrigin("http://localhost:4200")
public class BeTodoListApplication{

	public static void main(String[] args) {
		SpringApplication.run(BeTodoListApplication.class, args);
	}
}
