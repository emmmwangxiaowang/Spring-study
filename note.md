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
###注解说明
- @Autowired:自动装配 通过类型  名字如果Autowired不能唯一自动装配属性,则需要通过@Qualifier(value="xxx")

- @Nullable: 字段标志了这个注解 说明字段可以为空
- @Resource: 自动装配 通过名字  类型