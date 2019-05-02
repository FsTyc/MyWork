package cn.travel.impl.serviceImpl;

import java.util.List;

import cn.travel.entity.Admin;
import cn.travel.impl.daoImpl.AdminDaoImpl;
import cn.travel.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDaoImpl adminDaoImpl=new AdminDaoImpl();
	@Override
	public int addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDaoImpl.addAdmin(admin);
	}

	@Override
	public int deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDaoImpl.deleteAdmin(admin);
	}

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDaoImpl.updateAdmin(admin);
	}

	@Override
	public List<Admin> searchAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDaoImpl.adminLogin(admin);
	}

}
