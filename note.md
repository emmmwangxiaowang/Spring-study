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