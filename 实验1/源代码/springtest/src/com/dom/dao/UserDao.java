package com.dom.dao;
import java.sql.*;
import javax.sql.*;
import javax.naming.*; 
import com.dom.model.*;
public class UserDao {
	//private static final String GET_ONE_SQL = "SELECT * FROM usertable WHERE username=? and password=?";
	private static final String GET_ONE_SQL = "SELECT * FROM usertable WHERE username=? and password=? and type=?";
	private static final String GET_TWO_SQL = "SELECT * FROM usertable WHERE username=?";
	public UserDao( ){ }
	public Connection getConnection(){ 
		Connection conn = null; 
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String dburl = "jdbc:mysql://localhost:3306/springtest?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai"; 
		String username = "root"; //数据库登录用户名 
		String password = "cjk33014423"; //数据库登录密码 
		try{ 
			Class.forName(driver); //加载数据库驱动程序 
			conn = DriverManager.getConnection(dburl,username,password); 
			}
		catch( Exception e ){e.printStackTrace(); } 
		return conn; 
	}
	
	public boolean searchUser(UserBean user){
		// 按用户名和密码校验用户是否合法 
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rst=null; 
		try{
			conn = getConnection(); 
			pstmt = conn.prepareStatement(GET_ONE_SQL); 
			pstmt.setString(1, user.getUsername()); 
			pstmt.setString(2, user.getPassword()); 
			pstmt.setInt(3, user.getType());
			rst = pstmt.executeQuery(); 
			if(rst.next()){ 
				return true; 
				} 
			}catch(SQLException se){ 
				se.printStackTrace(); 
				return false; 
			}finally{ 
				try{
					pstmt.close(); 
					conn.close(); 
			}catch(SQLException se){ se.printStackTrace(); } 
		}
		return false; 
	}
	public boolean searchUser2(UserBean user){
		//查找是否已经存在该用户，用于新的用户注册时使用
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rst=null; 
		try{
			conn = getConnection(); 
			pstmt = conn.prepareStatement(GET_TWO_SQL); 
			pstmt.setString(1, user.getUsername()); 
			rst = pstmt.executeQuery(); 
			if(rst.next()){ 
				return true; 
				} 
			}catch(SQLException se){ 
				se.printStackTrace(); 
				return false; 
			}finally{ 
				try{
					pstmt.close(); 
					conn.close(); 
			}catch(SQLException se){ se.printStackTrace(); } 
		}
		return false; 
	}
	public void insertUser(UserBean user) {
		Connection conn = null; 
		try{
			conn = getConnection(); 
			Statement st = conn.createStatement(); 
			String sql="INSERT INTO usertable VALUES('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getType()+"')";
			//添加用户的sql语句
			st.executeUpdate(sql); 
			}catch(SQLException se){ 
				se.printStackTrace(); 
			}finally{ 
				try{
					conn.close(); 
			}catch(SQLException se){ se.printStackTrace(); } 
		}
	}
}