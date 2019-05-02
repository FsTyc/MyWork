package cn.travel.impl.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.travel.dao.UserDao;
import cn.travel.entity.User;
import cn.travel.util.BaseDao;



public class UserDaoImpl extends BaseDao implements UserDao {

	
	@Override
	public List<User> searchUser() {
		String sql ="SELECT * FROM `user` u,`state` s WHERE (u.`stateID`=s.`stateID`)"; 
		 ResultSet rs=super.executeQuery(sql);
		 List<User> userList=new ArrayList<User>();
		try {
			while(rs.next()){
				User user=new User();
				user.setBirthday(rs.getDate("birthday"));
				user.setUserName(rs.getString("userName"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setQq(rs.getString("qq")) ;
				user.setPhone(rs.getString("phone")); 
				user.setLocation(rs.getString("location")); 
				user.setHobby(rs.getString("hobby"))  ; 
				user.setResume(rs.getString("resume"))  ; 
				user.setTravelCount(rs.getInt("travelCount")) ; 
				user.setMemoryCount(rs.getInt("memoryCount")) ; 
				user.setState(rs.getString("stateType"));
				userList.add(user);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.allClose(connection, statement, rs);
		}
		return userList;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		String sql="UPDATE `user` SET `userPwd`=? WHERE `userName`=?";
		String userPwd=user.getUserPwd();
		String userName=user.getUserName();
		int num=super.executeUpdate(sql,userPwd,userName);
		return num;
	
	}

	@Override
	public int login(User user) {
		String sql ="SELECT COUNT(*) FROM `user` WHERE `userName`=?AND`userPwd`=?";
		 String userName=user.getUserName(); 
		 String userPwd=user.getUserPwd(); 
		 ResultSet rs=super.executeQuery(sql, userName,userPwd);
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

	@Override
	public int register(User user) {
		String sql="INSERT INTO `user`(`userName`,`userPwd`,`email`) VALUES (?,?,?)";
		String userName=user.getUserName(); 
		 String userPwd=user.getUserPwd(); 
		 String email=user.getEmail(); 
		int num= super.executeUpdate(sql,userName ,userPwd,email);
		return num;
	
	}

	@Override
	public int addAcccountDetail(User user) {
		StringBuilder sqls = new StringBuilder();
		sqls.append("UPDATE `user` SET ");
		sqls.append("`sex`=?,`birthday`=?, ");
		sqls.append("`qq`=?,`phone`=?,");
		sqls.append("`location`=?,`hobby`=?,");
		sqls.append("`resume`=? WHERE `userName`=?");	
		String sql=sqls.toString();
		 String sex=user.getSex(); 
		 Date birthday=user.getBirthday(); 
		 String qq=user.getQq(); 
		 String phone=user.getPhone(); 
		 String location=user.getLocation(); 
		 String hobby=user.getHobby(); 
		 String resume=user.getResume();
		 String userName=user.getUserName();
		int num= super.executeUpdate(sql,sex,birthday,qq,phone,location,hobby,resume,userName);
		return num;
	}

	@Override
	public int passwordChange(User user) {
		String sql="UPDATE `user` SET `userPwd`=? WHERE `userName`=?";
		String userPwd=user.getUserPwd();
		String userName=user.getUserName();
		int num=super.executeUpdate(sql,userPwd,userName);
		return num;
	}

	@Override
	public User searchUser(String userName) {
		String sql ="SELECT * FROM `user` u,`state` s WHERE (u.`stateID`=s.`stateID`&&`userName`=?)"; 
		 ResultSet rs=super.executeQuery(sql,userName);
		 User user=new User();
		try {
			rs.next();
				user.setBirthday(rs.getDate("birthday"));
				user.setUserName(rs.getString("userName"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setQq(rs.getString("qq")) ;
				user.setPhone(rs.getString("phone")); 
				user.setLocation(rs.getString("location")); 
				user.setHobby(rs.getString("hobby"))  ; 
				user.setResume(rs.getString("resume"))  ; 
				user.setTravelCount(rs.getInt("travelCount")) ; 
				user.setMemoryCount(rs.getInt("memoryCount")) ; 
				user.setState(rs.getString("stateType"));			
				user.setLoginTime(rs.getDate("loginTime")) ;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.allClose(connection, statement, rs);
		}
		return user;
	}

	@Override
	public int updateUser(Date loginTime ,String userName ) {
		String sql="UPDATE `user` SET `loginTime`=? WHERE `userName`=?";
		int num=super.executeUpdate(sql,loginTime,userName);
		return num;
	}

	@Override
	public int updateTravelCount( String userName) {
		String sql="UPDATE `user`SET`travelCount`=`travelCount`+1 WHERE `userName`=?";
		int num=super.executeUpdate(sql,userName);
		return num;
	}

}
