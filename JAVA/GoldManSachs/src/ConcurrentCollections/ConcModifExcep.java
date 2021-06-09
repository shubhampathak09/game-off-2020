package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcModifExcep extends Thread {
	
	static ArrayList<Object>al=new ArrayList<>();
	
	public void run()
	{
		
		try
		{
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("updating the list");
		al.add("D");
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		
		
		al.add("A");
		al.add("B");
		al.add("C");
		
		ConcModifExcep t=new ConcModifExcep();
		
		t.start();
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			String s1=(String)itr.next();
			System.out.println("Main thread iterating the array list object and cuurrent object is "+s1);
			Thread.sleep(2000);
			
			
		}
		
		
	}
	
}
