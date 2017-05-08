package com.cqucuimao.exam;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String line1 = in.next();
		String line2 = in.next();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++){
			sb.append(line1.charAt(i)^line2.charAt(i));
		}
		System.out.println(Integer.valueOf(sb.toString(),2).toString());
	}

}
