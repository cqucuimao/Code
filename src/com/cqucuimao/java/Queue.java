package com.cqucuimao.java;
/**
 * 八皇后问题
 * @author cqucuimao
 *
 */
public class Queue {
	 //皇后的个数
	static int N = 8;
	//存放皇后的位置
	static int[] position = new int[N];
	//记录有多少种摆法
	static int count = 0;
	
	//判断第 n 行放置的位置是否满足约束条件
	static boolean verify(int n){
		for(int i=0;i<n;++i){
			if(position[i] == position[n] || Math.abs(position[i] - position[n]) == Math.abs(i - n)){
				return false;
			}
		}
		return true;
	}
	
	//回溯法搜索摆放的位置
	static void trail(int n){
		//如果摆放完了，就输出结果
		if(n == N){
			print();
			return ;
		}
		for(int column=0;column<N;++column){
			position[n] = column;
			if(verify(n))
				trail(n+1);
			// 如果不满足条件，则进行下一次循环，即回溯回去在第row行重新寻找摆放的位置
		}
	}
	
	//输出摆放的位置
	static void print(){
		System.out.println("这是第"+ ++count+"种摆法：");
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				if(position[i] == j)
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		trail(0);
	}
}
