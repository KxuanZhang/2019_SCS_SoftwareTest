package experiment1;

public class Calculator {
	
	public static int [] looseChange = { 50 , 20  , 5 , 1};
	

	public static boolean looseOk(int testMoney)
	{
		
		
		int number [] = {1 , 1 , 2 , 3}; //store money's number 
		int i = 0;
		 
		for( i = 0 ; i < looseChange.length && testMoney != 0 ;  )
		{
			if (number[i] == 0)
			{//money has used 
				i++;
				continue;
			}
			if (testMoney >= looseChange[i])
			{//use money 
				testMoney -= looseChange[i];
				number[i] -= 1;
			}
			else
			{//next money 
				i++;
			}
		}
		if (testMoney == 0)
			{  return true; }
		else 
		{
			 return  false;
		}
		
	}
	
	
	
	

}
