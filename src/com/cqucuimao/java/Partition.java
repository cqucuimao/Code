package com.cqucuimao.java;

import java.util.Scanner;

/**
 * 找到数组中第K大的数
 * @author cqucuimao
 *
 */
public class Partition {

	static int partition(int[] a,int begin,int end){
		int i = begin;
		int j= end;
		while(i<j){
			while(i<j){
				if(a[j]>a[i]){
					j--;
				}else{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					break;
				}
			}
			while(i<j){
				if(a[i]<a[j]){
					i++;
				}else{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					j--;
					break;
				}
			}
		}
		
		return i;
	}
	
	static int findK(int[] a,int begin,int end,int k){
		if(k <= 0)
			return 0;
		
		int point = 0;
		while(true){
			point = partition(a, begin, end);
			if(point+1==k){
				return a[point];
			}else if(point+1>k){
				end = point-1;
			}else{
				begin = point+1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<10;++i){
			a[i] = in.nextInt();
		}
		
		System.out.println(findK(a, 0, a.length-1, 5));
	}

}
