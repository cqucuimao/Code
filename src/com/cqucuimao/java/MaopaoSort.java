package com.cqucuimao.java;

import java.util.Scanner;

/**
 * 冒泡排序的普通实现和其优化后的实现
 * @author cqucuimao
 *
 */
public class MaopaoSort {

	//普通实现
	static void bubbleSort(int[] a){
		int n = a.length;
		int temp = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	//冒泡排序的优化，换一种逻辑
	static void betterBubbleSort(int[] a){
		int n = a.length;
		int temp = 0;
		boolean b = false;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					b = true;
				}
			}
			if(b)
				break;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		bubbleSort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		betterBubbleSort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
