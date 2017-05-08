package com.cqucuimao.offer;

public class HasSubTree {

	class TreeNode{
		TreeNode left;
		TreeNode fight;
		int val;
	}
	
	boolean hasSubTree(TreeNode rootA,TreeNode rootB){
		boolean result = false;
		if(rootA==null)
			return false;
		if(rootB==null)
			return true;
		if(rootA.val == rootB.val){
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
