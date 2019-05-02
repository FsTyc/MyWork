package cn.travel.dao;

import java.util.List;

import cn.travel.entity.State;

public interface StateDao {
	public int addState(State state);

	public int deleteState(State state);

	public int updateState(State state);

	public List<State> searchState();
}

