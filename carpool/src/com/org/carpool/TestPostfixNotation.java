package com.org.carpool;

import org.junit.Assert;
import org.junit.Test;

public class TestPostfixNotation {
	
	@Test
	public void test1() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("2 2 +");
		} catch (PercentageException e) {
			System.out.println("invalid expression");
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(4f, result, 0);
	}
	@Test
	public void test2() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("2 2 *");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(4f, result, 0);
	}
	@Test
	public void test3() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("2 2 /");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(1f, result, 0);
	}
	@Test
	public void test4() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("2 2 -");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(0f, result, 0);
	}
	
	@Test
	public void test5() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("");
			System.out.println(result);
			Assert.fail();
		} catch (PercentageException e) {
			System.out.println("invalid expression");
		}
		
	}
	
	@Test
	public void test6() {
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate(" ");
			System.out.println(result);
			Assert.fail();
		} catch (PercentageException e) {
			System.out.println("invalid expression");
		}
		
	}
	
	@Test
	public void testInvalidInput(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("6 2 * 3 /");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(4f, result, 0);
	}
	@Test
	public void testInvalidInput2(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 1 2 + 4 * + 3 -");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(14f, result, 0);
	}
	@Test
	public void testInvalidInput3(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 1 2 + ^");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(125f, result, 0);
	}
	
	@Test
	public void testInvalidInput4(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 1 2 + %");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(0.03f, result, 0);
	}
	
	@Test
	public void testNegativeNumbers(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 -1 2 + *");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(5, result, 0);
	}

	@Test
	public void testNegativeNumbers2(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 -1 2 / *");
		} catch (PercentageException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		Assert.assertEquals(-2.5f, result, 0);
	}
	@Test
	public void testNegativepercenage(){
		PostfixCalculator pc = new PostfixCalculator();
		float result = 0;
		try {
			result = pc.calculate("5 -1 % 2 /");
			System.out.println(result);
		} catch (PercentageException e) {
		}
		
	}
}
