package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class Demo2Application {
	String test = "test";

	String dev1 = "dev";

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
