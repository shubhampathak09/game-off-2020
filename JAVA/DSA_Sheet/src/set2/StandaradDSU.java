package set2;

import java.util.Scanner;

public class StandaradDSU {

	
	public static int[] parent=new int[100001]; 
	
	
	
	public static int find(int a)
	{
		if(parent[a]==a)
			return a;
		
		return  find(parent[a]);
		
	}
	
	
	public static void union(int a,int b)
	{
		
		int para=find(a);
		int parb=find(b);
		
		parent[parb]=para;
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		for(int i=0;i<parent.length;i++)
		{
			parent[i]=i;
		}
		
	//	System.out.println(a[0]);
		
		
		int n,m;
		
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		m=s.nextInt();
		
		
		for(int i=1;i<=m;i++)
		{
			
			int a,b;
			
			a=s.nextInt();
			b=s.nextInt();
			
			union(a,b);
		}
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			
			if(parent[i]==i)
				count++;
			
		}
		
		System.out.println(count);
	}
	
}
