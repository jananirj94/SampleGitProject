package com.project;

public class FirstCode {
	public static void main(String[] args) {
		
	
	String s1="Make my trip easier";
	String[] s2=s1.split(" ");
	String s3="";
	for(String s4:s2) {
		String s5="";
		for(int i=s4.length()-1;i>=0;i--) {
			char c=s4.charAt(i);
			s5=s5+c;
		}
		s3=s3+s5+" ";
		
	}
	System.out.println(s3);
}
}