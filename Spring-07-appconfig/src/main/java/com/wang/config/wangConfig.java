package com.wang.config;

import com.wang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

//Component: 说明这个类被Spring接管了,注册到了容器中,因为它本身就是一个@Component
//@Configuration 代表这是一个配置类,就和之前的beans.xml一样
@Configuration
@ComponentScan("com.wang.pojo")
@Import(wangConfig2.class)
public class wangConfig
{

    //注册一个bean 就相当于之前写的一个 bean 标签
    //这个方法的名字就相当于 bean标签中的id属性
    //这个方法的返回值就相当于bean标签的class属性
    @Bean
    public User getUser()
    {
        return new User();//就是返回要注入到bean的对象
    }
}
