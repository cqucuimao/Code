package com.cqucuimao.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main15 {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
    	Stack<String> stack = new Stack<String>();
    	//List<String> ss = zb(expr);
    	String[] array = expr.split("\\s+");
    	for(int i=0;i<array.length;i++){
    		if(isNumber(array[i])){
    			if(stack.add(array[i])){
    				stack.push(array[i]);
    			}else
    				return -2;
    		}else if("^".equals(array[i])){
    			if(stack.isEmpty()){
    				return -1;
    			}else{
    				int temp = Integer.valueOf(stack.peek())+1;
    				stack.pop();
    				stack.push(temp+"");
    			}
    		}else if("+".equals(array[i])){
    			if(stack.isEmpty()){
    				return -1;
    			}else{
    				int n1 = Integer.valueOf(stack.peek());
    				stack.pop();
    				if(stack.isEmpty()){
    					return -1;
    				}else{
    					int n2 = Integer.valueOf(stack.peek());
    					stack.pop();
    					int temp = n1 + n2;
    					stack.push(temp+"");
    				}
    			}
    		}else if("*".equals(array[i])){
    			if(stack.isEmpty()){
    				return -1;
    			}else{
    				int n1 = Integer.valueOf(stack.peek());
    				stack.pop();
    				if(stack.isEmpty()){
    					return -1;
    				}else{
    					int n2 = Integer.valueOf(stack.peek());
    					stack.pop();
    					int temp = n1 * n2;
    					stack.push(temp+"");
    				}
    			}
    		}
    	}
		return Integer.valueOf(stack.peek());
    }
    
    public static boolean isNumber(String s){
    	if(s.equals("^") || s.equals("*") || s.equals("+"))
    		return false;
    	return true;
    }
    
    public static List<String> zb(String s) {
        List<String> ls = new ArrayList<String>();//存储中序表达式
        int i = 0;
        String str;
        char c;
        do {
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57) {
                ls.add("" + c);
                i++;
            } else {
                str = "";
                while (i < s.length() && (c = s.charAt(i)) >= 48
                        && (c = s.charAt(i)) <= 57) {
                    str += c;
                    i++;
                }
                ls.add(str);
            }

        } while (i < s.length());
        return ls;
    }
}