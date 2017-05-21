package com.zy.test;
//测试类
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zy.action.storeAction;
import com.zy.model.Store;

/**
* @author zy007
* 
*/
public class testAction {

	public static void main(String[] args) throws Exception {
		storeAction sa = new storeAction();
		/*查询
		List<Store> ls = sa.query();
		ls.forEach(System.out::println);*/
		/*增加
		Store s1 = new Store();
		s1.setStore_name("百事可乐 250ml");
		s1.setPrice(3.5);
		s1.setStoreClass("饮料");
		s1.setNum("A0001");
		s1.setCreat_user("zhangyi");
		s1.setCreat_date(new Date());
		s1.setUpdate_user("zhangyi");
		s1.setUpdate_date(new Date());
		s1.setIsdel(1);
		
		sa.add(s1);*/
		List<Map<String, Object>> params = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "store_name");
		map.put("rela", "=");
		map.put("value", "'百事可乐 250ml'");
		params.add(map);
		
		List<Store> list = sa.query(params);
		list.forEach(System.out::println);
	}

}
