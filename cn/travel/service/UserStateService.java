package cn.travel.service;

import java.util.List;

import cn.travel.entity.UserState;

public interface UserStateService {
	public int addUserState(UserState userState);

	public int deleteUserState(UserState userState);

	public int updateUserState(UserState userState);

	public List<UserState> searchUserState(String userName);
}
