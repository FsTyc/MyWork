package cn.travel.entity;

import java.util.Date;

public class MemoryComment {
	private int memoryID; 
	private String memoryComment; 
	private String userName; 
	private Date  memoryCommentReleaseTime;
	
	public int getMemoryID() {
		return memoryID;
	}
	public void setMemoryID(int memoryID) {
		this.memoryID = memoryID;
	}
	public String getMemorycomment() {
		return memoryComment;
	}
	public void setMemorycomment(String memoryComment) {
		this.memoryComment = memoryComment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getMemoryCommentReleaseTime() {
		return memoryCommentReleaseTime;
	}
	public void setMemoryCommentReleaseTime(Date memoryCommentReleaseTime) {
		this.memoryCommentReleaseTime = memoryCommentReleaseTime;
	}
}
