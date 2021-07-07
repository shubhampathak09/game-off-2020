package Adobe;

public class checkPaindrome {
	
	
	public static boolean palindrome(String text)
	{
		
		int i=0;
		int j=text.length()-1;
		
		while(i<=j)
		{
			
			
			if(text.charAt(i)!=text.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{
		
		String text="racecar";
		
		boolean check=palindrome(text);
		
		if(check)
		{
			System.out.println("The Given text is a palindrome");
		}else
		{
			System.out.println("The Given text is not a palindrome");
		}
		
	}

}
