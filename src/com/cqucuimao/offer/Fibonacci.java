package com.cqucuimao.offer;
/**
 * 剑指offer面试题9 ： 非递归求解斐波那契数
 * @author cqucuimao
 *
 */
public class Fibonacci {

	static int getFibo(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int x = 0;
		int y = 1;
		int res = 0;
		for(int i=2;i<=n;i++){
			res = x+y;
			x = y;
			y = res;
		}
		
		return res;
	} 
	
	public static void main(String[] args) {
		System.out.println(getFibo(3));
	}

}
