/**
 * 
 */
package com.seb.coding.question.junit.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.question.practice.ArrayContainSameElementCheck;

/**
 * @author Bhawna Rathor
 *
 */
public class ArrayContainSameElementCheckTest {

	/**
	 * @throws java.lang.Exception
	 * 
	 * 
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.question.practice.ArrayContainSameElementCheck#isArraySameOrNot(int[], int[])}.
	 */
	@Test
	public void testIsArraySameOrNot() {

	}

	/**
	 * Test method for {@link com.sebone.question.practice.ArrayContainSameElementCheck#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		int[]b= {1,2,3,4,5,6,7,8,9,10};
		ArrayContainSameElementCheck arrayContainSameElement =new ArrayContainSameElementCheck();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array1 values= ");
//		for(int i=0;i<a.length;i++) {
//		  a[i]=sc.nextInt(); 
//		}
//		System.out.println("Enter array2 values= ");
//		for(int i=0;i<b.length;i++) {
//		  b[i]=sc.nextInt(); 
//		}
		boolean x=arrayContainSameElement.isArraySameOrNot(a,b);
		assertEquals(true,x);
	}

}
