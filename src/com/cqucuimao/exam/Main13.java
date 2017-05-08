package com.cqucuimao.exam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main13{

    /*请完成下面这个函数，实现题目要求的功能*/
    /*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
    /******************************开始写代码******************************/
    static int run(int[] a){
    	
    	int n = a.length;
		int temp = 0;
		int k = 0;
		for(int i=0;i<n;i++){
			if(a[i]==0)
				a[i] =9;
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					k++;
				}
			}
		}
		return k;
		
    }
   /******************************结束写代码******************************/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[9];
        
        for(int i=0;i<9;i++){
        	a[i] = scan.nextInt();
        }
        
      
        System.out.println(run(a));
    }
}


