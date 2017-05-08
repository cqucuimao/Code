package com.cqucuimao.offer;
/**
 * 剑指offer面试题10：二进制中1的个数
 * @author cqucuimao
 *
 */
public class NumberOf1 {
	public int func(int n){
		int count = 0;
		while(n>0){
			count++;
			n = n&(n-1);
		}
		return count;
	}
}
