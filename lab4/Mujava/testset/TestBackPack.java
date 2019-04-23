import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBackPack {
	
	
	public BackPack bp = null;
	@Before 
	public void setup()
	{
		 bp = new BackPack();
	}
	
	
	@Test
	public void testBackPack_Solution()
	{
		 int m = 10;
	     int n = 3;
	     int w[] = {3, 4, 5};
	     int p[] = {4, 5, 6};
	     int c[][] = bp.BackPack_Solution(m, n, w, p);
	 	assertEquals( 11 , c[n][m]);
		
	}

}
