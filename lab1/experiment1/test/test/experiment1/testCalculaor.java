package test.experiment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import experiment1.Calculator;

public class testCalculaor {

	
	
	
	@Test
	public void testAdd()
	
	{
		
		Calculator cal = new Calculator();
		
		assertEquals(true , cal.looseOk(8));
		assertEquals(true , cal.looseOk(12));
		assertEquals(true , cal.looseOk(26));
		assertEquals(false , cal.looseOk(29));
		assertEquals(false , cal.looseOk(34));
		assertEquals(false , cal.looseOk(41));
		assertEquals(true , cal.looseOk(53));
		assertEquals(true , cal.looseOk(61));
		assertEquals(false , cal.looseOk(99));

	} 
}
