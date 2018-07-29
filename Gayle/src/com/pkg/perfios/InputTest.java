package com.pkg.perfios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputTest {
public static void main(String[] args) {
	String s = "4D6 + 3D4";
	// Pattern pattern = Pattern.compile("/^([1-9]+[D])(4|6|8|10|12)");
	 Pattern pattern = Pattern.compile("[1-9]\\d*");
	 Matcher matcher = pattern.matcher(s);
	if(matcher.matches()) {
		System.out.println("asde");
	}
	else
	{
		System.out.println("no match");
	}
}
}
