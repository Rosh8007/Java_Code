package Ovverrriding;

public class Test {
	
	
	public static void main(String[] args) {
		
		p p=new p();
		
		c c=new c();
		c.m1();
		c.m2();
		
		((p)c).m1();
		//by writing this code we made composite object here we 
		//can only access parent specific method here
	  //((p)c).m2();
		
	}
	
	
}
