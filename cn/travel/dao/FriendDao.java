package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Friend;

public interface FriendDao {
	public int addFriend(Friend friend);
	public int deleteFriend(Friend friend);
	public int updateFriend(Friend friend);
	public List<Friend> searchFriend();
}
