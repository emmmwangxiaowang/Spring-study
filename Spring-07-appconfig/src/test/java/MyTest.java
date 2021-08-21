import com.wang.config.wangConfig;
import com.wang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class MyTest
{
    public static void main(String[] args)
    {
        //如果完全使用了配置类的方式做,就只能通过AnnotationConfig上下文来获取容器,通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(wangConfig.class);
        User                               getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.toString());
    }
}
