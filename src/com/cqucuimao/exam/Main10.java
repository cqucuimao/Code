package com.cqucuimao.exam;

import java.util.Scanner;

public class Main10 {

	//求阶乘
	static int fun1(int n){
		int res = 1;
		if(n==0)
			return 1;
		for(int i=1;i<=n;i++){
			res *=i;
		}
		return res;
		
	}
	//求排列
	static int fun2(int m,int n){
		return fun1(n)/fun1(n-m);
	}
	//求组合
	static int fun3(int m,int n){
		return fun2(m, n)/fun1(m);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		int m = (int) Math.ceil(n*0.6);
		double d = 0.0;
		d = (fun3(m, n)+fun3(n-m, n))*Math.pow(0.5, n);
		System.out.println(d);
	}

}
