package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Apply;
import cn.travel.impl.daoImpl.ApplyDaoImpl;
import cn.travel.service.AppleService;

public class ApplyServiceImpl implements AppleService {
	ApplyDaoImpl applyDaoImpl=new ApplyDaoImpl();
	@Override
	public int addApply(Apply apply) {
		// TODO Auto-generated method stub
		return applyDaoImpl.addApply(apply);
	}

	@Override
	public int deleteApply(Apply apply) {
		// TODO Auto-generated method stub
		return applyDaoImpl.deleteApply(apply);
	}

	@Override
	public int updateApply(Apply apply) {
		// TODO Auto-generated method stub
		return applyDaoImpl.updateApply(apply);
	}

	@Override
	public List<Apply> searchApply() {
		// TODO Auto-generated method stub
		return null;
	}

}
