package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Friend;
import cn.travel.impl.daoImpl.FriendDaoImpl;
import cn.travel.service.FriendService;

public class FriendServiceImpl implements FriendService {
	FriendDaoImpl friendDaoImpl=new FriendDaoImpl();
	@Override
	public int addFriend(Friend friend) {
		// TODO Auto-generated method stub
		return friendDaoImpl.addFriend(friend);
	}

	@Override
	public int deleteFriend(Friend friend) {
		// TODO Auto-generated method stub
		return friendDaoImpl.deleteFriend(friend);
	}

	@Override
	public int updateFriend(Friend friend) {
		// TODO Auto-generated method stub
		return friendDaoImpl.updateFriend(friend);
	}

	@Override
	public List<Friend> searchFriend() {
		// TODO Auto-generated method stub
		return null;
	}

}
