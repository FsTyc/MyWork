package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.StrategyType;
import cn.travel.impl.daoImpl.StrategyTypeDaoImpl;
import cn.travel.service.StrategyTypeService;

public class StrategyTypeServiceImpl implements StrategyTypeService {
	StrategyTypeDaoImpl strategyTypeDaoImpl=new StrategyTypeDaoImpl();
	@Override
	public int addStrategyType(StrategyType strategyType) {
		// TODO Auto-generated method stub
		return strategyTypeDaoImpl.addStrategyType(strategyType);
	}

	@Override
	public int deleteStrategyType(StrategyType strategyType) {
		// TODO Auto-generated method stub
		return strategyTypeDaoImpl.deleteStrategyType(strategyType);
	}

	@Override
	public int updateStrategyType(StrategyType strategyType) {
		// TODO Auto-generated method stub
		return strategyTypeDaoImpl.updateStrategyType(strategyType);
	}

	@Override
	public List<StrategyType> searchStrategyType() {
		// TODO Auto-generated method stub
		return null;
	}

}
