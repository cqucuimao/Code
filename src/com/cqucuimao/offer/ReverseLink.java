package com.cqucuimao.offer;
/**
 * 剑指offer面试题5：从尾到头打印链表
 * 利用栈实现
 */
import java.util.ArrayList;
import java.util.Stack;

public class ReverseLink {
	
	class ListNode{
		int value;
		ListNode next = null;
		ListNode(int value) {
			this.value = value;
		}
		
	}
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> lists = new ArrayList<>();
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode != null){
			stack.push(listNode.value);
			listNode = listNode.next;
		}
        
		while(! stack.isEmpty()){
			lists.add(stack.pop());
		}
		return lists;
    }
}
