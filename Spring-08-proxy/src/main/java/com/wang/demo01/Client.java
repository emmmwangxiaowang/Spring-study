package com.wang.demo01;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class Client
{
    public static void main(String[] args)
    {
        //房东租房
        Host host=new Host();
        //代理,中介帮房东租房子,代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
