package com.cqucuimao.huawei;

import java.util.Scanner;

/**
 * 求二进制数中1的个数
 * @author cqucuimao
 *
 */
public class HUAWEI15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ss = Integer.toBinaryString(n);
		int count = 0;
		for(int i=0;i<ss.length();i++){
			if(ss.charAt(i) == '1')
				count++;
		}
		
		System.out.println(count);
	}

}
