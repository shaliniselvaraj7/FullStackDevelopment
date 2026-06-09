package com.fullstack;
import java.util.*;

	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog {
	    void bark() {
	        System.out.println("Dog barks: Bow Bow");
	    }
	}
	class Cat{
		void meow() {
			System.out.println("Cat sounds Meow Meow");
		}
	}

	public class AnimalMain {
	    public static void main(String[] args) {
	        Animal a = new Animal();
	        Dog d = new Dog();
	        Cat c= new Cat();

	        a.sound();
	        d.bark();
	        c.meow();
	    }
	}


