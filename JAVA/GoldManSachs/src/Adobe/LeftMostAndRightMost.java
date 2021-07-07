package Adobe;

public class LeftMostAndRightMost {

	
	public static void main(String[] args)
	{
		
		
		int[] arr= {2,1,1,2,1,5,6,6};
		
        int n=arr.length;
       
        int max=arr[0];
        int maxindexright=0;
        int minindexleft=0;
        int maxindexleft=0;
        int minindexright=0;
        int min=arr[0];
        
        for(int i=1;i<n;i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        		minindexleft=i;
        		minindexright=i;
        	}else if(arr[i]==min)
        	{
        		minindexright=i;
        	}
        	
        	 if(arr[i]>max)
        	{
        		max=arr[i];
        		maxindexleft=i;
        		maxindexright=i;
        	}
        	 else if(arr[i]==max)
        	{
        		maxindexright=i;
        	}
       
        }
        System.out.println(minindexleft);
        System.out.println(minindexright);
        System.out.println(maxindexleft);
        System.out.println(maxindexright);
	}
	
}

