package dp;

public class SearchIna2DMatrix {

	
	
	public static boolean search(int[][] a,int target)
	{
		
		  int n=a.length;
	        int row=0;
	        int col=a[0].length-1;
	        
	        
	        while(row<n&&col>=0)
	        {
	            if(target==a[row][col])
	                return true;
	            else if(target<a[row][col])
	                col--;
	            else
	                row++;
	            
	        }
	        return false;
		
	}
	
	public static void main(String[] args)
	{
		
	}
	
}
