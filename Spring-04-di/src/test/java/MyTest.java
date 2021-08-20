import com.wang.pojo.Student;
import com.wang.pojo.User;
import org.junit.Test;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student            student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
         * Student{
         * name='王小王',
         * address=Address{address='null'},
         * books=[红楼梦, 西游记, 水浒传, 三国演义],
         * hobbies=[游戏, 代码, 音乐, 球],
         * card={身份证=12212122221221, 银行卡=11111111112223331, 账号=emmm王小王丫},
         * games=[lol, csgo, cod],
         * info={学号=22201960333333, 性别=男, 姓名=王小王}, wife='null'}
         * */
    }

    @Test
    public void test2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        //getBean()第二个参数填写对象的类就可以通过反射获取对象了,不用强转了
        //User user1 = (User) context.getBean("user");
        User user  = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user == user2);
    }
}
