package com.wang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import javax.annotation.Resource;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

/*
    Resource和Autowired
    1.都是用来自动装配的,都可以放在属性字段上
    2.Autowired默认通过byType实现,而且必须要求这个对象存在
    Resource默认通过byName实现,找不到再通过byType
    执行顺序不同


*/

public class People
{
    //在属性上使用即可,也可以在set方法上使用
    //使用Autowired就可以不用写set方法了,前提是这个自动装配的属性在IOC(Spring)容器中存在,且符合byType(先byType 再byName)
    //如果显示定义了Autowired的required属性为flase,说明这个对象可以为null,否则不允许为空
    //如果Autowired自动装配环境比较复杂,自动装配无法通过一个注解完成的时候,我们可以使用Qualifier("value")配合使用,指定一个唯一的bean对象注入

    @Autowired(required = false)
    @Qualifier("cat1")
    private Cat    cat;

    //Resource先找名字,再找属性
    //bean要唯一,不唯一可以使用name属性指定bean
    @Resource(name = "dog1")
    private Dog    dog;
    private String name;

    public People()
    {
    }

    public People(@Nullable String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat()
    {
        return cat;
    }

    public Dog getDog()
    {
        return dog;
    }

}
