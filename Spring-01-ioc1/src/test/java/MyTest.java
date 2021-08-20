import com.wang.dao.UserDaoMysqlImpl;
import com.wang.service.UserService;
import com.wang.service.UserServiceImpl;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/20 0020
 */

/*
    控制反转IOC,是一种思想,DI(依赖注入)是实现IOC的一种方法,
    也有人认为DI只是IOC的另一种说法,没有IOC的程序中,
    我们使用面向对象编程,对象的创建与对象间的依赖关系完全硬编码在程序中,
    对象的创建由册灰姑娘徐自己控制,控制反转后将对象的创建转移个第三方,
    个人认为所谓的控制反转就是:获得依赖对象的方式反转了

    控制反转是一种通过描述(xml或注解)并通过第三方去生产或获取特定对象的方式,在Spring中实现控制反转的是IOC容器,其实现方法是依赖注入DI(Dependency Injection).

 */
public class MyTest
{
    public static void main(String[] args)
    {
        //用户实际调的是业务层,dao层他们不需要接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
