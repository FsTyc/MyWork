package cn.travel.util;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class BaseDao {
	protected Connection connection = null;
	protected Statement statement = null;
	protected ResultSet rs = null;
	protected PreparedStatement ps = null;
	private static String driver = "";
	private static String url = "";
	private static String root = "";
	private static String pwd = "";

	static {
		ConfigManger.getInstance();
		driver = ConfigManger.getString("driver");
		url = ConfigManger.getString("url");
		root = ConfigManger.getString("root");
		pwd = ConfigManger.getString("pwd");

	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, root, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}
	
	public int executeUpdate(String sql, Object... objects) {
		int num = 0;
		connection = getConnection();
		try {
			ps = connection.prepareStatement(sql);
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					ps.setObject((i + 1), objects[i]);
				}
			}
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			allClose(connection, ps, null);
		}
		return num;
	}
	
	public void allClose(Connection conn, Statement statement, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String sql, Object... objects) {
		connection = getConnection();
		try {
			ps = connection.prepareStatement(sql);
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					ps.setObject((i + 1), objects[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	
}
