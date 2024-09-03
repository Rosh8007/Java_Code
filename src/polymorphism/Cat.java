package polymorphism;

public class Cat extends Dog
{
	int x=32;
	@Override
	public  void m1() 
	{
		System.out.println("M1 of cats");
		
	}
	
	public static void main(String[] args) {
		
		Dog d=new Cat();
		d.m1();
		
		System.out.println(d.x);
		
	}
}
