package dp;

import java.util.Stack;

public class CelebirtyProblem {

	public static void main(String[] args)
	{
	Stack<Integer>st=new Stack<>();
	
	int[][] a={{0, 0,1,0}, {0,1,1,0},{0,0,0,0},{0,0,1,0}};
	
	
//	int[][]a={ {0, 0, 1, 0},
//        {0, 0, 1, 0},
//        {0, 1, 0, 0},
//        {0, 0, 1, 0} };->none
//	
	for(int i=0;i<a.length;i++)
	{
	
		st.push(i);
	}
	
	while(st.size()>=2)
	{
		int p1=st.pop();
		int p2=st.pop();
		
		// p1->p2
		
		if(a[p1][p2]==1)
		{
			
			st.push(p2);  // p1 does not know p2
		}
		else
		{
			st.push(p1);   // p2 dors not know p1
		}
	}
	
	int pc=st.pop();
	
	boolean flag=true;
	
	for(int i=0;i<a.length&&i!=pc;i++)
	{
		if(a[pc][i]==1)
		{
			flag=false;
			System.out.println("none");
			return;
		}
	}
	
	
	for(int i=0;i<a.length&&i!=pc;i++)
	{
		if(a[i][pc]==0)
		{
			flag=false;
			System.out.println("none");
			return;
		}
	}
	
	System.out.println(pc);
	}
}
