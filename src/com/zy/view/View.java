package com.zy.view;

/**
* @author zy007
* 
*/
public class View {
	private static final String CONTEXT = "欢迎来到小商城：\n下面是小商城的功能列表：\n[MAIN/M]:主菜单\n[QUERY/Q]:查看全部商品的信息\n[GET/G]:查看某个商品的详细信息\n[ADD/A]:添加商品信息\n[UPDATE/U]:更新商品信息\n[DELETE/D]:删除商品信息\n[SEARCH/S]:查询商品信息(根据商品名、编号来查询)\n[EXIT/E]:退出小商城\n[BREAK/B]:退出当前功能，返回主菜单";
	private static final String OPERATION_MAIN = "MAIN";
	private static final String OPERATION_QUERY = "QUERY";
	private static final String OPERATION_GET = "GET";
	private static final String OPERATION_ADD = "ADD";
	private static final String OPERATION_UPDATE = "UPDATE";
	private static final String OPERATION_DELETE = "DELETE";
	private static final String OPERATION_SEARCH = "SEARCH";
	private static final String OPERATION_EXIT = "EXIT";
	private static final String OPERATION_BREAK = "BREAK";

	public static void main(String[] args) {
		System.out.println(
				"欢迎来到小商城：\n下面是小商城的功能列表：\n[MAIN/M]:主菜单\n[QUERY/Q]:查看全部商品的信息\n[GET/G]:查看某个商品的详细信息\n[ADD/A]:添加商品信息\n[UPDATE/U]:更新商品信息\n[DELETE/D]:删除商品信息\n[SEARCH/S]:查询商品信息(根据商品名、编号来查询)\n[EXIT/E]:退出小商城\n[BREAK/B]:退出当前功能，返回主菜单");
	}
}
