package com.cqucuimao.exam;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//输入n,q
		int n = in.nextInt();
		int q = in.nextInt();
		//数列A
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		//数列B
		int[] b = new int[n];
		for(int i=0;i<n;i++){
			b[i] = in.nextInt();
		}
		//输入q行数据，用二维数组存储
		int[][] c = new int[q][2];
		for(int i=0;i<q;i++){
			c[i][0] = in.nextInt();
			c[i][1] = in.nextInt();
		}
		//一共q组查询
		for(int i=0;i<q;i++){
			System.out.println(search(a,b, c[i][0],c[i][1]));
		}
	}
	//查找函数
	static int search(int[] A,int[] B,int x,int y){
		int count = 0;
		for(int i=0;i<A.length;i++){
			if(A[i]>=x && B[i]>=y)
				count++;
		}
		return count;
	}

}
