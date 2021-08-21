import com.wang.service.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class MyTest
{
    public static void main(String[] args)
    {
        ApplicationContext context     = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口
        userService        userService = (com.wang.service.userService)context.getBean("userService");
        userService.add();
    }
}
