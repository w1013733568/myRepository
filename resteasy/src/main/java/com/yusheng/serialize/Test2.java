package com.yusheng.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.Serializable;

public class Test2 implements Serializable{

	private static final long serialVersionUID = 1L;

	private String password = "pass";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void writeObject(ObjectOutputStream out) {
		try {
			PutField putFields = out.putFields();
			System.out.println("ԭ����:" + password);
			password = "encryption";//ģ�����
			putFields.put("password", password);
			System.out.println("���ܺ������" + password);
			out.writeFields();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream in) {
		try {
			GetField readFields = in.readFields();
			Object object = readFields.get("password", "");
			System.out.println("Ҫ���ܵ��ַ���:" + object.toString());
			password = "passSSSS";//ģ�����,��Ҫ��ñ��ص���Կ
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/*�����л������У����������ͼ���ö�������� writeObject �� readObject �����������û��Զ�������л��ͷ����л���
	���û�������ķ�������Ĭ�ϵ����� ObjectOutputStream �� defaultWriteObject ����
	�Լ� ObjectInputStream �� defaultReadObject ������
	�û��Զ���� writeObject �� readObject �������������û��������л��Ĺ��̣�
	������������л��Ĺ����ж�̬�ı����л�����ֵ*/

	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("result.obj"));
			out.writeObject(new Test2());
			out.close();

			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
					"result.obj"));
			Test2 t = (Test2) oin.readObject();
			System.out.println("���ܺ���ַ���:" + t.getPassword());
			oin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

