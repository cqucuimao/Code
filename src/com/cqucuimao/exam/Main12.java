package com.cqucuimao.exam;

import java.util.Scanner;

public class Main12 {

	static int fun(int[] a){
		int sum1 = a[0];
		int sum2 = a[a.length-1];
		
		int pre =1;
		int end = a.length-2;
		int count =0;
		while(pre<a.length-2 && end >1){
			if(sum1<sum2){
				sum1 += a[pre++];
			}else if(sum1 > sum2){
				sum2 += a[end--];
			}else {
				count++;
				end--;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
			}
			System.out.println(fun(a));
		}
	}

}
