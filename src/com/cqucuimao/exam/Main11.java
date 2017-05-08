package com.cqucuimao.exam;

import java.util.Scanner;

public class Main11 {  
	  
    public static int fun(int m,int n){  
        if(m<n){  
            int k=m;  
            m=n;  
            n=k;  
        }  
        if(m%n!=0){  
            int temp=m%n;  
            return fun(n,temp);  
        }else  
            return n;  
    }  
    
    public static void main(String[] args){  
        Scanner in=new Scanner(System.in);  
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
        	a[i] = in.nextInt();
        }
        if(n==1){
        	System.out.println(a[0]);
        	return ;
        }
    	int temp = fun(a[0], a[1]);
        if(n==2){
        	System.out.println(temp);
        	return;
        }
        for(int i=2;i<n;i++){
        	temp = fun(temp, a[i]);
        }
        System.out.println(temp);
    }  
}  
