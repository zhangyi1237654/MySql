package com.zy.action;

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
		List<Goddess> gs = g.query();
//		for (Goddess goddess : gs) {
//			System.out.println(goddess.getUser_name()+","+goddess.getAge());
//		}
		gs.forEach(t ->System.out.println(t.getUser_name()+","+t.getAge()));
	}

}
