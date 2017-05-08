package com.cqucuimao.java;

import java.util.Scanner;

public class PrimeCircle {
	
	static int n = 6;
	
	static int[] prime = new int[n];
	 
	static int[] visit = new int[n];
	
	static boolean isPrime(int n){
		if(n == 1)
			return false;
		if(n == 2)
			return true;
		for(int i=2;i<n;i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	static void dfs(int cur){
		//递归边界，数组首元素和尾元素是否满足约束
		if(cur == n && isPrime(prime[0]+prime[n-1])){
			for(int i=0;i<n;i++){
				System.out.print(prime[i]+" ");
			}
			System.out.println();
		}else{
			for(int i=2;i<=n;i++){
				if(visit[i-1] == 0 && isPrime(i+prime[cur-1])){
					prime[cur] = i;
					visit[i-1] = 1;
					dfs(cur++);
					visit[i-1] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();
		//素数环数组
//		PrimeCircle pc = new PrimeCircle();
//		pc.init();
		prime[0] = 1;
		dfs(1);
	}

}
