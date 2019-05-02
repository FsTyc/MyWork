package cn.travel.entity;

import java.util.Date;

public class Notice {
	private int noticeID; 

	private String noticeTitle; 
	private String noticeReceiver; 
	private String noticeContent; 
	private Date noticeReleaseTime; 
	private String userName;
	
	public int getNoticeID() {
		return noticeID;
	}
	public void setNoticeID(int noticeID) {
		this.noticeID = noticeID;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeReceiver() {
		return noticeReceiver;
	}
	public void setNoticeReceiver(String noticeReceiver) {
		this.noticeReceiver = noticeReceiver;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeReleaseTime() {
		return noticeReleaseTime;
	}
	public void setNoticeReleaseTime(Date noticeReleaseTime) {
		this.noticeReleaseTime = noticeReleaseTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
