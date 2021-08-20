package com.wang.service;

import com.wang.dao.UserDao;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */
public class UserServiceImpl implements UserService
{

    private UserDao userDao;

    //service层调用dao层
    public void getUser()
    {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
}
