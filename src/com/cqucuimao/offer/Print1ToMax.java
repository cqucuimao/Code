package com.cqucuimao.offer;

import java.util.Scanner;

import javax.swing.JInternalFrame;

/**
 * 剑指offer面试题12：输入一个数n，打印出从1到最大的n位数
 * @author cqucuimao
 *
 */
public class Print1ToMax {

	//字符串加1操作
	static boolean increase(char[] chars){
		boolean b = false;
		int over = 0;
		for(int i=chars.length-1;i>=0;i--){
			int num = chars[i]-'0'+over;
			
			if(i==chars.length-1){
				num++;
			}
			
			if(num>=10){
				if(i==0){
					b = true;
				}
				num -= 10;
				over = 1;
				chars[i] = (char) (num+'0');
			}else{
				chars[i] = (char) (num+'0');
				break;
			}
		}
		return b;
	}
	
	static void print(char[] a){
		int begin = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]!='0'){
				begin = i;
				break;
			}
		}
		String res = "";
		for(int i=begin;i<a.length;i++){
			res += a[i];
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] a = new char[n];
		for(int i=0;i<n;i++){
			a[i] = '0';
		}
		while(!increase(a)){
			print(a);
		}
	}

}
