package com.cos.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	//http://localhost:8080/test/hello
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
