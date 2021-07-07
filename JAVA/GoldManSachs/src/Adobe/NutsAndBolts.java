package Adobe;

import java.util.HashSet;

public class NutsAndBolts {

	
	public static void main(String[] args)
	{
		
		
		char[] nuts= {'@','#','$','%','^','&'};
		char[] bolts= {'$','%','&','^','@','#'};
				
		HashSet<Character>box=new HashSet<>();
		
		for(char c:nuts)
		{
			box.add(c);
		}
		
		
		for(int i=0;i<bolts.length;i++)
		{
			if(box.contains(bolts[i])==true)
			{
				nuts[i]=bolts[i];
				
			}
		}
		
		for(char c:nuts)
		{
			System.out.print(c+" ");
			
		}
		System.out.println();
		
		for(int i=0;i<bolts.length;i++)
		{
			System.out.print(bolts[i]+" ");
		}
	}
	
}
