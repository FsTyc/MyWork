package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Apply;

public interface ApplyDao {
	public int addApply(Apply apply);
	public int deleteApply(Apply apply);
	public int updateApply(Apply apply);
	public List<Apply> searchApply();
}
