package OverLoading;

public class methodOverloading {
	
	
	public void m1(int x, float y) 
	{
		System.out.println("Int-Float");
	}
	public void m1(float f, int i) 
	{
	    System.out.println("Float-Int");
	}
	
	public static void main(String[] args)
	{
		methodOverloading t=new methodOverloading();
		t.m1(12, 10.3f);
		t.m1(23f, 1);
		
	//	t.m1(20, 23);Ambiguous error
		
		
		
		
	}

}
