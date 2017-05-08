package com.cqucuimao.huawei;

import java.util.Scanner;

/**
 * 进制转换
 * @author cqucuimao
 *
 */
public class HUAWEI5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				String line = sc.nextLine();
				if(line != null){
					convert(line);
				}
			}
	}
	
	static void convert(String ss){
		int num = 0;
		String numString = ss.substring(2);
		for(int i=0;i<numString.length();i++){
			if(numString.charAt(i) == 'A' || numString.charAt(i) =='a'){
				num += 10*(pow(16, numString.length()-i-1));
			}else if(numString.charAt(i) == 'B' || numString.charAt(i) =='b'){
				num += 11*(pow(16, numString.length()-i-1));
			}else if(numString.charAt(i) == 'C' || numString.charAt(i) =='c'){
				num += 12*(pow(16, numString.length()-i-1));
			}else if(numString.charAt(i) == 'D' || numString.charAt(i) =='d'){
				num += 13*(pow(16, numString.length()-i-1));
			}else if(numString.charAt(i) == 'E' || numString.charAt(i) =='e'){
				num += 14*(pow(16, numString.length()-i-1));
			}else if(numString.charAt(i) == 'F' || numString.charAt(i) =='f'){
				num += 15*(pow(16, numString.length()-i-1));
			}else{
				num += Integer.parseInt(numString.charAt(i)+"")*(pow(16, numString.length()-i-1));
			}
		}
		
		System.out.println(num);
	}
	
	static int pow(int num,int n){
		int result = 1;
		if(n==0){
			return result;
		}
		
		for(int i=0;i<n;i++){
			result *= num;
		}
		
		return result;
	}

}
