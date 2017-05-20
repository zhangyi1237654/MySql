package com.zy.model;

/**
* @author zy007
* 
*/
import java.util.Date;

public class Goddess {
	private int id;
	private String user_name;
	private int sex;
	private int age;
	private String birthday;
	private String email;
	private String mobile;
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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		return "Goddess [id=" + id + ", user_name=" + user_name + ", sex=" + sex + ", age=" + age + ", birthday="
				+ birthday + ", email=" + email + ", mobile=" + mobile + ", creat_user=" + creat_user + ", creat_date="
				+ creat_date + ", update_date=" + update_date + ", update_user=" + update_user + ", isdel=" + isdel
				+ "]";
	}

	
}
