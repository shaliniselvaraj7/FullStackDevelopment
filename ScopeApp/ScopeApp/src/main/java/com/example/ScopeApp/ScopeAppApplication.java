package com.example.ScopeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeAppApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(ScopeAppApplication.class, args);
		ScopeEg s1 = context.getBean(ScopeEg.class);
		s1.age = 22;
		ScopeEg s2 = context.getBean(ScopeEg.class);
		s2.age= 24;
		s1.display();
		System.out.println(s2.age);

		ScopeEgSingleton sing1 = context.getBean(ScopeEgSingleton.class);
		sing1.name = "Anu";
		ScopeEgSingleton sing2 = context.getBean(ScopeEgSingleton.class);
		sing2.name = "Abi";
		sing1.show();
		sing2.show();
	}
}
