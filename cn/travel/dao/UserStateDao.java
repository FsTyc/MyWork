package cn.travel.dao;

import java.util.List;

import cn.travel.entity.UserState;

public interface UserStateDao {
	public int addUserState(UserState userState);

	public int deleteUserState(UserState userState);

	public int updateUserState(UserState userState);

	public List<UserState> searchUserState(String userName);
}
