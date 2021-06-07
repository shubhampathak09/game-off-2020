// next greaet permutation

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	vector<int> nums={1,2,3};
	
	int n=nums.size();
	
	if(n==1)
	{
		return 0;
	}
	int lastInc=-1;
	int i=1;
	
	while(i<n)
	{
	if(nums[i]>nums[i-1])
	{
		lastInc=i;
		}
		i++;	
	}
	
	if(lastInc==-1)
	{
		
		// descending order
		
		int mid=n/2;
		
		for(int i=0;i<mid;i++)
		{
			swap(nums[i],nums[n-i-1]);
		}
		
		for(auto x:nums)
		{
			cout<<x;
		}
		return 0;
	}
	
	int ele=nums[lastInc];
	int index=lastInc;
	for(i=lastInc;i<n;i++)
	{
		if(nums[i]>nums[lastInc-1]&&nums[i]<nums[lastInc])
		{
			index=i;
		}
	}
	swap(nums[index],nums[lastInc-1]);
	sort(nums.begin()+lastInc,nums.end());
	
	for(auto x:nums)
	{
		cout<<x;
	}
}
