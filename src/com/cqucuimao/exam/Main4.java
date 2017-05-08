package com.cqucuimao.exam;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ss = in.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<ss.length();i++){
			//遇到左半边，进栈
			if(ss.charAt(i) == '[')
				stack.push(ss.charAt(i));
			//遇到右半边，栈顶出栈
			if(ss.charAt(i) == ']'){
				stack.pop();
			}
		}
	}

}
