package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.State;
import cn.travel.impl.daoImpl.StateDaoImpl;
import cn.travel.service.StateService;

public class StateServiceImpl implements StateService {
	StateDaoImpl stateDaoImpl=new StateDaoImpl();
	@Override
	public int addState(State state) {
		// TODO Auto-generated method stub
		return stateDaoImpl.addState(state);
	}

	@Override
	public int deleteState(State state) {
		// TODO Auto-generated method stub
		return stateDaoImpl.deleteState(state);
	}

	@Override
	public int updateState(State state) {
		// TODO Auto-generated method stub
		return stateDaoImpl.updateState(state);
	}

	@Override
	public List<State> searchState() {
		// TODO Auto-generated method stub
		return null;
	}

}
