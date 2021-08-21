package com.wang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler
{
//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[] { Foo.class },
//            handler);

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent)
    {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        seeHouse();
        //动态代理的本质就是使用反射机制实现
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介看房");
    }

    public void fee(){
        System.out.println("中介费");
    }
}
