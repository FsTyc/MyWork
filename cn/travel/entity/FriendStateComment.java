package cn.travel.entity;

import java.util.Date;

public class FriendStateComment {
	private int userStateID; 
	private String friendStateComment; 
	private String userName; 
	private Date friendStateCommentReleaseTime;
	
	public int getUserStateID() {
		return userStateID;
	}
	public void setUserStateID(int userStateID) {
		this.userStateID = userStateID;
	}
	public String getFriendStateComment() {
		return friendStateComment;
	}
	public void setFriendStateComment(String friendStateComment) {
		this.friendStateComment = friendStateComment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getFriendStateCommentReleaseTime() {
		return friendStateCommentReleaseTime;
	}
	public void setFriendStateCommentReleaseTime(Date friendStateCommentReleaseTime) {
		this.friendStateCommentReleaseTime = friendStateCommentReleaseTime;
	}

}
