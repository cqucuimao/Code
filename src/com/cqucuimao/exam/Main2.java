package com.cqucuimao.exam;

import java.util.Scanner;

public class Main2 {
	
	static int fun(String s1,String s2){
		int count = 0;
		String[] a1 = s1.split(" ");
		String[] a2 = s2.split(" ");
		for(int i=0;i<a1.length;i++){
			for(int j=0;i<a2.length;j++){
				if(a1[i].equalsIgnoreCase(a2[j]))
					count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] array = new String[n+m];
		for(int i=0;i<=n+m;i++){
			array[i] = in.nextLine();
		}
		System.out.println(n+","+m);
		
		for(int i=n;i<n+m;i++){
			int max = 0;
			int flag = 0;
			for(int j=0;j<n;j++){
				if(fun(array[i], array[j])>max){
					max = fun(array[i], array[j]);
					flag = j;
				}
			}
			System.out.println(array[flag]);
		}
		
	}
}
