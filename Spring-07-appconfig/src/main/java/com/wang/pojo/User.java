package com.wang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

//Component: 说明这个类被Spring接管了,注册到了容器中
@Component
public class User
{
    @Value("王小王")
    private String name;

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
