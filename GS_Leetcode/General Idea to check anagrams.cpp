// brute force method just to check if two string are anagrams


#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	string s1="education";
	
	string s2="auctioned";
	
	
	
	map<char,int>mp;
	
	
	for(int i=0;i<s1.length();i++)
	{
		mp[s1[i]]++;
	}
	
	
	for(int i=0;i<s2.length();i++)
	{
		if(mp.find(s2[i])==mp.end())
		{
			cout<<"They are not anagrams";
			return 0;
		}
		
		
		mp[s2[i]]--;
		
		if(mp[s2[i]]==0)
		mp.erase(s2[i]);
	}
	
	
	if(mp.size()!=0)
	{
		cout<<"Not Anagrams";
		return 0;
	}else
	{
		cout<<"They are anagrams";
		return 0;
	}
}
