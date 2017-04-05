package cn.sz.gl.pat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	
	private String url = "jdbc:mysql://192.168.1.88:3306/news";
	private String uname = "root";
	private String upwd = "root";
	public Connection conn;
	
	public void getConn(){
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建连接
			conn = DriverManager.getConnection(url, uname, upwd);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConn(){
		try {
			if(conn!=null){
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			
		}
	}
}
