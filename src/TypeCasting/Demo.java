package TypeCasting;

public class Demo {
	
	
	public static void main(String[] args) {
		 
	// Upcasting: widening
		
		int val=100;
		
		long l=(int)val;
		
		System.out.println(l);
		
		
		float f=102.938f;
		double d=f;
		
		System.out.println(d);
		
	// Downcasting: Narrowing
		
		long lval=10000L;
		
		int ival=(int)lval;
		
		System.out.println(ival);
		
		
		double dval=12.3434d;
		
		float fval=(float)dval;
		
		System.out.println(fval);
		
		int intval=(int)dval;
		
		System.out.println(intval);
		
		
		
	}

}
