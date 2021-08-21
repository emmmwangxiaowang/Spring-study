package com.wang.demo01;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class Proxy
{
    private Host host;

    public Proxy()
    {
    }

    public Proxy(Host host)
    {
        this.host = host;
    }


    public void rent()
    {
        seeHouse();
        host.rent();
        hetong();
        fee();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介看房");
    }

    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }

    //前合同
    public void hetong(){
        System.out.println("签合同");
    }
}
