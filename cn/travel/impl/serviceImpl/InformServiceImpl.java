package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Inform;
import cn.travel.impl.daoImpl.InformDaoImpl;
import cn.travel.service.InformService;

public class InformServiceImpl implements InformService {
	InformDaoImpl informDaoImpl=new InformDaoImpl();
	
	@Override
	public int addInform(Inform inform) {
		// TODO Auto-generated method stub
		return informDaoImpl.addInform(inform);
	}

	@Override
	public int deleteInform(Inform inform) {
		// TODO Auto-generated method stub
		return informDaoImpl.deleteInform(inform);
	}

	@Override
	public int updateInform(Inform inform) {
		// TODO Auto-generated method stub
		return informDaoImpl.updateInform(inform);
	}

	@Override
	public List<Inform> searchInform() {
		// TODO Auto-generated method stub
		return null;
	}

}
