package com.wang.demo02;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class Client
{
    public static void main(String[] args)
    {
        userServiceImpl userService = new userServiceImpl();

        userServiceProxy proxy = new userServiceProxy();
        proxy.setUserService(userService);
        proxy.update();
    }
}
