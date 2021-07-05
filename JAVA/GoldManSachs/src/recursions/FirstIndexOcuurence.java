package recursions;

public class FirstIndexOcuurence {

	
	
	
	
	public static int findfirst(int a[],int index,int x)
	{
		if(index==a.length)
		{
			return -1;
		}
		
		int st=a[index];
		if(a[index]==x)
		{
			return index;
		}
		
		return findfirst(a,index+1,x);
		
	}
	public static void main(String[] args)
	{
		
		int[] a= {2,3,9,8,7,6,4,12,7};
		
		int indx=0;
		
		int ans=findfirst(a,indx,8);
		
		if(ans!=-1)
		{
			System.out.println("First occurence is at"+" "+ans);
		}
		else
		{
			System.out.println("Does not exisit");
		}
		
	}
	
}
