package test.experiment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import experiment1.triangle;


public class TestTriangle {
	
	
	@Test
	public void testAdd()
	{
		triangle cal = new triangle();
		assertEquals("equilateral" , cal.whichTriangle(3, 3, 3));
		assertEquals("isosceles"  , cal.whichTriangle(3, 3, 4));
		assertEquals("scalene" , cal.whichTriangle(3, 4, 5));

	} 
}
