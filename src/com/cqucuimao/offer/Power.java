package com.cqucuimao.offer;
/**
 * 剑指offer面试题11：计算浮点数的整数次方
 * @author cqucuimao
 *
 */
public class Power {
	
	static double func(double base,int exponent){
		if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        int n = Math.abs(exponent);
        double res = func(base,n>>1);
        res *= res;
        if((n&0x1)==1)
            res *= base;
        if(exponent<0)
            return 1/res;
        return res;
	}

	public static void main(String[] args) {
		System.out.println(func(2, -3));
	}

}
