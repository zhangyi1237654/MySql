package com.zy.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.omg.Messaging.SyncScopeHelper;

import com.zy.dao.GoddessDao;
import com.zy.model.Goddess;

/**
* @author zy007
* 
*/
public class GoddessAction {

	public static void main(String[] args) throws Exception {
		GoddessDao g = new GoddessDao();
		//调用查询方法
		List<Map<String, Object>> params = new ArrayList<>();
		Map<String, Object> param = new HashMap<>();
		
		param.put("name", "user_name");
		param.put("rela", "like");
		param.put("value", "'%小张%'");
		params.add(param);
		List<Goddess> result = g.query(params);
		result.forEach(System.out::println);
		//List<Goddess> gs = g.query("张");
		
//		for (Goddess goddess : gs) {
//			System.out.println(goddess.toString());
//		}
		//gs.forEach(System.out::println);
		
//		Goddess g1 = new Goddess();
//		g1.setUser_name("小张");
//		g1.setAge(22);
//		g1.setSex(2);
//		g1.setBirthday(new Date());
//		g1.setEmail("123456@163.com");
//		g1.setMobile("18944562213");
//		g1.setCreat_user("ADMIN");
//		g1.setUpdate_user("ADMIN");
//		g1.setIsdel(1);
		//g1.setId(3);
		
		//g.delGoddess(1);
		//g.addGoddess(g1);
		//g.updateGoddess(g1);
		//Goddess g2 = g.get(3);
		//System.out.println(g2.toString());
	}

}
