package com.demo.spring.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public class Inmakes {
	public void displayCourse(String course,int amount) {
		System.out.println("Displaying all Courses.."
				+"Course name= "+course+" amount="+amount);	//Business Logic
	}
	public void displaySecurity() {
		System.out.println("Security Initializing");
	}
}
