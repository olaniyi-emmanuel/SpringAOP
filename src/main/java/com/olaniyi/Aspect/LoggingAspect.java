package com.olaniyi.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Advice Run. Called");
        System.out.println(joinPoint.getTarget());
    }

//    @Before("allGetters")
//    public void secondAdvice(){
//        System.out.println("Second Advice called to run ");
//    }

    @Before("args(name)")
    public void stringArgumentMethod(String name){
        System.out.println("A method that takes String arguments has been called. The value of the name is: " + name);
    }

    @Pointcut("execution(* get*())")
    public  void allGetters(){}

    @Pointcut("within(com.olaniyi.Model.Circle)")
    public void allCircleMethods(){}
}
