package Singleton_Class;

public class SingleDemo {
	
	
	private static SingleDemo single_inst=null;
	
	private SingleDemo() {}

	public static SingleDemo getInstance() 
	{
		if(single_inst==null) 
		{
			single_inst=new SingleDemo();
		}
		
		
		return single_inst;
		
	}
}
