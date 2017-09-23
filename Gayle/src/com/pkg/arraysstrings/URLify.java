package com.pkg.arraysstrings;

public class URLify {

	static String  input = "Mr John Smith ";
	//%r0John0Smith0
	int oLength = 13;

	public static void main(String[] args) {
		process(input, 13);
		
		System.out.println("asdf    asdf".length());
	}

	public static void process(String in, int number) {
		char[] values = in.toCharArray();
		int spacecount = 0, index;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == ' ') {
				spacecount++;
			}
		}
		index = number + spacecount * 2;
		System.out.println("Spacecount "+spacecount);
		System.out.println("index"+index);
		char[] finalval=new char[index];
		
		
		for(int j=values.length-1;j>0;j--){
	
		if(values[j]==' ')
		{
			finalval[index-1]='0';
			finalval[index-2]='2';
			finalval[index-3]='%';
			index=index-3;
		}
		else
		{
			finalval[index-1]=values[j];
			index--;
		}
		}

		System.out.println(String.valueOf(finalval));
	
	}
}
