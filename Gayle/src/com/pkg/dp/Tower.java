package com.pkg.dp;

import java.util.Stack;

public class Tower {
	
		int index;
		Stack<Integer> disks;
		
		public Tower(int i) {
			disks=new Stack<Integer>();
			index=i;
		}
		public int movetopDisk(Tower destination)
		{
			int temp=disks.pop();
			destination.addtoTower(temp);
			return temp;
			
		}
		
		
		public void addtoTower(int value)
		{
			if(!disks.isEmpty() && disks.peek().intValue() < value)
			{
				System.out.println("error While adding disk");
			}
			else
			{
				disks.push(value);
			}
		}
		
		public void moveDisks(int n,Tower destination,Tower buffer)
		{
			if(n>0)
			{
				moveDisks(n-1, buffer, destination);
				movetopDisk(destination);
				buffer.moveDisks(n-1, destination, this);
			}
		}
		
		
	
	
	public static void main(String[] args) {
		int n=3;
		Tower[] towers=new Tower[n];
		
		for(int i=0;i<n;i++)
		{
			towers[i]=new Tower(i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			towers[0].addtoTower(i);
		}
		System.out.println("tower 0 disks");
		for(int i=0;i<towers[0].disks.size();i++)
		{
		
			System.out.println(towers[0].disks.get(i));
		}
		
		towers[0].moveDisks(n, towers[2], towers[1]);
		
		
		
		
		System.out.println("Destination output");
		for(int i=0;i<towers[2].disks.size();i++)
		{
			
			System.out.println(towers[2].disks.get(i));
		}
		
		
	}
}
