package recursions;

public class TowerOfHanoi {

	public static int count;
	
	public static void solve(int disk,int t1,int t2,int t3)
	{
		
		// t2 helper t3 target
		// disk 3
		//1[10->11]
		//2[10-12]
		
		if(disk==1)
		{
			System.out.println("Moving "+disk+" from "+t1+" to "+t3);
		    count++;
			return;
		}
		
		solve(disk-1,t1,t3,t2);
		count++;
		System.out.println("Moving "+disk+" from "+t1+" to "+t3);
	    solve(disk-1,t2,t1,t3);
	  //  count++;
	}
	
	public static void main(String[] args)
	{
		
		// print instructions to move the disk
		solve(3,1,2,3);
		
		System.out.println(count);
	}
	
}
