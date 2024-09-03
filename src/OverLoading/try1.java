package OverLoading;

public class try1 {

	
	
	
	public void m1(String x) 
	{
		System.out.println("M1 of try");
	}
	public void m1(String x,String y) 
	{
		System.out.println("M2 of try");
	}
	public void m1(String x,int z) 
	{
		System.out.println("M3 of try");
	}
	
	public static void main(String[] args) {
		
		try1 t=new try1();
		t.m1("ROshan");
		t.m1("RRR",'R');
		t.m1("AAA",12);
		
	}
}
