package com.cqucuimao.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String start = in.nextLine();
			String end = in.nextLine();
			String list = in.nextLine();
			Set<String> set = new HashSet<String>(Arrays.asList(list.split(" ")));
			System.out.println(set);
			System.out.println(ladderLength(start, end, set));
		}
	}

	static int ladderLength(String start, String end, Set<String> dict) {  
		      
		    Queue<String> que = new LinkedList<String>();
		    Queue<Integer> level = new LinkedList<Integer>();;//用来记录当前所在的层次  
		    int cur = 2;  
		    level.offer(cur);
		    que.offer(start);  
		      
		    while(!que.isEmpty())  
		    {  
		        String now = que.peek();  
		        que.poll();  
		        cur = level.peek();  
		        level.poll();  
		        for(int i=0;i<start.length();i++)  
		        {  
		            for(int j=0;j<26;j++)  
		            {  
		            	String next = now;
		                StringBuilder temp = new StringBuilder(now);  
//		                next.toCharArray()[i] = (char) ('a' + j);
		                temp.setCharAt(i, (char) ('a'+j));
		                next =temp.toString();
		                System.out.println("next="+next);
		                if(!now.equals(next) && !dict.contains(next))  
		                {  
		                    if(next.equals(end))  
		                        return cur;  
		                    que.offer(next);  
		                    level.offer(cur+1);  
		                    dict.remove(next);  
		                }  
		            }  
		        }  
		    }  
		    return 0;  
		}  

}
