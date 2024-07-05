package com.masti.jatin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShontyBhaiApplication {
//	@Autowired
//	public mehak m1;

	public static void main(String[] args) {
		SpringApplication.run(ShontyBhaiApplication.class, args);

//		This will give error as ShontyBhaiApplication is not a bean and is initialised using
//		new keyword. hence it is not managed by spring container.
//		ShontyBhaiApplication obj = new ShontyBhaiApplication();
//		System.out.println(obj.m1.a);
	}

}
