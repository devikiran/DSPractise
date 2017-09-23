package com.pkg.arraysstrings;

public class PermutationStrings {
	
	static String s1="aabbcc";
	static String s2="ccaabb";
	
	
	public static void main(String[] args) {

	System.out.println(compare(s1, s2));
	}
	
	public static boolean compare(String s1,String t1)
	{
		int[] ascs=new int[128];
		for(int i=0;i<s1.length();i++)
		{
			ascs[s1.charAt(i)]++;
			
		}
		
		//target characters asciic value should contain the same number
		
		for(int j=0;j<t1.length();j++)
		{
			int temp=t1.charAt(j);
			ascs[temp]--;
			if(ascs[temp]<0)
			{
				System.out.println("not a permutation");
				return false;
			}
			
		}
		
		
		return true;
		
		
		
	}

}
