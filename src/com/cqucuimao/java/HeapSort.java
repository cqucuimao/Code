package com.cqucuimao.java;

import java.util.Scanner;

/**
 * 堆排序的实现
 * @author cqucuimao
 *
 */
public class HeapSort {  
	  
    public static void sort(int[] data) {  
        // 构建最大堆  
        buildMaxHeap(data);  
        // 循环，每次把根节点和最后一个节点调换位置  
        for (int i = data.length; i > 1; i--) {  
            int tmp = data[0];  
            data[0] = data[i - 1];  
            data[i - 1] = tmp;  
  
            // 堆的长度减少1，排除置换到最后位置的根节点  
            maxHeapify(data, 1, i - 1);  
        }  
    }  
  
    // 根据输入数组构建一个最大堆  
    private static void buildMaxHeap(int[] data) {  
        for (int i = data.length / 2; i > 0; i--) {  
            maxHeapify(data, i, data.length);  
        }  
    }  
  
    //堆调整，使其生成最大堆  
    private static void maxHeapify(int[] data, int root, int heapSize) {  
        // 左子节点索引  
        int left = root * 2;  
        // 右子节点索引  
        int right = root * 2 + 1;  
        // 最大节点索引  
        int largest = root;  
  
        // 如果左子节点大于父节点，则将左子节点作为最大节点  
        if (left <= heapSize && data[left - 1] > data[root - 1] ) {  
            largest = left;  
        }  
  
        // 如果右子节点比最大节点还大，那么最大节点应该是右子节点  
        if (right <= heapSize && data[right - 1] > data[largest - 1]) {  
            largest = right;  
        }  
  
        // 最后，如果最大节点和父节点不一致，则交换他们的值  
        if (largest != root) {  
            int tmp = data[root - 1];  
            data[root - 1] = data[largest - 1];  
            data[largest - 1] = tmp;  
  
            // 交换完父节点和子节点的值，对换了值的子节点检查是否符合最大堆的特性  
            maxHeapify(data, largest, heapSize);  
        }  
    }  
  
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		sort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
} 
