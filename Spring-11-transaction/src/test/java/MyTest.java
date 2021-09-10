import com.wang.mapper.userMapper;
import com.wang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/8 0008
 */
public class MyTest
{
    @Test
    public void test() throws IOException
    {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理代理的是接口！
        userMapper userMapper = context.getBean("userMapper", userMapper.class);

        for (User user : userMapper.selectUser())
        {
            System.out.println(user);
        }
        System.out.println("======================");

    }
}
