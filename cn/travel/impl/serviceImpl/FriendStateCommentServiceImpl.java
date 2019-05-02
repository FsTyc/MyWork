package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.FriendStateComment;
import cn.travel.impl.daoImpl.FriendStateCommentDaoImpl;
import cn.travel.service.FriendStateCommentService;

public class FriendStateCommentServiceImpl implements FriendStateCommentService {
	FriendStateCommentDaoImpl friendStateCommentDaoImpl=new FriendStateCommentDaoImpl();
	@Override
	public int addFriendStateComment(FriendStateComment friendStateComment) {
		// TODO Auto-generated method stub
		return friendStateCommentDaoImpl.addFriendStateComment(friendStateComment);
	}

	@Override
	public int deleteFriendStateComment(FriendStateComment friendStateComment) {
		// TODO Auto-generated method stub
		return friendStateCommentDaoImpl.deleteFriendStateComment(friendStateComment);
	}

	@Override
	public int updateFriendStateComment(FriendStateComment friendStateComment) {
		// TODO Auto-generated method stub
		return friendStateCommentDaoImpl.updateFriendStateComment(friendStateComment)
			;
	}

	@Override
	public List<FriendStateComment> searchFriendStateComment() {
		// TODO Auto-generated method stub
		return null;
	}

}
