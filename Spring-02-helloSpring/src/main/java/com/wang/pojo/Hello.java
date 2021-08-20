package com.wang.pojo;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */
public class Hello
{
    private String str;

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }
    
    @Override
    public String toString()
    {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

}
