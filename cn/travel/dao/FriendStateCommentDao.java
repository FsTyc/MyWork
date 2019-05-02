package cn.travel.dao;

import java.util.List;

import cn.travel.entity.FriendStateComment;

public interface FriendStateCommentDao {
	public int addFriendStateComment(FriendStateComment friendStateComment);
	public int deleteFriendStateComment(FriendStateComment friendStateComment);
	public int updateFriendStateComment(FriendStateComment friendStateComment);
	public List<FriendStateComment> searchFriendStateComment();
}
