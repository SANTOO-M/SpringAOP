package com.demo.spring.SpringAOP;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AuthenticationAspect {
	
	@Pointcut("within(com.demo.spring.SpringAOP.Inmakes)")
	public void authorizationPointCut() {
		
	}

	@Pointcut("within(com.demo.spring.SpringAOP.Inmakes)")
	public void authenticationPointCut() {
		
	}
	
	@Before("authorizationPointCut() && authenticationPointCut()")
	public void authorization(JoinPoint jp) 
	{
	//	System.out.println(jp.getSignature());
	//	System.out.println(jp.getArgs()[0]+" "+jp.getArgs()[1]);
		System.out.println("Authenticating Request");
	}
}
