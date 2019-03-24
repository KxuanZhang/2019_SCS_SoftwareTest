package homework3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

import homework3.PrintPrimes;
public class testPrintPrimes {

	private  PrintPrimes  pri = null;
	
	@Before
	public void setup()
	{
		pri = new PrintPrimes();
	}
	
	
	@Test
	public void testPrintPrimes()
	{
		int [] t1 = {2 , 3};
		int [] r1 = pri.printPrimes(2);
		for (int i = 0 ; i < t1.length; i++)
		{
			assertEquals(t1[i] , r1[i]);

		}
	}
	
	@Test
	public void testPrintPrimes1()
	{
		int [] t1 = {2 , 3 , 5};
		int [] r1 = pri.printPrimes(3);
		for (int i = 0 ; i < t1.length; i++)
		{
			assertEquals(t1[i] , r1[i]);

		}
	}
	
	@Test
	public void testPrintPrimes2()
	{
		int [] t1 = {2 , 3, 5 ,7};
		int [] r1 = pri.printPrimes(4);
		for (int i = 0 ; i < t1.length; i++)
		{
			assertEquals(t1[i] , r1[i]);

		}
	}
	
}
