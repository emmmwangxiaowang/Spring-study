package com.wang.demo02;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class userServiceProxy implements userService
{
    userServiceImpl userService;

    public void setUserService(userServiceImpl userService)
    {
        this.userService = userService;
    }

    @Override
    public void add()
    {
        log("add");
        userService.add();
    }

    @Override
    public void delete()
    {
        log("delete");
        userService.delete();
    }

    @Override
    public void update()
    {
        log("update");
        userService.update();
    }

    @Override
    public void query()
    {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用了:"+msg+"方法");
    }
}
