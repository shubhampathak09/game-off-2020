//max sum rectangle

#include<bits/stdc++.h>
using namespace std;

int kadane(vector<int>v)
{
	
	int csum=0;
	int maxsum=INT_MIN;
	
	int n=v.size();
	
	for(int i=0;i<n;i++)
	{
		
		
		if(csum>=0)
		{
			csum+=v[i];
		}else
		csum=v[i];
		
		if(csum>maxsum)
		maxsum=csum;
	}
	
	return maxsum;
}

int main()
{
	
	int r=4;
	int c=5;
	
	vector<vector<int>>v={{1,2,-1,4,-20},
	 {-8,-3,4,2,1},{3,8,10,-8,3},{-4,-1,1,7,-6}};
	 
	 int mx=INT_MIN;
	 
	
	for(int i=0;i<v.size();i++)
	{
		vector<int>mat(v[0].size());
		for(int j=i;j<v.size();j++)
		{
			for(int col=0;col<v[0].size();col++)
			{
				mat[col]+=v[j][col];
				
			}
			mx=max(mx,kadane(mat));
		}
	}
	
	
	cout<<mx;
}
