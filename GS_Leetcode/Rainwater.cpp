//Rainwater

// calculate water for evry col bar

// min(maxheightleft,maxheigghtright)-height[i]

//

#include<bits/stdc++.h>
using namespace std;

int trappedwater(vector<int>height)
{
	
	
	int n=height.size();
	
	if(n<=2)
	return 0;
	
	vector<int>left(n,0);
	vector<int>right(n,0);
	
	left[0]=height[0];
	right[n-1]=height[n-1];
	for(int i=0;i<n;i++)
	{
		left[i]=max(left[i],left[i-1]);
	}
	for(int i=n-2;i>=0;i--)
	{
		right[i]=max(right[i],right[i+1]);
	}
	
	int ans=0;
	for(int i=0;i<=n-1;i++)
	{
		ans+=min(left[i],right[i])-height[i];
	}
	
	return ans;
}

int main()
{
	
	// test code here
	
}
