package com.cqucuimao.exam;
/**
 * 根据二叉树的前序和中序重构二叉树，并输出二叉树的层序遍历结果
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5 {

	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	 public int[] getSubArray(int[] array,int from,int to){
	        if(array.length==0)
	            return null;
	        int[] result = new int[to-from];
	        for(int j=0,i=from;i<to;j++,i++){
	            result[j] = array[i];
	        }
	        return result;
	    }
	    
	    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre.length==0 || in.length==0)
	            return null;
	        //根节点
	        TreeNode rootNode = new TreeNode(pre[0]);
	        for(int i=0;i<in.length;i++){
	            if(in[i] == rootNode.val){
	                rootNode.left = reConstructBinaryTree(getSubArray(pre,1,i+1),getSubArray(in,0,i));
	                rootNode.right = reConstructBinaryTree(getSubArray(pre,i+1,pre.length),getSubArray(in,i+1,in.length));
	            }
	                
	        }
	        return rootNode; 
	    }
	    
	    static void levelRead(TreeNode root)
	    {
	        if(root == null) return;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
	        queue.add(root);
	        while(queue.size() != 0)
	        {
	            int len = queue.size();
	            for(int i=0;i <len; i++)
	            {
	                TreeNode temp = queue.poll();
	                System.out.print(temp.val+" ");
	                if(temp.left != null)  queue.add(temp.left);
	                if(temp.right != null) queue.add(temp.right);
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Main5 m = new Main5();
			int n = sc.nextInt();
			int[] pre = new int[n];
			int[] in = new int[n];
			for(int i=0;i<n;i++){
				pre[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++){
				in[i] = sc.nextInt();
			}
			levelRead(m.reConstructBinaryTree(pre, in));
		}

}
