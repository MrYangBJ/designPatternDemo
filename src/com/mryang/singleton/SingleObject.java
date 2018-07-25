package com.mryang.singleton;

public class SingleObject {
//	 ����һ��SingleObject����
 private static SingleObject instance=new SingleObject();
//	�ù��캯��Ϊprivate,��������Ͳ��ᱻʵ����
private SingleObject() {
     
}
//	���Ψһ���õĶ���
public static SingleObject getInstance() {
	return instance;
}

 public void showMessage() {
	 System.out.println("Hello World!");
 }
 
}
