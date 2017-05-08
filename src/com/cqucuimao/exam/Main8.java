package com.cqucuimao.exam;

import java.util.Scanner;

public class Main8 {
	
	static String fun(char ch){
		if(ch == 'a')
			return Long.toHexString(97);
		else
			return Long.toHexString(97+(ch-'a'));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ss = in.nextLine();
		long n = ss.length()/16;
		for(int i=0;i<n;i++){
			String ll = "000000"+Long.toHexString(i)+"0";
			String mm = "";
			for(int j=0;j<16;j++){
				mm += fun(ss.charAt(i*16+j));
				if(j==7 || j==15)
					mm += "  ";
				else
					mm += " ";
			}
			
			System.out.print(ll.substring(ll.length()-8,ll.length())+"  ");
			System.out.print(mm);
			System.out.println(ss.substring(i*16,i*16+16));
		}
	}
}
