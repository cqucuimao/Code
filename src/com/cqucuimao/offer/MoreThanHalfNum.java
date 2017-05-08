package com.cqucuimao.offer;

public class MoreThanHalfNum {
	//快速排序中划分函数partition,其实就是快排的一趟过程
	static int partition(int[] a,int low,int high){
		int begin = low;
		int end = high;
		while(begin<end){
			//从右往左
			while(begin<end){
				if(a[end]>a[begin]){
					end--;
				}else{
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
					begin++;
					break;
				}
			}
			
			//从左往右
			while(begin<end){
				if(a[begin]<a[end]){
					begin++;
				}else{
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
					end--;
					break;
				}
			}
		}
		
		return begin;
	}
	
	static int getMoreThanHalfNum(int[] array){
		
		int n = array.length>>1;
		int begin = 0;
		int end = array.length-1;
		int point = partition(array, begin, end);
		
		while(point != n){
			if(point > n)
				point = partition(array, begin, point-1);
			else
				point = partition(array, point+1, end);
		}
		int res = array[point];
		
		int times = 0;
		for(int i=0;i<array.length;++i){
			if(array[i] == res)
				times++;
		}
		System.out.println(res);
		if(times*2<array.length)
			return 0;
		else
			return res;
		
	}
	
	public static void main(String[] args) {
		int[] array = {2,2,2,2,2,1,3,4,5};
		System.out.println(123);
		int res = getMoreThanHalfNum(array);
		System.out.println(res);
	}

}
