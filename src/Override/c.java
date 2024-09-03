package Override;

public class c extends p{
	

	int x=2;
	
	public static void m1() 
	{
		System.out.println("M1 of c");
	}
	
	@Override
	public void m2() 
	{
		System.out.println("M2 of c");
	}
	
	@Override
	public void m3() 
	{
		System.out.println("M3 of c");
	}

}
