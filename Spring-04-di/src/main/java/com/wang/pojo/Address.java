package com.wang.pojo;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */
public class Address
{
    @Override
    public String toString()
    {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    private String address;

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
