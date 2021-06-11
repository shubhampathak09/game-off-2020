// recursion in arraylist string and stringbuilder


//ArrayList<String>st=new ArrayList<>();

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	string s="ABZ";   //26*26+26*2+26=676+52+26=676+78=754
	
	
	
	// find row col number
	
	int res=0;
	for(char c:s)
	{
		int val=(c-'A')+1;
		res=res*26+val;
	}
	
	cout<<res;
}



