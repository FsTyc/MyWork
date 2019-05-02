package cn.travel.dao;

import java.util.List;

import cn.travel.entity.Traveller;

public interface TravellerDao {
	public int addTraveller(Traveller traveller);

	public int deleteTraveller(Traveller traveller);

	public int updateTraveller(Traveller traveller);

	public List<Traveller> searchTraveller(String userName);
	public Traveller travellerDetail(int travellerID);
}
