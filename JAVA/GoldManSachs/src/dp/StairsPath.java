package dp;

import java.util.ArrayList;

public class StairsPath {

	
	// can take 1 2 3 paths get all stair paths
	
	public static ArrayList<String>getStairPaths(int n)
	{
		
		if(n==1)
		{
			ArrayList<String>bc=new ArrayList<>();
			bc.add(0+""+1+"");
			return bc;
		}
		
		if(n==2)
		{
			ArrayList<String>bc=new ArrayList<>();
			bc.add(0+""+1+""+2);
			bc.add(0+""+2+"");
			return bc;
		
			
			
		}
		
		
		if(n==3)
		{
			
			ArrayList<String>bc=new ArrayList<>();
			bc.add(0+""+1+""+2+""+3);
			bc.add(0+""+1+""+3);
			bc.add(0+""+3+"");
			return bc;
		}
		// faith that i knpw the paths to 1-n-1
		int ns=n;
	
		
		ArrayList<String>finalPath=new ArrayList<>();
		
		for(int i=1;i<=2;i++)
		{
			ArrayList<String>knowPath=getStairPaths(ns-i);
			for(String str:knowPath)
			{
				String nstr=str+""+n;
				finalPath.add(nstr);
			}
		}
		
		
		
		return finalPath;
	}
	
	
	public static void main(String[] args)
	{
		
		int n=5;
		
		ArrayList<String>res=getStairPaths(n);
		
		 
		System.out.println(res);
		
	}
	
}
