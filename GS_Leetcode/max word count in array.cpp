#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	vector<string>words={"geeks","for","geeks","a","portal","to","learn","can","be","computer","science","zoom","yup","fire","in","be","data","geeks"};
	
	
	
	
	map<string,int>fq;
	
	
	
	for(auto x:words)
	{
		fq[x]++;
	}
	
	
	map<string,int>::iterator it;
	
	int mxf=0;
	string wr="";
	for(it=fq.begin();it!=fq.end();it++)
	{
		if(it->second>mxf)
		{
			mxf=it->second;
			wr=it->first;
	}
//
//cout<<it->first<<" "<<it->second;
//cout<<endl;   // map will also sort the values according to keys in ascending order just like tries

	}
	
	cout<<wr;
	
	
	//
}


// try solving it with tries it becomes a good problem
//
