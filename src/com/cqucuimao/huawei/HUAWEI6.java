package com.cqucuimao.huawei;
/**
 * 输入一个数，对其进行因式分解
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HUAWEI6 {
	
	//判断一个数为质数
	public boolean isPrime(long l){
		boolean result = true;
		for(int i=2;i<l;i++){
			if(l%i == 0){
				result = false;
				break;
			}
		}
		return result;
	}
	
	//求小于等于n的所有质数，返回所有质数集合
	public ArrayList<Long> getPrime(long n){
		ArrayList<Long> list = new ArrayList<Long>();
		for(long i=2;i<=n;i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		return list;
	}
	
	static void getResult(long ulDataInput){
		while(ulDataInput != 1){
			for(int i=2;i<=ulDataInput;i++){
				if(ulDataInput%i == 0){
					System.out.print(i+" ");
					ulDataInput /= i;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long l = sc.nextLong();
			getResult(l);
		}
	}

}
