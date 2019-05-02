package cn.travel.service;

import java.util.List;

import cn.travel.entity.Admin;

public interface AdminService {
	public int addAdmin(Admin admin);

	public int deleteAdmin(Admin admin);

	public int updateAdmin(Admin admin);

	public List<Admin> searchAdmin();
	public int adminLogin(Admin admin);
}
