package com.mryang.singleton;

public class SingletonPatternDemo {
 public static void main(String[] args) {
	 SingleObject object=SingleObject.getInstance();
	 object.showMessage();
	 Singleton5.INSTANCE.whateverMethod();
	 
 }
}
