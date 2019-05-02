package cn.travel.impl.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.travel.dao.TravellerDao;
import cn.travel.entity.Traveller;
import cn.travel.util.BaseDao;


public class TravellerDaoImpl extends BaseDao implements TravellerDao {

	@Override
	public List<Traveller> searchTraveller(String userName) {
		String sql="SELECT * FROM `traveller`WHERE `userName`=?";
		ResultSet rs=super.executeQuery(sql,userName);
		List<Traveller> list=new ArrayList<Traveller>();
		try {
			while(rs.next()){
				Traveller traveller=new Traveller();
				traveller.setTravellerTitle(rs.getString("travellerTitle"));
				traveller.setTravellerReleaseTime(rs.getDate("travellerReleaseTime"));
				traveller.setUserName(rs.getString("userName"));
				traveller.setTravellerStartingTime(rs.getDate("travellerStartingTime"));
				traveller.setTravellerEndTime(rs.getDate("travellerEndTime"));
				traveller.setPhone(rs.getString("phone"));
				traveller.setTravellerDestination(rs.getString("travellerDestination"));
				traveller.setTravellerContent(rs.getString("travellerContent"));
				traveller.setTravellerID(rs.getInt("travellerID"));
				list.add(traveller);
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
	public int addTraveller(Traveller traveller) {
		StringBuilder sqls = new StringBuilder();
		sqls.append("INSERT INTO `traveller`");
		sqls.append("(`travellerTitle`,`travellerReleaseTime`,");
		sqls.append("`userName`,`travellerStartingTime`,");
		sqls.append("`travellerEndTime`,`phone`,");
		sqls.append("`travellerDestination`,`travellerContent`)");
		sqls.append("VALUES (?,?,?,?,?,?,?,?)");
		String sql=sqls.toString();
		 String travellerTitle=traveller.getTravellerTitle();
		 Date travellerReleaseTime=traveller.getTravellerReleaseTime();
		 String userName=traveller.getUserName();
		 Date travellerStartingTime=traveller.getTravellerStartingTime();
		 Date travellerEndTime=traveller.getTravellerEndTime();
		 String phone=traveller.getPhone();
		 String travellerDestination=traveller.getTravellerDestination();
		 String travellerContent=traveller.getTravellerContent();
		int num=super.executeUpdate(sql,travellerTitle,travellerReleaseTime,userName,travellerStartingTime,travellerEndTime,phone,travellerDestination,travellerContent);
		return num;
	}

	@Override
	public int deleteTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Traveller travellerDetail(int travellerID) {
		String sql="SELECT * FROM `traveller`WHERE `travellerID`=?";
		ResultSet rs=super.executeQuery(sql,travellerID);
		Traveller traveller=new Traveller();
		try {
			rs.next();
				traveller.setTravellerTitle(rs.getString("travellerTitle"));
				traveller.setTravellerReleaseTime(rs.getDate("travellerReleaseTime"));
				traveller.setUserName(rs.getString("userName"));
				traveller.setTravellerStartingTime(rs.getDate("travellerStartingTime"));
				traveller.setTravellerEndTime(rs.getDate("travellerEndTime"));
				traveller.setPhone(rs.getString("phone"));
				traveller.setTravellerDestination(rs.getString("travellerDestination"));
				traveller.setTravellerContent(rs.getString("travellerContent"));
				traveller.setTravellerID(rs.getInt("travellerID"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.allClose(connection, statement, rs);
		}
		return traveller;
	}

}
