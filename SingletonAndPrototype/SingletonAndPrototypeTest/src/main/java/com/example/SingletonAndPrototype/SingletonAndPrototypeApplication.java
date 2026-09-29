package com.example.SingletonAndPrototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SingletonAndPrototypeApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SingletonAndPrototypeApplication.class, args);

		SingletonEg s1 = context.getBean(SingletonEg.class);
		s1.name="Abi";
		s1.display();

		PrototypeEg p1 = context.getBean(PrototypeEg.class);
		p1.name = "Anu";
		p1.age=20;
		p1.show();


	}
}
