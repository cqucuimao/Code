package com.cqucuimao.exam;
/*
 * 
 * 在大年三十的晚上，小明不想看春晚，就在网上报名了一场网络程序设计比赛，
 * 比赛将于20:00开始，持续4个小时，之到午夜。比赛中会有n个问题，按照难度排序，
 * 也就是说，第一个问题是最简单的，最后一个问题是最难的。小明知道他解决第k个问题需要k * 5分钟。
 * 小明的父母允许小明不看春晚，但要求他必须参加跨年，
 * 就是小明必须在12.00或者12.00之前赶到客厅和父母一起跨年。
 * 他需要m分钟从房间走到客厅。请问，小明在去参加跨年之前最多能解决多少问题。
 */
import java.util.Scanner;
public class Main {
 
	static int fun(int n,int m){
		int result = 0;
        int limit = 240;
		if(n==0 || m>=limit)
			return 0;
		int sum = 0;
		int i =1;
        for(;i<=n;i++){
        	sum += i;
        	if((sum*5+m)>=limit ){
        		result = i-1;
        		break;
        	}
        }
        if(i==n+1)
        	return n;
		return result;
	}
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
       
        System.out.println(fun(n, m));
    }
 
}