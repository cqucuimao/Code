package com.cqucuimao.offer;

import javax.sound.midi.MidiChannel;

/**
 * 剑指offer面试题8：旋转数组的最小值
 * @author cqucuimao
 *
 */
public class RotateArray {
	public int minNumber(int[] array){
		int begin = 0;
		int end = array.length-1;
		while(begin<end){
			int mid = (begin+end)/2;
			
			if(array[end]<array[mid]){
				begin = mid+1;
			}else{
				end = mid;
			}
		}
			
		return array[begin];
	}
}
