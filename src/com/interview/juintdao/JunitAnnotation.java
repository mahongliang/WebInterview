package com.interview.juintdao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	//execute before class
	   @BeforeClass
	   public static void beforeClass() {
	      System.out.println("in before class");
	   }

	   //execute after class
	   @AfterClass
	   public static void  afterClass() {
	      System.out.println("in after class");
	   }

	   //execute before test
	   @Before
	   public void before() {
	      System.out.println("in before");
	   }

	   //execute after test
	   @After
	   public void after() {
	      System.out.println("in after");
	   }

	   //test case
	   //test case 1
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   //test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	   //test case ignore and will not execute
	   @Ignore
	   public void ignoreTest() {
	      System.out.println("in ignore test");
	   }
}
