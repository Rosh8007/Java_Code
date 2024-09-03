package Inheritance;

import Ovverrriding.p;

public class Test {



	public static void main(String[] args) {

		P p=new C();
		p.m1();
		
		C c=new C();
		
		
		//	p.m2(); can not access child method

		//C c=new P();

		
	
	}

}
