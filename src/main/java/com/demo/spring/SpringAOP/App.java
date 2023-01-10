package com.demo.spring.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	Inmakes in=context.getBean(Inmakes.class);
    	in.displayCourse("Java",7000);
    	
    }
}
