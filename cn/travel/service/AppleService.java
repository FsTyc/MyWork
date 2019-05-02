package cn.travel.service;

import java.util.List;

import cn.travel.entity.Apply;

public interface AppleService {
	public int addApply(Apply apply);
	public int deleteApply(Apply apply);
	public int updateApply(Apply apply);
	public List<Apply> searchApply();
}
