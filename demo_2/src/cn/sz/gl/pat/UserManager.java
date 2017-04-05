package cn.sz.gl.pat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManager {

	BaseDao dao = new BaseDao();
	PreparedStatement ps;
	ResultSet rs;
	public boolean getUser(String name,String pwd){
		
		//1.������
		dao.getConn();
		//2.��������
		StringBuffer sql = new StringBuffer();
		sql.append("select * from news_users where");
		sql.append("uname? and upwd=?");
		//3.sqlԤ����
		try {
			ps = dao.conn.prepareStatement(sql.toString());
			//4.���ò���
			ps.setString(1, name);
			ps.setString(2, pwd);
			//5.ִ��sql
			rs = ps.executeQuery();
			//6.������
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
