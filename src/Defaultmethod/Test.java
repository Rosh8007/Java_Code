package Defaultmethod;

public class Test implements demo{
	
	
	@Override
	public void m1() 
	{
		System.out.println("M1 Test");
	}

	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		
		demo d=new Test();
		d.m1();
	}
	
	
}


