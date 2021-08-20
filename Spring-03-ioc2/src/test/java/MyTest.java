import com.wang.pojo.user;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        user               user    = (com.wang.pojo.user) context.getBean("user");
        user               user1   = (com.wang.pojo.user) context.getBean("user");
        user.show();
        System.out.println(user == user1);

    }
}
