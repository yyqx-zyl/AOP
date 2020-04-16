package aop.service;

import aop.dao.UserDao;
import aop.pojo.User;

public class UserServiceImpl implements UserService {
	private UserDao userdao;
		
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void saveUser(User user) {
		userdao.saveUser(user);
	}

}
