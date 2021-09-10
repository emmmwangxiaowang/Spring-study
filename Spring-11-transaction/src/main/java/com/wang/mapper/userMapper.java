package com.wang.mapper;

import com.wang.pojo.User;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/9 0009
 */
public interface userMapper
{
    public List <User> selectUser();

    //添加用户
    public int addUser(User user);

    //删除用户
    public int delUser(int id);
}
