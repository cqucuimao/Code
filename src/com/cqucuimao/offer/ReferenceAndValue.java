package com.cqucuimao.offer;
/**
 * java中引用传递和值传递
 * @author cocoa
 *
 */
public class ReferenceAndValue {
	
	void swap(int m,int n){
		int temp;
		temp = m;
		m = n;
		n = temp;
	}
	
	void swap(Value1 v1,Value1 v2){
		int temp;
		temp = v1.value;
		v1.value = v2.value;
		v2.value = temp;
	}
	
	public static void main(String[] args) {
		int m=10,n=20;
		Value1 v1 = new Value1(111);
		Value1 v2 = new Value1(222);
		
		ReferenceAndValue rav = new ReferenceAndValue();
		//值传递
		System.out.println("交换之前：m="+m+",n="+n);
		rav.swap(m, n);
		System.out.println("交换之后：m="+m+",n="+n);
		
		//引用传递
		System.out.println("交换之前：v1.value="+v1.value+",v2.value="+v2.value);
		rav.swap(v1, v2);
		System.out.println("交换之后：v1.value="+v1.value+",v2.value="+v2.value);
	}

}

class Value1{
	int value;
	Value1(int value){
		this.value = value;
	}
}
