import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaosqlserverImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext,拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
