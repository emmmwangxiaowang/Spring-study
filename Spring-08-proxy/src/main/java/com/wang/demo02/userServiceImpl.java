package com.wang.demo02;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
//真实对象
public class userServiceImpl implements userService
{

    @Override
    public void add()
    {
        System.out.println("增加了用户");
    }

    @Override
    public void delete()
    {
        System.out.println("删除了用户");
    }

    @Override
    public void update()
    {
        System.out.println("更新了用户");
    }

    @Override
    public void query()
    {
        System.out.println("查询用户");
    }
}
