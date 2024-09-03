package TypePromotion;

public class DemoPromo {
	
	// if we write float data type and integer value then 
	
	public static void m1(int x,long y) 
	{
	   System.out.println(x);
	   System.out.println(y);
	}
	
	public static void m1(long x,int y) 
	{
	   System.out.println(x);	
	   System.out.println(y);
	}
	
	
	public static void main(String[] args) 
	{
		
		m1(2257,143l);
		
	}

}
