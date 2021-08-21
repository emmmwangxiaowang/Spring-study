package com.wang.demo03;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class Client
{
    public static void main(String[] args)
    {
        //真实角色
        Host host=new Host();

        //代理角色:
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理要调用的接口对象
        pih.setRent(host);
        //这里的proxy就是动态生成的
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
