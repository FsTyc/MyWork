package cn.travel.service;

import java.util.Date;
import java.util.List;

import cn.travel.entity.User;

public interface UserService {
	public int addUser(User user);

	public int deleteUser(User user);

	public int updateUser(User user);

	public List<User> searchUser();
	public int login(User user);
	public int register(User user);
	public int addAcccountDetail(User user);
	public int passwordChange(User user);
	public User searchUser(String userName);
	public int updateUser(Date loginTime,String userName);
	public int updateTravelCount(String userName);
}
