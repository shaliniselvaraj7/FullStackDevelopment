package com.example.Component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComponentApplication.class, args);
		ComponentEg com = context.getBean(ComponentEg.class);
		com.show();

		ComponentEg2 com1 = context.getBean(ComponentEg2.class);
		com1.display();
	}
}
