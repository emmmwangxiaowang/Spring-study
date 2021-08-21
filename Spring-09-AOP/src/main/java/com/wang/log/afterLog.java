package com.wang.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class afterLog implements AfterReturningAdvice
{
    //returnValue: 返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable
    {
        System.out.println("执行了"+method.getName()+"方法,返回结果为"+returnValue);
    }
}
