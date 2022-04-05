package com.sebone.question.practice;

import java.util.Scanner;

public class RemoveSpaceString {
	
    public String getRemoveSpaceString(String s) {
    	String newString=new String();
    	for(int i=0;i<s.length();i++) {
	    	newString=s.replaceAll(" ", "");
        }
    	return newString;
    }
	public static void main(String[] args) {
		RemoveSpaceString removeSpaceString=new RemoveSpaceString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string = ");
		String s=sc.nextLine();
		String newString=removeSpaceString.getRemoveSpaceString(s);
		System.out.println("Return string is = "+newString);
		sc.close();
	}

}
