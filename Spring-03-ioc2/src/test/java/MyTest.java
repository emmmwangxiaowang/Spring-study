import com.wang.pojo.userT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */
public class MyTest
{
    public static void main(String[] args)
    {
        //Spring容器,就类似于婚介网站
        //在配置文件加载的时候,容器中管理的对象就已经初始化了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userT              user    = (com.wang.pojo.userT) context.getBean("uT4");

        user.show();

    }

    /*
    set方式注入
    依赖注入:set注入
    依赖:bean对象的创建依赖于容器
    注入:bean对象中的所有属性,由容器来注入

     */

}
