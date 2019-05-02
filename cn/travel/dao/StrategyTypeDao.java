package cn.travel.dao;

import java.util.List;

import cn.travel.entity.StrategyType;

public interface StrategyTypeDao {
	public int addStrategyType(StrategyType strategyType);

	public int deleteStrategyType(StrategyType strategyType);

	public int updateStrategyType(StrategyType strategyType);

	public List<StrategyType> searchStrategyType();
}
