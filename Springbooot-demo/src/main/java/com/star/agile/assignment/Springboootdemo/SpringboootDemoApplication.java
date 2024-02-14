package com.star.agile.assignment.Springboootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringboootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboootDemoApplication.class, args);
	}

}
