package cn.travel.impl.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.travel.dao.AdminDao;
import cn.travel.entity.Admin;
import cn.travel.util.BaseDao;

public class AdminDaoImpl extends BaseDao implements AdminDao {


	@Override
	public List<AdminDao> searchAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addAdmin(Admin admin) {
		String sql ="INSERT INTO `admin`(`adminName`,`adminPwd`) VALUES (?,?)";
		 String adminName=admin.getAdminName(); 
		 String adminPwd=admin.getAdminPwd(); 
		 int num=super.executeUpdate(sql, adminName,adminPwd);
		return num;
	}

	@Override
	public int deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int adminLogin(Admin admin) {
		String sql ="SELECT COUNT(*) FROM `admin` WHERE `adminName`=?AND`adminPwd`=?";
		 String adminName=admin.getAdminName(); 
		 String adminPwd=admin.getAdminPwd(); 
		 ResultSet rs=super.executeQuery(sql, adminName,adminPwd);
		int num=0;
		try {
			rs.next();
			num=rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.allClose(connection, statement, rs);
		}
		return num;
	}

}
