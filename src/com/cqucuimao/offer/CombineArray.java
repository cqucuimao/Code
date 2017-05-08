package com.cqucuimao.offer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 题目描述：有两个排序数组A和B，
 * 内存中A的末尾有足够的空间容纳B，
 * 把B中所有数字合并到A中，并且所有数字都是排序的。
 * @author cocoa
 *
 */
public class CombineArray {
		public int[] merge(int[] A,int[] B){
			if(A == null || A.length<=0)
				return B;
			if(B == null || B.length<=0)
				return A;
			if(A == null && B == null)
				return null;
			int n = A.length-1;
			int i = A.length-B.length-1;
			
			int j = B.length-1;
			while(i>=0&&j>=0){
				if(A[i]>=B[j]){
					A[n--] = A[i--];
				}else{
					A[n--] = B[j--];
				}
			}
			return A;
		}
		
		public static void main(String[] args) {
			int[] A = {1,3,5,7,9,0,0,0,0};
			int[] B = {2,2,6,8};
			CombineArray cba = new CombineArray();
			for(int i:cba.merge(A, B)){
				System.out.println(i);
			}
		}
}
