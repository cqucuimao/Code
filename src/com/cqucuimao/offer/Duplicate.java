package com.cqucuimao.offer;

import java.util.HashSet;

public class Duplicate {
	//使用hashset
	boolean duplicate(int[] numbers,int length,int[] duplication){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<length;i++){
			if(!set.add(numbers[i])){
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
	}
	
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
