// group anagrams

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	map<string,vector<string>>mp;
	vector<string> strs={"eat","tea","tan","ate","nat","bat"};
	
	for(int i=0;i<strs.size();i++)
	{
		
		
		string curr=strs[i];
		sort(curr.begin(),curr.end());
		mp[curr].push_back(strs[i]);
		
		
	}
	
    vector<vector<string>>result;
		
	for(auto it:mp)
	{
	    result.push_back(it.second);
			
		for(auto x:it.second)
		{
			cout<<x<<" ";
		}
		cout<<endl;
	}
	
//	cout<<result.size();
	
	//cout<<result[1][1];
	return 0;
}
