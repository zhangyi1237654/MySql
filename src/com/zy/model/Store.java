package com.zy.model;

/**
* @author zy007
* 
*/
import java.util.Date;

public class Store {
	private int id;
	private String store_name;
	private double price;
	private String storeClass;
	private String num;
	private String creat_user;
	private Date creat_date;
	private Date update_date;
	private String update_user;
	private int isdel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStoreClass() {
		return storeClass;
	}

	public void setStoreClass(String storeClass) {
		this.storeClass = storeClass;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCreat_user() {
		return creat_user;
	}

	public void setCreat_user(String creat_user) {
		this.creat_user = creat_user;
	}

	public Date getCreat_date() {
		return creat_date;
	}

	public void setCreat_date(Date creat_date) {
		this.creat_date = creat_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", store_name=" + store_name + ", price=" + price + ", storeClass=" + storeClass
				+ ", num=" + num + ", creat_user=" + creat_user + ", creat_date=" + creat_date + ", update_date="
				+ update_date + ", update_user=" + update_user + ", isdel=" + isdel + "]";
	}

}
