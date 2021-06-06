#include<bits/stdc++.h>
using namespace std;

void solve(string in, string out,int index)
{
	
	if(index==in.length())
	{
		cout<<out<<endl;
		return;
	}
	
	 char x=in[index];
	string out1=out;
	string out2=out;
	
	out1.push_back(x);
	out2.push_back(toupper(x));
	
	solve(in,out1,index+1);
	solve(in,out2,index+1);
	
}


int main()
{
	
	
	solve("abc","",0);
	
}
