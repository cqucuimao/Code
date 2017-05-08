package com.cqucuimao.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 剑指offer面试题4：替换空格
 * @author cocoa
 *
 */
public class ReplaceSpace {
	public String replace(String s){
		if(s == null)
			return null;
		int n = s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++){
			if(s.charAt(i) != ' '){
				sb.append(s.charAt(i));
			}else{
				sb.append("%20");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.replace(string));
	}
}
