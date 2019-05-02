package cn.travel.entity;

import java.util.Date;

public class UserState {
	private int userStateID;
	private String userName;
	private Date userStateTime;
	private String stateComment;
	
	public int getUserStateID() {
		return userStateID;
	}
	public void setUserStateID(int userStateID) {
		this.userStateID = userStateID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserStateTime() {
		return userStateTime;
	}
	public void setUserStateTime(Date userStateTime) {
		this.userStateTime = userStateTime;
	}
	public String getStateComment() {
		return stateComment;
	}
	public void setStateComment(String stateComment) {
		this.stateComment = stateComment;
	}
}
