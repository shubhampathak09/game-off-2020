// knights Probability in chess board


int isvalid(int x,int y,int n)
{
	if(x>=0&&x<n&&u>=0&&y<n)
	{
		return 1;
	}else
	return 0;
}

void solution(int r,int c,int k,int n)
{
	
	double dp1[n][n]; // current
	double dp2[n][n];  //next
	
	// use vectors pls
	//dont use arrays
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			dp1[i][j]=0;
			dp2[i][j]=0;
		}
	}
	
	dp1[r][c]=1;
	
	for(int mov=1;mov<=k;mov++)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(dp1[i][j]!=0)
				{
					int ni=0;
					int nj=0;
					
					ni=i-2;
					nj=j+1;
					
					if(isvalid(ni,nj,n))
					{
						dp2[ni][nj]=dp[i][j]/8.0;
					}
					
					ni=i-1;
					nj=j+1;
					
					if(isvalid(ni,nj,n))
					{
						
					}
					
					
					ni=i+2;
					nj=j+1;
					if(isvalid(ni,nj,n))
					{
						
					}
					
					
					
				}
			}
		}
	}
	
}// complete the code  // logic is done
