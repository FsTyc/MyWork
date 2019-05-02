package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Traveller;
import cn.travel.impl.daoImpl.TravellerDaoImpl;
import cn.travel.service.TravellerService;

public class TravellerServiceImpl implements TravellerService {
	TravellerDaoImpl travellerDaoImpl=new TravellerDaoImpl();
	@Override
	public int addTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return travellerDaoImpl.addTraveller(traveller);
	}

	@Override
	public int deleteTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return travellerDaoImpl.deleteTraveller(traveller);
	}

	@Override
	public int updateTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return travellerDaoImpl.updateTraveller(traveller);
	}

	@Override
	public List<Traveller> searchTraveller(String userName) {
		// TODO Auto-generated method stub
		return travellerDaoImpl.searchTraveller( userName);
	}

	@Override
	public Traveller travellerDetail(int travellerID) {
		// TODO Auto-generated method stub
		return travellerDaoImpl.travellerDetail(travellerID);
	}

}
