package recursions;

import java.util.Scanner;

public class PrintIncDec {
	
	
	public static void printDec(int n)
	{
		
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		printDec(n-1);
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner S=new Scanner(System.in);
		
		int n=S.nextInt();
		
		
		
		printDec(n);
		
	}

}
