package com.cqucuimao.huawei;

import java.util.Scanner;

public class HUAWEI16 {

	public static int maxValue(int N,int m,int[] v,int[] p,int[] q){
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();//总钱数
		int m = in.nextInt();//购买商品的数量
		int[] v = new int[m];//商品价格列表
		int[] p = new int[m];//商品重要度
		int[] q = new int[m];//商品是否为附件
		
		for(int i=0;i<m;++i){
			v[i] = in.nextInt();
			p[i] = in.nextInt();
			q[i] = in.nextInt();
		}
		
	}

}
