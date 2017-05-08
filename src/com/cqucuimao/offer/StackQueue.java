package com.cqucuimao.offer;
/**
 * 用两个栈来实现一个队列
 */
import java.util.Stack;

public class StackQueue {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		stack1.push(node);
	}
	/*
	 * 如果stack2不空，那么stack2栈顶的元素就是要删除的元素
	 * 如果stack2空，要把stack1中所有元素出栈并入栈stack2，然后stack2栈顶就是要删除的元素
	 * 
	 */
	public int pop(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
	
	public static void main(String[] args) {
		
	}

}
