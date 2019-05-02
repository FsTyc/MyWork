package cn.travel.impl.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.travel.dao.UserStateDao;
import cn.travel.entity.Traveller;
import cn.travel.entity.UserState;
import cn.travel.util.BaseDao;

public class UserStateDaoImpl extends BaseDao implements UserStateDao {

	
	

	@Override
	public List<UserState> searchUserState(String userName) {
		String sql="SELECT * FROM `userstate`WHERE `userName`=?";
		ResultSet rs=super.executeQuery(sql,userName);
		List<UserState> list=new ArrayList<UserState>();
		try {
			while(rs.next()){
				UserState userState=new UserState();
				userState.setUserName(userName);
				userState.setStateComment(rs.getString("stateComment"));
				userState.setUserStateTime(rs.getDate("userStateTime"));
				userState.setUserStateID(rs.getInt("userStateID"));
				list.add(userState);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.allClose(connection, statement, rs);
		}
		Collections.reverse(list);
		return list;
	}

	@Override
	public int addUserState(UserState userState) {
		String sql="INSERT INTO `userstate`(`userName`,`userStateTime`,`stateComment`) VALUES (?,?,?)";
		String userName=userState.getUserName(); 
		Date userStateTime=userState.getUserStateTime();
		String stateComment=userState.getStateComment(); 
		int num= super.executeUpdate(sql,userName ,userStateTime,stateComment);
		return num;
	}

	@Override
	public int deleteUserState(UserState userState) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserState(UserState userState) {
		// TODO Auto-generated method stub
		return 0;
	}

}
