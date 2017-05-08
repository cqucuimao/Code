package com.cqucuimao.offer;

public class Upcasting {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
		shape.erase();
	}
}

class Shape{
	void draw(){
		System.out.println("shape.draw");
	}
	void erase(){
		System.out.println("shape.erase");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("circle.draw");
	}
	void erase(){
		System.out.println("circle.erase");
	}
}
