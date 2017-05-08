package com.cqucuimao.offer;
/**
 * 剑指offer面试题16：反转链表
 */
import java.awt.List;

public class ReverseList {
	
	 class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	 }
	
	 static ListNode reverse(ListNode head){
		 ListNode pl = null;
		 ListNode pr = null;
		 while(head!=null){
			 pr = head.next;
			 head.next = pl;
			 pl = head;
			 head = pr;
		 }
		 return pl;
	 }
}
