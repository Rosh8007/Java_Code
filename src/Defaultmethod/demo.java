package Defaultmethod;

public interface demo {
	
	default void m1() 
	{
		System.out.println("Main");
	}
	default void m2()
	{
		System.out.println();
	}

}
