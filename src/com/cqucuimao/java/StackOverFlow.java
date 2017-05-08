package com.cqucuimao.java;

public class StackOverFlow {
	
	static void fun(){
		System.out.println("hello");
		while(true){
			fun();
		}
	}

	public static void main(String[] args) {
		fun();
	}

}
