##常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```

###xml与注解的最佳实践
- xml用来管理bean
- 注解值负责完成属性的注入
###注解说明
- @Autowired:自动装配 通过类型  名字如果Autowired不能唯一自动装配属性,则需要通过@Qualifier(value="xxx")

- @Nullable: 字段标志了这个注解 说明字段可以为空
- @Resource: 自动装配 通过名字  类型

- @component 组件 放在类上,说明这个类被管理了 和@value组合使用（把普通pojo实例化到spring容器中，相当于配置文件中的)
```xml
<bean id="" class=""/>
```

###衍生的注解
- dao @repostory
- service @Service
- controller @Controller
这四个注解功能都一样,都是代表将某个类注册到Spring中,装配bean
###使用java的方式配置Spring
JavaConfig是Spring的一个子项目,再Spring4之后,它成为了一个核心功能
18381132603
###代理模式的好处
- 可以使真是角色的操作更加纯粹
- 公共也交给代理角色,实现业务分工
- 公共业务发生扩展的时候,方便集中管理

###缺点
- 一个真实角色就会产生一个代理角色,代码量翻倍,开发效率变低


###动态代理的好处
- 一个动态代理类代理的是一个接口,一般就是对应的一类业务
- 一个动态代理类可以代理多个类,只要实现了同一个接口即可