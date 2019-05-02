package cn.travel.entity;

import java.util.Date;

public class Memory {
	private int memoryID; 
	
	private String memoryTitle; 
	private Date memoryReleaseTime; 
	private String memoryContent; 
	private String userName;
	
	public int getMemoryID() {
		return memoryID;
	}
	public void setMemoryID(int memoryID) {
		this.memoryID = memoryID;
	}
	public String getMemoryTitle() {
		return memoryTitle;
	}
	public void setMemoryTitle(String memoryTitle) {
		this.memoryTitle = memoryTitle;
	}
	public Date getMemoryReleaseTime() {
		return memoryReleaseTime;
	}
	public void setMemoryReleaseTime(Date memoryReleaseTime) {
		this.memoryReleaseTime = memoryReleaseTime;
	}
	public String getMemoryContent() {
		return memoryContent;
	}
	public void setMemoryContent(String memoryContent) {
		this.memoryContent = memoryContent;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
