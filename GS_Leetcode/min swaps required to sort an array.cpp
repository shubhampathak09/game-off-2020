// min swaps to sort an array

#include<bits/stdc++.h>
using namespace std;

int solve(vector<int>arr)
{
	
	int n=arr.size();
	
//	cout<<n;
	
	vector<pair<int,int>>p(n);  // problems when we dont declare size why?
	
	
	for(int i=0;i<n;i++)
	{
	p[i].first=arr[i];
	p[i].second=i;	
	}
	
	vector<bool>visited(n,false);
	
	sort(p.begin(),p.end());
	// debug
//	for(int i=0;i<n;i++)
//	{
//		cout<<p[i].first<<" "<<p[i].second<<endl;
//	}
	
	int ans=0;
	
	for(int i=0;i<n;i++)
	{
		if(visited[i]==true||i==p[i].second)
		continue;
		
		int cycle=0;
		int node=i;
		while(!visited[node]){
			visited[node]=true;
			int next_pos=p[node].second;
			node=next_pos;
			cycle=cycle+1;
		}
		ans+=cycle-1;
		
		
		
	}
	
	return ans;
	
}


int main()
{
	
	
	vector<int>arrr={1,5,4,3,2};
	
	cout<<solve(arrr);
	
	
	// cool
	
	// nice algo
	
}
