package Collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
	
	
	public static void main(String[] args) {
		
		Set s=new HashSet();
		s.add("Roshan");
		s.add("Aware");
		s.add(null);
		s.add(true);
		
		for(int i=0; i<20; i++) 
		{
		  s.add(i);
		}
		
		System.out.println(s);
		 
	}

}
