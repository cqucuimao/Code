package com.cqucuimao.offer;
/**
 * 剑指offer面试题3：二维数组中的查找
 * @author cocoa
 *
 */
public class FindNumber {

	public boolean find(int target,int[][] array){
			
		int m = 0;
		int n = array[0].length-1;
		//思路：从二位数组的右上角上开始找
		while(m<=array.length-1 && n>=0){
			if(target == array[m][n])
				return true;
			else if(target > array[m][n]){
					m++;
			}else{
					n--;
			}
		}
		
		return false;
		
	}
}
