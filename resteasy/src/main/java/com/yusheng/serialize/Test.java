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
				
				//Childen������ֶ�
				
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
		//��ʼʱstaticVarΪ5
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
		
		//�ٶ�ȡ��ͨ��t.staticVar��ӡ�µ�ֵ
		System.out.println(b);
	}
	
	//���һ��������л�,serialVersionUID�����һ��ȷ����ֵ,��Ҫ��ϵͳ�Զ�����,�����������ֶ�(�����޸��ֶ����ͼ�����)ʱ,������ߵ���İ汾��ͬ�ᵼ�·����л�ʧ��.

}
