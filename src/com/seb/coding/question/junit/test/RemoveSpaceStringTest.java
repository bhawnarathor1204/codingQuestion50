/**
 * 
 */
package com.seb.coding.question.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.question.practice.RemoveSpaceString;

/**
 * @author Bhawna Rathor
 *
 */
public class RemoveSpaceStringTest {

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
	 * Test method for {@link com.sebone.question.practice.RemoveSpaceString#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		RemoveSpaceString removeSpaceString=new RemoveSpaceString();
		String s="my name is bhawna rathor";
		String newString=removeSpaceString.getRemoveSpaceString(s);
		assertEquals("mynameisbhawnarathor",newString);
	}

}
