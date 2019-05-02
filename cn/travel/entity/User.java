package cn.travel.entity;

import java.util.Date;

public class User {
	private String userName; 
	private String userPwd; 
	private String email; 
	private String sex; 
	private Date birthday; 
	private String qq; 
	private String phone; 
	private String location; 
	private String hobby; 
	private String resume; 
	private int travelCount; 
	private int memoryCount; 
	private int stateID; 
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String state; 
	private Date loginTime;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public int getTravelCount() {
		return travelCount;
	}
	public void setTravelCount(int travelCount) {
		this.travelCount = travelCount;
	}
	public int getMemoryCount() {
		return memoryCount;
	}
	public void setMemoryCount(int memoryCount) {
		this.memoryCount = memoryCount;
	}
	public int getStateID() {
		return stateID;
	}
	public void setStateID(int stateID) {
		this.stateID = stateID;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
}
