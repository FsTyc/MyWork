package cn.travel.impl.serviceImpl;

import java.util.Date;
import java.util.List;

import cn.travel.entity.User;
import cn.travel.impl.daoImpl.UserDaoImpl;
import cn.travel.service.UserService;

public class UserServiceImpl implements UserService {
	UserDaoImpl userDaoImpl=new UserDaoImpl();
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.addUser(user);
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUser(user);
	}

	@Override
	public List<User> searchUser() {
		// TODO Auto-generated method stub
		return userDaoImpl.searchUser();
	}

	@Override
	public int login(User user) {
		return userDaoImpl.login(user);
	}

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.register(user);
	}

	@Override
	public int addAcccountDetail(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.addAcccountDetail(user);
	}

	@Override
	public int passwordChange(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.passwordChange(user);
	}

	@Override
	public User searchUser(String userName) {
		// TODO Auto-generated method stub
		return userDaoImpl.searchUser(userName);
	}

	@Override
	public int updateUser(Date loginTime,String userName) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUser(loginTime,userName);
	}

	@Override
	public int updateTravelCount( String userName) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateTravelCount(userName);
	}

}
