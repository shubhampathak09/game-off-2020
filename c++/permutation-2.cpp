// print permutation

#include<bits/stdc++.h>
using namespace std;


void permute(string given,string ans)
{
	
	if(given.length()==0)
	{
		cout<<ans<<endl;
		return;
	}
	
	for(int i=0;i<given.length();i++)
	{
		
	 char ch=given[i] ;
	 string left=given.substr(0,i);
	 string right=given.substr(i+1);
	 string ns=left+right;
	 permute(ns,ans+ch);
	 
	 
	}
}

int main()
{
	
	string s="abc";
	
	string ans="";
	
	permute(s,ans);
	
}
