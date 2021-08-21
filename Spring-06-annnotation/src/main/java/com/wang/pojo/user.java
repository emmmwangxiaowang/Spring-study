package com.wang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

//组件
@Component
//作用域(装配方式)
@Scope("prototype")
public class user
{
    @Value("王小王")
    public String name;
}
