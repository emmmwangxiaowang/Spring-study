package com.wang.service;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class userServiceImpl implements userService
{
    @Override
    public void add()
    {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete()
    {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update()
    {
        System.out.println("更新了一个用户");
    }

    @Override
    public void select()
    {
        System.out.println("查找了用户");
    }
}
