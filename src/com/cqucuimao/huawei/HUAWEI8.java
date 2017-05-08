package com.cqucuimao.huawei;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HUAWEI8 {
	

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(map.containsKey(x)){
				map.put(x, map.get(x)+y);
			}else{
				map.put(x, y);
			}
		}
		TreeSet<Integer> treeSet = new TreeSet<>(map.keySet());
		for(int i:treeSet){
			System.out.println(i+" "+map.get(i));
		}
	}

}
