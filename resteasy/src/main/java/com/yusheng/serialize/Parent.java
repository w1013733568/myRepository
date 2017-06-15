package com.yusheng.serialize;

import java.io.Serializable;

public class Parent implements Serializable{
	

	private static Integer staticVar = 5;

	
	
	public Parent() {
		this.id = 1L;
		this.name = "wocao";
		this.age = 1;
	}

	private Long id;
	
	private String name;
	
	private transient int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Integer getStaticVar() {
		return staticVar;
	}

	public static void setStaticVar(Integer staticVar) {
		Parent.staticVar = staticVar;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
