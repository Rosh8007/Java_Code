package Collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;

public class ArryDemo {


	public static void main(String[] args) 
	{




		ArrayList list=new ArrayList();

		LinkedList lnklist=new LinkedList();


		System.out.println(list instanceof Serializable);

		System.out.println(list instanceof Cloneable);

		System.out.println(lnklist instanceof RandomAccess);

		System.out.println(list instanceof RandomAccess);


		Vector<Integer> arr=new Vector<Integer>();
		arr.add(12);
		arr.add(22);

		arr.addElement(79);

		arr.add(234);

		for(int i=0;i<arr.size(); i++) 
		{
			System.out.println(arr.get(i));
		}

		List  l=Collections.synchronizedList(list);// it gives synchronosed versin of arraylist object



		Vector v=new Vector(1,3);
		v.addElement(1);

		v.addElement(2);

		v.addElement(3);


		System.out.println(v);


		Stack s=new Stack();
		s.push("Roshan");
		s.push("Aware");


		System.out.println(s.peek());

		System.out.println(s.search("Aware"));

		System.out.println("Pop :"+s.pop());


		System.out.println(s.isEmpty());


		Enumeration  e= v.elements();

		System.out.println(v);

		while(e.hasMoreElements()) 
		{
			int  ele=(int)e.nextElement();
			
			System.out.print(ele +",");
		}
		
		







	}



}
