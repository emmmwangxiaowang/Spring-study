package com.wang.diy;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
/*AOP
    pointcut : 要切入的位置 分为execution方式和annotation方式
    advice : 方法增强(代理)
    aspect : pointcup + advice

 */
public class diyPointCut
{
    public void before(){
        System.out.println("======方法执行前=====");
    }

    public void after(){
        System.out.println("======方法执行后======");
    }
}
