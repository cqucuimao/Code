package com.cqucuimao.offer;
/**
 * 剑指offer面试题31：求连续子数组的最大和
 * @author cqucuimao
 *
 */
public class FindGteatestSum {

	static int findGreatestSum(int[] array){
		int n = array.length;
		if(n<=0)
			return 0;
		int sum = 0;
		int max = 0;
		for(int i=0;i<n;++i){
			if(sum<=0)
				sum = array[i];
			else
				sum += array[i];
			if(sum>max)
				max = sum;
		}
		return max;
	}
	
	public static void main(String[] args) {

	}

}
