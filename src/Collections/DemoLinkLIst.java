package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class DemoLinkLIst {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("Roshan");
		l.add("Aware");
		l.add("Paratwada");
		l.add(12);
		l.add(false);
		
		
		for(int i=0; i<l.size(); i++) 
		{
			System.out.println(l.get(i));
		
		}
		
		Vector v=new Vector(l);
		
		v.addElement("Deep");
		
		System.out.println(v);
		
		System.out.println(v.elementAt(1));
		
		v.setElementAt("Surname",1);
		
		System.out.println(v);
		
		v.setElementAt("Aware2",1);
	
		Enumeration<String>  elem=v.elements();
		
		while(elem.hasMoreElements()) 
		{	
				Object  val=elem.nextElement();
				System.out.println(val);
		}
		
		
	}


}
