package aop.dao;

import java.util.ArrayList;
import java.util.List;

import aop.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		List<User> list=new ArrayList<User>();
		list.add(user);
		System.out.println("0416龙哥！！！");
	}

}
