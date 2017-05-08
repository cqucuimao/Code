package com.cqucuimao.offer;

import java.util.ArrayList;

/**
 * 剑指offer面试题14：输入一个整数数组，实现一个函数，使得奇数位于前半部分，偶数位于后半部分
 * @author cqucuimao
 *
 */
public class ReOrderArray {

	static void reOrderArray(int[] array){
		int begin = 0;
		int end = array.length-1;
		
		int temp = 0;
		while(begin<end){
			if((array[begin]&1)==1){
				begin++;
			}
			if((array[end]&1)==0){
				end--;
			}
			if((array[begin]&1)==0 && (array[end]&1)==1){
				temp = array[begin];
				array[begin] = array[end];
				array[end] = temp;
				begin++;
				end--;
			}
		}
	}
	
	public static void main(String[] args) {
	}

}
