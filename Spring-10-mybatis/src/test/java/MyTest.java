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
       /*
        mybatis 原生运行流程

        //导入配置
        String resource="mybatis-config.xml";
        //读取文件
        InputStream inp = Resources.getResourceAsStream(resource);
        //创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inp);
        //获取sqlsession
        SqlSession sqlSession = sessionFactory.openSession(true);
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        List <User> users = mapper.selectUser();
        for (User user : users)
        {
            System.out.println(user);
        }

        sqlSession.close();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理代理的是接口！
        userMapper userMapper = context.getBean("userMapper2", userMapper.class);

        for (User user : userMapper.selectUser())
        {
            System.out.println(user);
        }
    }
}
