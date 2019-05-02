package cn.travel.service;

import java.util.List;

import cn.travel.entity.Strategy;

public interface StrategyService {
	public int addStrategy(Strategy strategy);

	public int deleteStrategy(Strategy strategy);

	public int updateStrategy(Strategy strategy);

	public List<Strategy> searchStrategy();
}
