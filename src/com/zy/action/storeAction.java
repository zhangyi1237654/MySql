package com.zy.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.zy.dao.storeDao;
import com.zy.model.Store;

/**
* @author zy007
* 
*/
public class storeAction {

	public void add(Store store) throws Exception {
		storeDao dao = new storeDao();
		dao.addStore(store);
	}

	public List<Store> query() throws Exception {
		storeDao dao = new storeDao();
		return dao.query();
	}

	public void del(Integer id) throws SQLException {
		storeDao dao = new storeDao();
		dao.delStore(id);
	}

	public void edit(Store store) throws Exception {
		storeDao dao = new storeDao();
		dao.updateStore(store);

	}

	public List<Store> query(List<Map<String, Object>> params) throws Exception {
		storeDao dao = new storeDao();
		return dao.query(params);
	}

	public Store get(Integer id) throws SQLException {
		storeDao dao = new storeDao();
		return dao.get(id);
	}

}
