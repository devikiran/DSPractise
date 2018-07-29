package com.pkg.stack;

import java.util.Stack;

public class StackWithMinEle {
	Stack<Integer> s;
    Integer minEle;
 
    public void getMinele() {
    	if(s.isEmpty()) {
    		System.out.println("stack is empty");
    	}
    	else
    	{
    		System.out.println("stack min ele is "+minEle);
    	}
    }
    
    public void insert(Integer number) {
    	if(number < minEle) {
    		
    		s.push(2*number-minEle);
    		minEle = number;
    	}
    	else
    	{
    		s.push(minEle);
    	}
    }
    
    
    
    
    
    
    
    
    
    public void push(Integer val) {
    	if(s.isEmpty()) {
    		minEle = val;
    		s.push(val);
    	}
    	else if(val < minEle) {
    		s.push(2*val - minEle);
    		minEle = val;
    	}
    	else
    	{
    		s.push(val);
    	}
    }
    
    public void pop() {
    	if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
 
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
 
        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minEle)
        {
            System.out.println(minEle);
            minEle = 2*minEle - t;
        }
 
        else
            System.out.println(t);
    }
    public static void main(String[] args) {
		StackWithMinEle s = new StackWithMinEle();
		s.push(10);
		s.push(5);
	}
}
