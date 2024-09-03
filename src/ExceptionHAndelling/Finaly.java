package ExceptionHAndelling;

public class Finaly {


	public static void main(String[] args) {

		try {
			
			throw new NullPointerException("Exception");
		
		}
		catch (ArithmeticException|StringIndexOutOfBoundsException|NullPointerException|ArrayIndexOutOfBoundsException n)
		{
			n.printStackTrace();
		}
		finally 
		{
			System.out.println("Finally block");
		}


	}

}
