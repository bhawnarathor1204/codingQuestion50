package com.seb.coding.question.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.question.practice.VowelChecking;

public class VowelCheckingTest {

	@BeforeClass
	/*
	 * 
	 * 
	 * 
	 * */
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsVowelPresent() {
		VowelChecking vowelChecking=new VowelChecking();
		assertEquals(true,vowelChecking.isVowelPresent("bhawna"));
		assertEquals(false,vowelChecking.isVowelPresent("xyzpqr"));
		
	}

}
