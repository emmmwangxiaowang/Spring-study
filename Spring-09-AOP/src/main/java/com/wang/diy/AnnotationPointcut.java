package com.wang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/8 0008
 */

//方式三: 使用注解实现AOP
//标注这个类是一个切面
@Aspect
public class AnnotationPointcut
{
    @Before("execution(* com.wang.service.userServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.wang.service.userServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    //在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
    @Around("execution(* com.wang.service.userServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("环绕前");


        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println(proceed);

        System.out.println("环绕后");
    }
}
