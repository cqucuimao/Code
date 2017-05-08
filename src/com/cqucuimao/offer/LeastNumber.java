package com.cqucuimao.offer;

import java.util.ArrayList;

/**
 * 剑指offer面试题30：最小的K个数
 * @author cqucuimao
 *
 */
public class LeastNumber {
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
	
	 static ArrayList<Integer> GetLeastNumbers(int [] array, int k) {
			ArrayList<Integer> list = new ArrayList<Integer>();
	        if(array.length<1 || k<1 || k>array.length)
				return list;
			int begin = 0;
			int end = array.length-1;
			int index = partition(array, begin, end);
			while(index != k-1){
				if(index > k-1){
					index = partition(array, begin, index-1);
				}else{
					index = partition(array, index+1, end);
				}
			}
			for(int i=0;i<=index;i++){
				list.add(array[i]);
			}
			return list;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
