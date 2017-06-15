package com.yusheng.serialize;

import java.io.Serializable;

public class Childen extends Parent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private static int subStaticInt =1;
	private static Integer subStaticInteger = 2;

	private boolean sex;
	
	private String friends;
	
	private transient  Long core;
	
	private String  parents;
	
	private int age;

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getFriends() {
		return friends;
	}

	public void setFriends(String friends) {
		this.friends = friends;
	}

	public Long getCore() {
		return core;
	}

	public void setCore(Long core) {
		this.core = core;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getSubStaticInt() {
		return subStaticInt;
	}

	public static void setSubStaticInt(int subStaticInt) {
		Childen.subStaticInt = subStaticInt;
	}

	public static Integer getSubStaticInteger() {
		return subStaticInteger;
	}

	public static void setSubStaticInteger(Integer subStaticInteger) {
		Childen.subStaticInteger = subStaticInteger;
	}

	@Override
	public String toString() {
		return "Childen [sex=" + sex + ", friends=" + friends + ", core=" + core + ", age=" + age + ", parents=" + parents +", toString()="
				+ super.toString() + "]";
	}

	public String getParents() {
		return parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}

}
