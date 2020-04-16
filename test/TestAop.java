import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pojo.User;
import aop.service.UserService;

class TestAop {

	@Test
	void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");
		UserService us=(UserService) ctx.getBean("userService");
		User user=new User(5,"0416",32);
		us.saveUser(user);
	}

}
