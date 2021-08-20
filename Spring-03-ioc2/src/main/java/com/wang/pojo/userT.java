package com.wang.pojo;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */
public class userT
{
    private String name;

    public userT()
    {
        System.out.println("userT被创建了");
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "userT{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("name=" + name);
    }
}
