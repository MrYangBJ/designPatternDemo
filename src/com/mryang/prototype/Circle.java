package com.mryang.prototype;

public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method");

	}

}
