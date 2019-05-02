package cn.travel.service;

import java.util.List;

import cn.travel.entity.Friend;

public interface FriendService {
	public int addFriend(Friend friend);
	public int deleteFriend(Friend friend);
	public int updateFriend(Friend friend);
	public List<Friend> searchFriend();
}
