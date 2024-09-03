package ExceptionHAndelling;

public class Par {

	public void m1()throws StringIndexOutOfBoundsException
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public void m2()  
	{
		m1();
		
		System.out.println("M2 method");
	}
	
	public static void main(String[] args) {
		 
		try {
			new Par().m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
	
		System.out.println("Main method");
	}
}
