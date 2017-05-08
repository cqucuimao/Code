package com.cqucuimao.offer;

public class MergeList {

	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	//递归解法
	ListNode merge(ListNode list1,ListNode list2){
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		ListNode mHead = null;
		if(list1.val<list2.val){
			mHead = list1;
			mHead.next = merge(list1.next, list2);
		}else{
			mHead = list2;
			mHead.next = merge(list1, list2.next);
		}
		
		return mHead;
	}
	//非递归解法
	ListNode merge2(ListNode list1,ListNode list2){
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		ListNode root = null;
		ListNode current = new ListNode(0);
        root = current;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }else{
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }
        if(list1!= null)
            current.next = list1;
        if(list2!=null)
            current.next = list2;
        return root.next;
	}
	public static void main(String[] args) {
		
	}

}
