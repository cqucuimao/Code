package com.cqucuimao.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的遍历
 * @author cqucuimao
 *
 */
public class BinaryTree {
	
	class Tree{
		int value;
		Tree left = null;
		Tree right = null;
		public Tree(int v) {
			this.value = v;
		}
	}
	
	//构造一颗二叉树
	Tree init(){
		Tree a = new Tree(1);
		Tree b = new Tree(2);
		Tree c = new Tree(3);
		Tree d = new Tree(4);
		Tree e = new Tree(5);
		Tree f = new Tree(6);
		Tree g = new Tree(7);
		
		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		//返回根节点
		return a;
		
	}

	//层次遍历
	static void levelOrder(Tree root){
		if(root == null)
			return ;
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(root);
		while(! queue.isEmpty()){
			Tree current = queue.poll();
			System.out.print(current.value+" ");
			if(current.left !=null){
				queue.add(current.left);
			}
			if(current.right !=null){
				queue.add(current.right);
			}
		}
	}
	
	//先序遍历
	static void preOrder(Tree root){
		if(root == null)
			return;
		System.out.print(root.value+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//非递归实现先序遍历  
	static void iterativePreorder(Tree root) {  
		Stack<Tree> stack = new Stack<Tree>();  
		if(root == null)
			return ;
		
		stack.push(root);
		while(! stack.isEmpty()){
			Tree current = stack.pop();
			System.out.print(current.value+" ");
			
			if(current.right != null)
				stack.push(current.right);
			if(current.left != null)
				stack.push(current.left);
		}
	} 
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		//初始化二叉树
		Tree root = bt.init();
		//层次遍历二叉树
		System.out.println("层次遍历：");
		levelOrder(root);
		System.out.println();
		//先序遍历
		System.out.println("先序遍历：");
		preOrder(root);
		System.out.println();
		iterativePreorder(root);
		
	}

}
