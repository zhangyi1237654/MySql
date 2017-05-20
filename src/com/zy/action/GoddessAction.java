package com.zy.action;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

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
		
		/*List<Goddess> gs = g.query();
		for (Goddess goddess : gs) {
			System.out.println(goddess.getUser_name()+","+goddess.getAge());
		}
		gs.forEach(t ->System.out.println(t.getUser_name()+","+t.getAge()));*/
		
		Goddess g1 = new Goddess();
		g1.setUser_name("小夏");
		g1.setAge(24);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("123456@163.com");
		g1.setMobile("18944562213");
		g1.setUpdate_user("ADMIN");
		g1.setIsdel(1);
		g1.setId(3);
		
		//g.delGoddess(2);
		//g.addGoddess(g1);
		//g.updateGoddess(g1);
		Goddess g2 = g.get(3);
		System.out.println(g2.toString());
	}

}
