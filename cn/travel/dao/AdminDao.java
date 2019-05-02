package cn.travel.dao;

import java.util.List;
import cn.travel.entity.Admin;

public interface AdminDao {
	public int addAdmin(Admin admin);

	public int deleteAdmin(Admin admin);

	public int updateAdmin(Admin admins);

	public List<AdminDao> searchAdmin();
	public int adminLogin(Admin admin);
	

	
}
