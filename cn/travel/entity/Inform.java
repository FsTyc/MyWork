package cn.travel.entity;

import java.util.Date;

public class Inform {
	private int infoID;
	private String informTitle; 
	private Date informReleaseTime; 
	private String adminName; 
	private String informContent;
	
	public int getInfoID() {
		return infoID;
	}
	public void setInfoID(int infoID) {
		this.infoID = infoID;
	}
	public String getInformTitle() {
		return informTitle;
	}
	public void setInformTitle(String informTitle) {
		this.informTitle = informTitle;
	}
	public Date getInformReleaseTime() {
		return informReleaseTime;
	}
	public void setInformReleaseTime(Date informReleaseTime) {
		this.informReleaseTime = informReleaseTime;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getInformContent() {
		return informContent;
	}
	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}
}
