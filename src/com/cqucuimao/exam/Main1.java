package com.cqucuimao.exam;

import java.util.Scanner;

public class Main1 {
	
	//是否为满足题目要求的区域
	static boolean fun(int[] a,int x,int y){
		boolean result = true;
		//找到[x,y]的最大值
		int max = 0;
		int max_i = 0;
		for(int i=x;i<=y;i++){
			if(a[i]>max){
				max = a[i];
				max_i = i;
			}
		}
		//递增区域
		for(int i=0;i<max_i;i++){
			if(a[i] > a[i+1]){
				result = false;
				break;
			}
				
		}
		//递减区域
		for(int i=max_i;i<y-1;i++){
			if(a[i] < a[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = in.nextInt();
		}
		int begin=0,end=array.length;
		for(int i=0;i<n-1;i++){
			if(array[i]<array[i+1]){
				
			}
		}
	}

}
