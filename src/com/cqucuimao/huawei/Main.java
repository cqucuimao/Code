package com.cqucuimao.huawei;
/**
 * 字符串输出：每行8个，不足8个补0，空字符串不处理
 */
import java.util.*;
import java.lang.*;

public class Main{
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String line = sc.nextLine();
            String line2 = sc.nextLine();
            fun(line);
            fun(line2);
        }
    }
    
    static void fun(String line){
    	int len = line.length();
    	if(line.length()<=8){
            for(int i=0;i<8-len;i++){
                line += "0";
            }
            System.out.println(line);
        }
        if(line.length()>8){
            int n = line.length()/8;
            int m = line.length()%8;
            for(int i=0;i<n;i++){
                String subLine = line.substring(i*8,i*8+8);
                System.out.println(subLine);
            }
            String ss = line.substring(n*8,line.length());
            for(int i=0;i<8-m;i++){
                ss += "0";
            }
            System.out.println(ss);
            
        }
    }
}