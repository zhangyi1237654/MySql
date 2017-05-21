package com.zy.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.zy.action.storeAction;
import com.zy.model.Store;

/**
* @author zy007
* 
*/
public class View {

	private static final String CONTEXT = 
	"欢迎来到小商城：\n" 
	+ "下面是小商城的功能列表：\n"
	+ "[MAIN/M]:主菜单\n"
	+ "[QUERY/Q]:查看全部商品的信息\n"
	+ "[GET/G]:查看某个商品的详细信息\n" 
	+ "[ADD/A]:添加商品信息\n" 
	+ "[UPDATE/U]:更新商品信息\n" 
	+ "[DELETE/D]:删除商品信息\n"
	+ "[SEARCH/S]:查询商品信息(根据商品名、编号来查询)\n" 
	+ "[EXIT/E]:退出小商城\n"
	+ "[BREAK/B]:退出当前功能，返回主菜单";

	private static final String OPERATION_MAIN = "MAIN";//1
	private static final String OPERATION_QUERY = "QUERY";//1
	private static final String OPERATION_GET = "GET";//1
	private static final String OPERATION_ADD = "ADD";//1
	private static final String OPERATION_UPDATE = "UPDATE";//1
	private static final String OPERATION_DELETE = "DELETE";//1
	private static final String OPERATION_SEARCH = "SEARCH";//1
	private static final String OPERATION_EXIT = "EXIT";//1
	private static final String OPERATION_BREAK = "BREAK";//1

	private static String str1;
	private static String str2;
	private static String str3;

	public static void main(String[] args) {

		System.out.println(CONTEXT);

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		Store store = new Store();
		storeAction action = new storeAction();
		String prenious = null;//记忆变量
		Integer step = 1;
		while (scan.hasNext()) {
			String in = scan.next();
			if (OPERATION_EXIT.equals(in.toUpperCase()) || OPERATION_EXIT.substring(0, 1).equals(in.toUpperCase())) {
				System.out.println("您已经成功退出商城~欢迎下次光临~");
				break;
				//高级搜索
			} else if (OPERATION_SEARCH.equals(in.toUpperCase())
					|| OPERATION_SEARCH.substring(0, 1).equals(in.toUpperCase()) || OPERATION_SEARCH.equals(prenious)) {

				prenious = OPERATION_SEARCH;

				if (OPERATION_BREAK.equals(in.toUpperCase())
						|| OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
					System.out.println("退出当前功能，返回主菜单");
					prenious = OPERATION_MAIN;
					step = 1;
					continue;
				}

				List<Map<String, Object>> params = new ArrayList<>();

				Map<String, Object> map = new HashMap<>();

				if (1 == step) {
					System.out.println("请输入查询[类型]:");
				} else if (2 == step) {
					str1 = in;
					System.out.println("请输入查询[方式]:");
				} else if (3 == step) {
					str2 = in;
					System.out.println("请输入查询[信息]:");

				} else if (4 == step) {
					str3 = in;
					map.put("name", str1);
					map.put("rela", str2);
					map.put("value", str3);
					try {
						params.add(map);
						List<Store> list = action.query(params);
						list.forEach(System.out::println);
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("查找失败");
					}
				}
				if (OPERATION_SEARCH.equals(prenious)) {
					step++;
				}

				//删除商品
			} else if (OPERATION_DELETE.equals(in.toUpperCase())
					|| OPERATION_DELETE.substring(0, 1).equals(in.toUpperCase()) || OPERATION_DELETE.equals(prenious)) {
				prenious = OPERATION_DELETE;

				if (OPERATION_BREAK.equals(in.toUpperCase())
						|| OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
					System.out.println("退出当前功能，返回主菜单");
					prenious = OPERATION_MAIN;
					step = 1;
					continue;
				}

				if (1 == step) {
					System.out.println("请输入商品的ID:");
				} else if (2 == step) {
					try {
						action.del(Integer.valueOf(in));
						System.out.println("删除商品成功");

					} catch (NumberFormatException e) {
						e.printStackTrace();
						System.out.println("删除商品失败");
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("删除商品失败");
					}
				}
				if (OPERATION_DELETE.equals(prenious)) {
					step++;
				}

				//更新商品
			} else if (OPERATION_UPDATE.equals(in.toUpperCase())
					|| OPERATION_UPDATE.substring(0, 1).equals(in.toUpperCase()) || OPERATION_UPDATE.equals(prenious)) {

				prenious = OPERATION_UPDATE;

				if (OPERATION_BREAK.equals(in.toUpperCase())
						|| OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
					System.out.println("退出当前功能，返回主菜单");
					prenious = OPERATION_MAIN;
					step = 1;
					continue;
				}

				if (1 == step) {
					System.out.println("请输入商品的[ID]:");
				} else if (2 == step) {
					store.setId(Integer.valueOf(in));
					System.out.println("请输入商品的[名字]:");
				} else if (3 == step) {
					store.setStore_name(in);
					System.out.println("请输入商品的[价格]:");
				} else if (4 == step) {
					store.setPrice(Integer.valueOf(in));
					System.out.println("请输入商品的[类型]:");
				} else if (5 == step) {
					store.setStoreClass(in);
					System.out.println("请输入商品的[编号]:");
				} else if (6 == step) {
					store.setNum(in);
					try {
						action.edit(store);
						System.out.println("修改信息成功");

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("修改信息失败");
					}
				}

				if (OPERATION_UPDATE.equals(prenious)) {
					step++;
				}

			} else if (OPERATION_GET.equals(in.toUpperCase()) || OPERATION_GET.substring(0, 1).equals(in.toUpperCase())
					|| OPERATION_GET.equals(prenious)) {
				prenious = OPERATION_GET;

				if (OPERATION_BREAK.equals(in.toUpperCase())
						|| OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
					System.out.println("退出当前功能，返回主菜单");
					prenious = OPERATION_MAIN;
					step = 1;
					continue;
				}

				if (1 == step) {
					System.out.println("请输入商品的ID:");
				} else if (2 == step) {
					try {
						store = action.get(Integer.valueOf(in));
						System.out.println(store);
						step = 1;
					} catch (NumberFormatException e) {
						e.printStackTrace();
						System.out.println("输入的ID有误");
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("输入的ID有误");
					}
				}
				if (OPERATION_GET.equals(prenious)) {
					step++;
				}
				//全部查询	
			} else if (OPERATION_QUERY.equals(in.toUpperCase())
					|| OPERATION_QUERY.substring(0, 1).equals(in.toUpperCase())) {
				try {
					List<Store> list = action.query();
					list.forEach(System.out::println);

				} catch (Exception e) {
					e.printStackTrace();
				}
				//返回主菜单	
			} else if (OPERATION_MAIN.equals(in.toUpperCase())
					|| OPERATION_MAIN.substring(0, 1).equals(in.toUpperCase())) {
				System.out.println(
				"欢迎来到小商城：\n" 
				+ "下面是小商城的功能列表：\n"
				+ "[MAIN/M]:主菜单\n"
				+ "[QUERY/Q]:查看全部商品的信息\n"
				+ "[GET/G]:查看某个商品的详细信息\n" 
				+ "[ADD/A]:添加商品信息\n" 
				+ "[UPDATE/U]:更新商品信息\n" 
				+ "[DELETE/D]:删除商品信息\n"
				+ "[SEARCH/S]:查询商品信息(根据商品名、编号来查询)\n" 
				+ "[EXIT/E]:退出小商城\n"
				+ "[BREAK/B]:退出当前功能，返回主菜单");
				//新增商品		
			} else if (OPERATION_ADD.equals(in.toUpperCase()) || OPERATION_ADD.substring(0, 1).equals(in.toUpperCase())
					|| OPERATION_ADD.equals(prenious)) {

				prenious = OPERATION_ADD;

				if (OPERATION_BREAK.equals(in.toUpperCase())
						|| OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
					System.out.println("退出当前功能，返回主菜单");
					prenious = OPERATION_MAIN;
					step = 1;
					continue;
				}

				if (1 == step) {
					System.out.println("请输入商品的[名字]:");
				} else if (2 == step) {
					store.setStore_name(in);
					System.out.println("请输入商品的[价格]:");
				} else if (3 == step) {
					store.setPrice(Integer.valueOf(in));
					System.out.println("请输入商品的[类型]:");
				} else if (4 == step) {
					store.setStoreClass(in);
					System.out.println("请输入商品的[编号]:");
				} else if (5 == step) {
					store.setNum(in);
					try {
						action.add(store);
						System.out.println("创建商品成功");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("创建商品失败");
					}
				}
				if (OPERATION_ADD.equals(prenious)) {
					step++;
				}

			} else {
				System.out.println("您输入的值为:" + in);
			}
		}

	}
}
