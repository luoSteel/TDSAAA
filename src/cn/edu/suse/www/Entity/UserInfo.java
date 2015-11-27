package cn.edu.suse.www.Entity;

import java.io.Serializable;

public class UserInfo implements Serializable
{
	private static final long serialVersionUID = -8472231743498874977L;
	private int id;
	private String name;
	private String pwd;
	private int age;
	
	@Override
	public String toString() 
	{
		return "UserInfo [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
