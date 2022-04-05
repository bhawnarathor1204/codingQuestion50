package com.sebone.question.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumberCheckInList {
    public boolean isContainOddOrNot(List<Integer> l1) {
    	
    	return true;
    }
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in arrayList = ");
		for(int i=1;i<=10;i++) {
			list1.add(sc.nextInt());	
		}
		for(Integer i:list1) {
			System.out.println(list1.get(i));
		}
		sc.close();
	}

}
