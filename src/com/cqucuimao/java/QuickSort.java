package com.cqucuimao.java;

import java.util.Scanner;

/**
 * 快速排序的实现
 * @author cqucuimao
 *
 */
public class QuickSort {
	
	//获取中轴值（默认是最低位）
	static int getMiddle(int[] a,int low,int high){
		//数组第一个作为中轴
		int temp = a[low];
		while(low<high){
			while(low<high&&a[high]>temp){
				high--;
			}
			a[low] = a[high];
			
			while(low<high&&a[low]<temp){
				low++;
			}
			a[high] = a[low];
		}
		
		a[low] = temp;
		return low;
	}
	
	//快速排序中划分函数partition,其实就是快排的一趟过程
	static int partition(int[] a,int low,int high){
		int begin = low;
		int end = high;
		while(begin<end){
			//从右往左
			while(begin<end){
				if(a[end]>a[begin]){
					end--;
				}else{
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
					begin++;
					break;
				}
			}
			
			//从左往右
			while(begin<end){
				if(a[begin]<a[end]){
					begin++;
				}else{
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
					end--;
					break;
				}
			}
		}
		
		return begin;
	}
	

	static void quickSort(int[] a,int low,int high){
		if(low<high){
			int middle = partition(a, low, high);
			quickSort(a, low, middle-1);
			quickSort(a, middle+1, high);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		quickSort(a, 0, 9);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
