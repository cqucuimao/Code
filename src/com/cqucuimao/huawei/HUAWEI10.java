package com.cqucuimao.huawei;

import java.util.HashSet;
import java.util.Scanner;

public class HUAWEI10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char ch : s.toCharArray()){
			set.add(ch);
		}
		
		System.out.println(set.size());
	}

}
