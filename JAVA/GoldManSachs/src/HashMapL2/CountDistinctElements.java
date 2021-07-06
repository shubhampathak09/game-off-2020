package HashMapL2;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElements {

	
	
	public static void main(String[] args)
	{
		
		
		int[] arr= {1,4,5,1,0,0,9,4,6,9,13,45,6,0,1,2,3};
		
		int k=4;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int i=0;i<k-1;i++)
		{
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int j=0,i=k-1;i<arr.length;)
		{
			//acquire
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			
			// work
			list.add(hm.size());
			
			// release
			
			int frq=hm.get(arr[j]);
			
			if(frq==1)
			{
				hm.remove(arr[j]);
			}else
			{
				hm.put(arr[j], frq-1);
			}
			i++;
			j++;
		}
		
		System.out.println(list);
		
	}
	 
	
}
