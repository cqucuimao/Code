package com.cqucuimao.huawei;

import java.util.Scanner;

/**
 * 字符串分割
 * @author cqucuimao
 *
 */

public class HUAWEI4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line1 = sc.nextLine();
			String line2 = sc.nextLine();
			if(line1 != null)
				fun(line1);
			
			if(line2 != null)
				fun(line2);
		}

	}
	
	static void fun(String line){
		int len = line.length();
		
		if(len>0 && len<8){
			for(int i=0;i<8-len;i++){
				line += "0";
			}
			System.out.println(line);
		}
		
		if(len>=8){
			System.out.println(line.substring(0,8));
			line = line.substring(8);
			fun(line);
		}
	}

}
