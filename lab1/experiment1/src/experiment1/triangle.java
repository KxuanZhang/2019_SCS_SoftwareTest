package experiment1;

public class triangle {

	
	public static String whichTriangle(int a , int b , int c)
	{
		if ( a ==  b && a == c)
		{
			return "equilateral";
		}
		else if(a == b || a == c || b == c)
		{
			return "isosceles";
		}
		else 
		{
			return "scalene";
		}
	}
	
	public static void main(String s [])
	{
		
	
	}
}
