package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Strategy;
import cn.travel.impl.daoImpl.StrategyDaoImpl;
import cn.travel.service.StrategyService;

public class StrategyServiceImpl implements StrategyService {
	StrategyDaoImpl strategyDaoImpl=new StrategyDaoImpl();
	@Override
	public int addStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		return strategyDaoImpl.addStrategy(strategy);
	}

	@Override
	public int deleteStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		return strategyDaoImpl.deleteStrategy(strategy);
	}

	@Override
	public int updateStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		return strategyDaoImpl.updateStrategy(strategy);
	}

	@Override
	public List<Strategy> searchStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

}
