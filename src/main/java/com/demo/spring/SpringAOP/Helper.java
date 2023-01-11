package com.demo.spring.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	/*
	 * //@Before("execution (public void displayCourse())") //Before Advice
	 * ->Tightly Coupling
	 * 
	 * @After("execution (public void displayCourse(..))") //After Advice public
	 * void logger() { System.out.println("Logger Working..."); }
	 * 
	 * //@Before("execution(* com.demo.spring.SpringAOP.Inmakes.displayCourse())")
	 * 
	 * @Before("execution(* *..*.displayCourse(..))")//methodname(*).(dot)package
	 * name(*) for multiple package(..)(*) public void security() {
	 * System.out.println("Security Working"); }
	 */
	
	@Pointcut("execution(* com.demo.spring.SpringAOP.Inmakes.getAmount(..))")
	public void afterReturningPointCut() {
		
	}	
	@AfterReturning(pointcut="afterReturningPointCut()",returning="retval")
	public void returningPointCut(int retval) {
		System.out.println("After Returning value="+retval);
		
	}
	
}
