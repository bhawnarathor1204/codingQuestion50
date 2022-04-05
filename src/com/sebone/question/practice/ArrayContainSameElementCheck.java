package com.sebone.question.practice;

import java.util.HashSet;
import java.util.Scanner;

/*
 * class name:-ArrayContainSameElementCheck
 * objective:-This class check two arrays contain same element or not  
 * @author:-bhawna rathor
 */
public class ArrayContainSameElementCheck {
	
	/*
	 * Method name:-isArraySameOrNot
	 * Objective :-This method check two array contain same element or not
	 * @param :-it takes two parameter
	 * @return:-boolean 
	 */
    public boolean isArraySameOrNot(int[]array1,int[]array2) {
    	boolean flag=true;
    	HashSet<Integer> hashset=new HashSet<Integer>();
    	for(int i=0;i<array1.length;i++) {
    		hashset.add(array1[i]);
    	}
    	for(int i=0;i<array2.length;i++) {
    		if(!hashset.contains(array2[i])) {
    			flag=false;
    			break;
    		}
    	}
    	
    	return flag;
    }
    
    //This method is driver method
	public static void main(String[] args) {
		ArrayContainSameElementCheck arrayContainSameElementCheck=new ArrayContainSameElementCheck();
		Scanner sc=new Scanner(System.in);
		int[]array1=new int[10];
		int[]array2=new int[10];
		System.out.println("Enter array 1 element= ");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter array 2 element= ");
		for(int i=0;i<array2.length;i++) {
			array2[i]=sc.nextInt();
		}
		boolean result=arrayContainSameElementCheck.isArraySameOrNot(array1,array2);
		if(result) {
			System.out.println("array contain same element");
		}
		else {
			System.out.println("array does not contain same element ");
		}
		sc.close();
	}

}
