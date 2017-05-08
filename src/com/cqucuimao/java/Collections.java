package com.cqucuimao.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 利用迭代器遍历集合元素
 * @author cqucuimao
 *
 */
public class Collections {
	public static void main(String[] args) {
		
		List list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
