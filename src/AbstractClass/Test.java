package AbstractClass;

public class Test {

	public static void main(String[] args) 
	{

		c c=new c();
		c.y=1;
		System.out.println(c.x);
		System.out.println(c.y);
		c.m1();
		c.m2();
		c.m3();
		c.m4();

System.out.println("===========================");	

		p p=new c();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		
		System.out.println(p.x);
		System.out.println(p.y);
		
	}
}
