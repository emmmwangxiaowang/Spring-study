import com.wang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */

/*
 * bean的自动装配
 * 自动装配是spring班组bean一依赖的一种方式
 * Spring会在上下文中自动寻找,并自动给bean配置属性
 *
 * 在Spring中有三种装配的方式
 *      1.在xml中显示的配置
 *      2.在java中显示的配置
 *      3.饮食的自动装配bean
 * */

public class MyTest
{
    @Test
    public void test1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People             people  = context.getBean("people", People.class);
        people.getCat().spark();
        people.getDog().spark();
    }
}
