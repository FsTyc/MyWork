package cn.travel.entity;

import java.util.Date;

public class Traveller {
	private int travellerID;
	private String travellerTitle;
	private Date travellerReleaseTime;
	private String userName;
	private int stateID;
	private Date travellerStartingTime;
	private Date travellerEndTime;
	private String phone;
	private String travellerDestination;
	private String travellerContent;

	public int getTravellerID() {
		return travellerID;
	}

	public void setTravellerID(int travellerID) {
		this.travellerID = travellerID;
	}

	public String getTravellerTitle() {
		return travellerTitle;
	}

	public void setTravellerTitle(String travellerTitle) {
		this.travellerTitle = travellerTitle;
	}

	public Date getTravellerReleaseTime() {
		return travellerReleaseTime;
	}

	public void setTravellerReleaseTime(Date travellerReleaseTime) {
		this.travellerReleaseTime = travellerReleaseTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getStateID() {
		return stateID;
	}

	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	public Date getTravellerStartingTime() {
		return travellerStartingTime;
	}

	public void setTravellerStartingTime(Date travellerStartingTime) {
		this.travellerStartingTime = travellerStartingTime;
	}

	public Date getTravellerEndTime() {
		return travellerEndTime;
	}

	public void setTravellerEndTime(Date travellerEndTime) {
		this.travellerEndTime = travellerEndTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTravellerDestination() {
		return travellerDestination;
	}

	public void setTravellerDestination(String travellerDestination) {
		this.travellerDestination = travellerDestination;
	}

	public String getTravellerContent() {
		return travellerContent;
	}

	public void setTravellerContent(String travellerContent) {
		this.travellerContent = travellerContent;
	}
}
