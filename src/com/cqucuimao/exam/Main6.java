package com.cqucuimao.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
	//把字母转换为数字
	static int convert(char ch){
		if(ch == 'a'){
			return 0;
		}else{
			return ch-'a';
		}
	}
	//把字符串转换为10进制数
	static int fun(String line){
		int result = 0;
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		for(int i=0;i<sb.length();i++){
			result += convert(sb.charAt(i))*Math.pow(26, i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		//ctrl+z输入结束
		while(in.hasNext()){
			String line = in.nextLine();
			list.add(line);
		}
		for(String ss:list){
			System.out.println(fun(ss));;
		}
	}
}
