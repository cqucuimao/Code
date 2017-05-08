package com.cqucuimao.huawei;
/**
 * 以单词为最小单位，对一个英文句子倒置
 */
import java.util.Scanner;
import java.util.Stack;

public class HUAWEI13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		String s = in.nextLine();
		
		String[] array = s.split(" ");
		
		for(int i=0;i<array.length;i++){
			stack.push(array[i]);
		}

		while(!stack.isEmpty()){
			System.out.print(stack.peek());
			stack.pop();
			if(!stack.isEmpty())
				System.out.print(" ");
		}
	}

}
