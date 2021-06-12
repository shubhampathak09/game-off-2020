package dp;


import java.util.ArrayList;
import java.util.HashMap;

// getOrDefault((a[i],0)+1)
public class DistinctElementsInWndowSIzeK {
	
	
	public static ArrayList<Integer> solver(int[] arr,int k)
	{
		ArrayList<Integer>list=new ArrayList<>();
		
		int n=arr.length;
		
		HashMap<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<=k-2;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for( int j=0,i=k-1;i<n;j++,i++)
		{
			// acquire
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			list.add(map.size());
			
			// relase
			
			if(map.get(arr[j])==1)
			{
				map.remove(arr[j]);
			}else
			{
				map.put(arr[j], map.get(arr[j])-1);
			}
		}
		
		return list;
		
	}
	
	public static void main(String[] args)
	{
		
	//	.args. acuire release strat
		
		int[] a= {2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6};
		
		int []a1= {1,2,1,3,4,2,3};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int n=a.length;
        int k=3;
        int i=0;
        int j=0;
        
        for(i=0;i<n;i++)
        {
        	
        	if(i-j+1<k)
        	{
        		if(hm.containsKey(a[i])==false)
        		{
        			hm.put(a[i], 1);
        			
        		}
        		else
        		{
        			hm.put(a[i], hm.get(a[i])+1);
        		}
        		i++;
        	}
        	// window size became equal tok
        	if(hm.containsKey(a[i])==true)
        	{
        		hm.put(a[i],hm.get(a[i])+1);
        	}
        	else
        	{
        		hm.put(a[i], 1);
        	}
        	System.out.print(hm.keySet().size()+" ");
        	
        	if(hm.get(a[j])==1)
        	{
        		hm.remove(a[j]);
        	}
        	else
        	{
        		hm.put(a[j], hm.get(a[j])-1);
        	}
        	j++;
        }
    	System.out.println();
    	
    	ArrayList<Integer>ans=new ArrayList<>();
    	
    	ans=solver(a1,4);
    	
    	
    	System.out.println(ans);
		// getOrDefault(a[i],0) ->good
	}
	

	

}
