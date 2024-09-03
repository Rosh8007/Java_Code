package Inheritance_Demo;

public class Test {
	
	
	public static void main(String[] args) {
		
		P p=new C();
		p.m1(20);
		p.parent();
		
		System.out.println("=============================================");
		
		C c=new C();
		c.m1(20);
		c.parent();
		
		
	}

}
