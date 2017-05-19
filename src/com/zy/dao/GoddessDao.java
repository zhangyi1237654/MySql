package com.zy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zy.db.DBUtil;
import com.zy.model.Goddess;

/**
* @author zy007
* 
*/
public class GoddessDao {
	public void addGoddess(){
		
	}
	
	public void updateGoddess(){
		
	}
	public void delGoddess(){
		
	}
	
	public List<Goddess> query() throws Exception{
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		
		List<Goddess> gs = new ArrayList<>();
		Goddess g = null;
		while (rs.next()) {
			g = new Goddess();
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			gs.add(g);
		}
		return gs;
	}
	
	public Goddess get(){
		return null;
	}
}
