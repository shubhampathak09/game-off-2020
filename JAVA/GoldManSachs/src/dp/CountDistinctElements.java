package dp;

import java.util.HashMap;

public class CountDistinctElements {

	public static void main(String[] args)
	{
		
		
		int[] a= {2,5,3,5,2,4,1,3,1,4};
		
		int n=a.length;
		
		int ans=0;
		
		HashMap<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		
		int k=map.size();
        
		int i=-1;
		int j=-1;
		
		 
		HashMap<Integer,Integer>map2=new HashMap<>();
		
		
		while(true)
		{
			
			boolean f1=false;
			boolean f2=false;
			
		while(i<a.length-1)
		{
			i++;
			
			map2.put(a[i],map2.getOrDefault(a[i],0)+1);
			
			if(map2.size()==map.size())
			{
				ans+=a.length-i;
				break;
			}
			f1=true;
		}
	     
		while(j<i)
		{
			j++;
			
			if(map2.get(a[j])==1)
				map2.remove(a[j]);
			else
			map.put(a[j], map.get(a[j])-1);
			
			if(map2.size()==k)
			{
				ans+=a.length-i;
			}
			else
				break;
			
			f2=true;
		}
		
		if(f1==false&&f2==false)
			break;
	}
		
		System.out.println(ans);
	}
	
}
