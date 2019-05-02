package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.UserState;
import cn.travel.impl.daoImpl.UserStateDaoImpl;
import cn.travel.service.UserStateService;

public class UserStateServiceImpl implements UserStateService {
	UserStateDaoImpl userStateDaoImpl=new UserStateDaoImpl();
	@Override
	public int addUserState(UserState userState) {
		// TODO Auto-generated method stub
		return userStateDaoImpl.addUserState(userState);
	}

	@Override
	public int deleteUserState(UserState userState) {
		// TODO Auto-generated method stub
		return userStateDaoImpl.deleteUserState(userState);
	}

	@Override
	public int updateUserState(UserState userState) {
		// TODO Auto-generated method stub
		return userStateDaoImpl.updateUserState(userState);
	}

	@Override
	public List<UserState> searchUserState(String userName) {
		// TODO Auto-generated method stub
		return userStateDaoImpl.searchUserState(userName);
	}

}
