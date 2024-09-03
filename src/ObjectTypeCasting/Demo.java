package ObjectTypeCasting;


class parent 
{
	String name= "Roshan";

	void m1() 
	{
		System.out.println("This is m1 from parent");
	}

}

class child extends parent
{

	int id=10;

	void m2() 
	{
		System.out.println("this is child m2");
	}

}




public class Demo {


	public static void main(String[] args) {


		child c=new child();// can access everthing from both parent and child
		System.out.println(c.id);
		System.out.println(c.name);
		c.m1();
		c.m2();


		// UPCASTING
		parent p=new child();// only from the parent but not from child

		System.out.println(p.name);
		p.m1();


		// Downcasting: this gives class cast exception
	/*	parent prnt=new parent();
		child cld=(child)prnt;
		
		System.out.println(c.name);
		System.out.println(c.id);
		
		c.m1();
		c.m2();  */

	}

}
