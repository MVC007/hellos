package cn.sz.gl.pat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManager {

	BaseDao dao = new BaseDao();
	PreparedStatement ps;
	ResultSet rs;
	public boolean getUser(String name,String pwd){
		
		//1.打开连接
		dao.getConn();
		//2.创建连接
		StringBuffer sql = new StringBuffer();
		sql.append("select * from news_users where");
		sql.append("uname? and upwd=?");
		//3.sql预处理
		try {
			ps = dao.conn.prepareStatement(sql.toString());
			//4.设置参数
			ps.setString(1, name);
			ps.setString(2, pwd);
			//5.执行sql
			rs = ps.executeQuery();
			//6.处理结果
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
