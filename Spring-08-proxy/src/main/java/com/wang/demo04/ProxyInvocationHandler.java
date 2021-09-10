package com.wang.demo04;

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
    private Object target;

    public void setTarget(Object target)
    {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        //newProxyInstance: 获取代理对象 有三个参数  类加载器    被代理的接口(传入的参数是实体类,向上查找找到接口类  InvocationHandler:处理器,调用其invoke方法(这个类继承了InvocationHandler,所以用this
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {

        log(method.getName());
        //动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);

        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
