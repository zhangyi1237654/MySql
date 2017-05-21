package com.zy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zy.db.DBUtil;
import com.zy.model.Store;

/**
* @author zy007
* 
*/
public class storeDao {
	public void addStore(Store g) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = ""+
		"insert into zy_store"+
		"(store_name,price,storeClass,num,"+
		"create_user,create_date,update_user,update_date,isdel)"+
		"values(" + " ?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getStore_name());
		ptmt.setDouble(2, g.getPrice());
		ptmt.setString(3, g.getStoreClass());
		ptmt.setString(4, g.getNum());
		ptmt.setString(5, g.getCreat_user());
		ptmt.setString(6, g.getUpdate_user());
		ptmt.setInt(7, g.getIsdel());
		ptmt.execute();
	}
	
	
	public void updateStore(Store g) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = ""+
		" update zy_store"+
		" set store_name=?,price=?,storeClass=?,num=?,"+
		" update_user=?,update_date=current_date(),isdel=?"+
		" where id =?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getStore_name());
		ptmt.setDouble(2, g.getPrice());
		ptmt.setString(3, g.getStoreClass());
		ptmt.setString(4, g.getNum());
		ptmt.setString(5, g.getUpdate_user());
		ptmt.setInt(6, g.getIsdel());
		ptmt.setInt(7, g.getId());
		ptmt.execute();
	}
	public void delStore(Integer id) throws SQLException{
		Connection conn = DBUtil.getConnection();
		String sql = ""+
		" delete from zy_store"+
				
		" where id =?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ptmt.execute();
	}
	
	public List<Store> query() throws Exception{
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from zy_store");
		
		List<Store> gs = new ArrayList<>();
		Store g = null;
		while (rs.next()) {
			g = new Store();
			g.setId(rs.getInt("id"));
			g.setStore_name(rs.getString("store_name"));
			g.setStoreClass(rs.getString("StoreClass"));
			g.setPrice(rs.getDouble("price"));
			g.setNum(rs.getString("num"));
			g.setCreat_date(rs.getDate("create_date"));
			g.setCreat_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
			
			gs.add(g);
		}
		return gs;
	}
	
	public Store get(Integer id) throws SQLException{
		Store g = null;
		Connection conn = DBUtil.getConnection();
		String sql = ""+
		" select * from zy_store"+	
		" where id =?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			g = new Store();
			g.setId(rs.getInt("id"));
			g.setStore_name(rs.getString("store_name"));
			g.setStoreClass(rs.getString("storeClass"));
			g.setPrice(rs.getDouble("price"));
			g.setNum(rs.getString("num"));
			g.setCreat_date(rs.getDate("create_date"));
			g.setCreat_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
		}
		return g;
	}
	
	public List<Store> query(String name) throws Exception{
		List<Store> gs = new ArrayList<>();
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement ptmt = conn.prepareStatement("select * from zy_store where store_name like ?");
		ptmt.setString(1, "%"+name+"%");
		ResultSet rs = ptmt.executeQuery();
		
		Store g = null;
		while (rs.next()) {
			g = new Store();
			g.setId(rs.getInt("id"));
			g.setStore_name(rs.getString("store_name"));
			g.setStoreClass(rs.getString("storeClass"));
			g.setPrice(rs.getDouble("price"));
			g.setNum(rs.getString("num"));
			g.setCreat_date(rs.getDate("create_date"));
			g.setCreat_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
			
			gs.add(g);
		}
		return gs;
	}
	
	public List<Store> query(List<Map<String, Object>>params) throws Exception{
		List<Store> gs = new ArrayList<>();
		
		Connection conn = DBUtil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select * from zy_store where 1=1");
		
		if(params != null && params.size() > 0){
			for(int i = 0;i < params.size();i++){
				Map<String, Object> map = params.get(i);
				sb.append(" and "+map.get("name")+" "+map.get("rela")+map.get("value"));
			}
		}
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		Store g = null;
		while (rs.next()) {
			g = new Store();
			g.setId(rs.getInt("id"));
			g.setStore_name(rs.getString("store_name"));
			g.setStoreClass(rs.getString("storeClass"));
			g.setPrice(rs.getDouble("price"));
			g.setNum(rs.getString("num"));
			g.setCreat_date(rs.getDate("create_date"));
			g.setCreat_user(rs.getString("create_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setIsdel(rs.getInt("isdel"));
			
			gs.add(g);
		}
		return gs;
	}
}
