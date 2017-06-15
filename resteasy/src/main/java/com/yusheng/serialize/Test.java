package com.yusheng.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
			
			try {
//				write();
				
				//Childen类添加字段
				
				read();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	private static void write() throws FileNotFoundException, IOException{
		//初始时staticVar为5
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("result.obj"));
		Childen a = new Childen();
		a.setAge(11);
		a.setCore(99L);
		a.setFriends("wuyanjie");
		a.setId(2L);
		a.setName("xiaoming");
		a.setSex(true);
		System.out.println(a);
		out.writeObject(a);
		out.close();
	}
	
	private static void read() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
				"result.obj"));
		Childen b = (Childen) oin.readObject();
		oin.close();
		
		//再读取，通过t.staticVar打印新的值
		System.out.println(b);
	}
	
	//如果一个类可序列化,serialVersionUID建议给一个确定的值,不要由系统自动生成,否则在增减字段(不能修改字段类型及长度)时,如果两边的类的版本不同会导致反序列化失败.

}
