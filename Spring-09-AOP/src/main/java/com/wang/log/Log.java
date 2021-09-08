package com.wang.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class Log implements MethodBeforeAdvice
{
    //method: 要执行的目标对象的方法
    //object: 参数
    //target: 目标  对象


    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable
    {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");















    }
}
