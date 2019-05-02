package cn.travel.entity;

import java.util.Date;

public class Strategy {
	private int strategyID;
	private String strategyTitle;
	private String strategyAppropriateTime;
	private String strategyAppropriateCrowd;
	private String strategyImg;
	private int strategyTypeID;
	private String strategyIntro;
	private String strategyEquip;
	private String strategyMatters;
	private String adminName;
	private Date strategyReleaseTime;

	public int getStrategyID() {
		return strategyID;
	}
	public void setStrategyID(int strategyID) {
		this.strategyID = strategyID;
	}
	public String getStrategyTitle() {
		return strategyTitle;
	}
	public void setStrategyTitle(String strategyTitle) {
		this.strategyTitle = strategyTitle;
	}
	public String getStrategyAppropriateTime() {
		return strategyAppropriateTime;
	}
	public void setStrategyAppropriateTime(String strategyAppropriateTime) {
		this.strategyAppropriateTime = strategyAppropriateTime;
	}
	public String getStrategyAppropriateCrowd() {
		return strategyAppropriateCrowd;
	}
	public void setStrategyAppropriateCrowd(String strategyAppropriateCrowd) {
		this.strategyAppropriateCrowd = strategyAppropriateCrowd;
	}
	public String getStrategyImg() {
		return strategyImg;
	}
	public void setStrategyImg(String strategyImg) {
		this.strategyImg = strategyImg;
	}
	public int getStrategyTypeID() {
		return strategyTypeID;
	}
	public void setStrategyTypeID(int strategyTypeID) {
		this.strategyTypeID = strategyTypeID;
	}
	public String getStrategyIntro() {
		return strategyIntro;
	}
	public void setStrategyIntro(String strategyIntro) {
		this.strategyIntro = strategyIntro;
	}
	public String getStrategyEquip() {
		return strategyEquip;
	}
	public void setStrategyEquip(String strategyEquip) {
		this.strategyEquip = strategyEquip;
	}
	public String getStrategyMatters() {
		return strategyMatters;
	}
	public void setStrategyMatters(String strategyMatters) {
		this.strategyMatters = strategyMatters;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public Date getStrategyReleaseTime() {
		return strategyReleaseTime;
	}
	public void setStrategyReleaseTime(Date strategyReleaseTime) {
		this.strategyReleaseTime = strategyReleaseTime;
	}
}
