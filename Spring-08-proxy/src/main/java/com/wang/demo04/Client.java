package com.wang.demo04;

import com.wang.demo02.userService;
import com.wang.demo02.userServiceImpl2;

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
        userService userService = new userServiceImpl2();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理对象
        pih.setTarget(userService);
        //动态生成代理类
        userService proxy = (com.wang.demo02.userService) pih.getProxy();
        proxy.delete();
    }
}
