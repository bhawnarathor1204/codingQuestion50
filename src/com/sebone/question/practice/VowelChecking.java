package com.sebone.question.practice;
import java.util.Scanner;

/*class name :VowelChecking
 * objective :This class check vowel is present or not in given string
 * @author :bhawna rathor
 */
public class VowelChecking {
	
	/* method name :isVowelPresent
	 * objective :This method check vowel is present or not in given string
	 * @param : 1 param(String)
	 * @return :boolean
	 */
    public boolean isVowelPresent(String s) {
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
    			return true;
    		}
    	}
    	return false;
    }
    
    /*
     * method name:main method
     */
	public static void main(String[] args) {
		VowelChecking vowelChecking=new VowelChecking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string = ");
		String s=sc.nextLine();
		boolean check=vowelChecking.isVowelPresent(s);
		if(check==true) {
			System.out.println("Vowel is present in given string ");
		}else {
			System.out.println("Vowel not  present in given string ");

		}
        sc.close();
	}

}
