package dp;

import java.util.LinkedList;
import java.util.Queue;

public class RollingBall {

	public static class Pair
	{
		int x;
		int y;
		Pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	public static int dx[]= {1,0,-1,0};
	public static int dy[]= {0,1,0,-1};
	
	public static boolean solve(int[][]maze,int srcx,int srcy,int destx,int desty)
	{
		
		int n=maze.length;
		int m=maze[0].length;
		
		boolean[][] visited=new boolean[n][m];
		
		Queue<Pair>q=new LinkedList<>();
		
		
		 q.add(new Pair(srcx,srcy));
		while(!q.isEmpty())
		{
			Pair top=q.peek();
			q.remove();
			
			if(top.x==destx&&top.y==desty)
				return true;
			
			visited[top.x][top.y]=true;
			
			for(int i=0;i<4;i++)
			{
				int newx=top.x+dx[i];
				int newy=top.y+dy[i];
				
				while(newx>=0&&newx<n&&newy>=0&&newy<m&&maze[newx][newy]!=1)
				{
					newx=newx+dx[i];
					newy=newy+dy[i];
				}
				
				if(!visited[newx-dx[i]][newy-dy[i]])
				{
				 q.add(new Pair(newx-dx[i],newy-dy[i]));
				
				}
			}
			
		}
		
		return false;
	}
	
	private Object Pair(int newx, int newy) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args)
	{
		
		
		int[][] a= {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		
		
		int n=a.length;
		int m=a[0].length;
		
		
		boolean ans=solve(a,0,4,3,2);
		
		System.out.println(ans);
		
	}
	
}
