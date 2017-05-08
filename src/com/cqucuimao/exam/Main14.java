package com.cqucuimao.exam;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int[] a = new int[n];
			int[] dp = new int[n];
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
				if(i==0)
					dp[i] = a[i];
				else 
					dp[i] = dp[i-1]+a[i];
			}
			int count = 0;
			for(int i=0;i<n-1;i++){
				if(dp[i]*2 == dp[n-1])
					count++;
			}
			System.out.println(count);
		}
	}

}
