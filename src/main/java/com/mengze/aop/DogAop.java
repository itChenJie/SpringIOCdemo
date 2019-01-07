package com.mengze.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DogAop {

    @Pointcut("execution(** com.mengze.entity.Dog.bark(..))")
    public void dogPointcut() {}

    @Before("dogPointcut()")
    public void beforeBarking() {
        System.out.println("aspect before dog barking ...");
    }

    @After("dogPointcut()")
    public void afterBarking() {
        System.out.println("aspect after dog barking ...");
    }
}
