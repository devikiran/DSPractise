package com.pkg.arraysstrings;

public class DuplicateChars {
public static void main(String[] args) {
	String value="Helloe";
	
	char[] temp=value.toCharArray();
	
	int arr[]=new int[256];
	
	for(int i=0;i<value.length();i++)
	{
		int num=(int)value.charAt(i);
		arr[num]=arr[num]+1;
	}
	
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]>0)
		System.out.println(j+"--"+arr[j]);
	}
}
}
