package com.cqucuimao.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class HUAWEI9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		StringBuffer sb2 = new StringBuffer();
		for(int i=0;i<sb.length();i++){
			boolean b =true;
			for(int j=0;j<i;j++){
				if(sb.charAt(i) == sb.charAt(j)){
					b = false;
					break;
				}
			}
			if(b)
				sb2.append(sb.charAt(i));
		}
		
		if(sb2.charAt(0) == '0')
			System.out.print(sb2.substring(1));
		else
			System.out.print(sb2);
	}

}
