package com.lzp.mySpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
    
    @Pointcut("execution(* com.lzp.mySpringAOP.CutPointInterface.method(..))")
    public void method(){
        
    }
    
    @Before("method()")
    public void before(){
        System.out.println("之前");
    }
    @After("method()")
    public void after(){
        System.out.println("之后");
    }
    
    
}