
// subsets
//subset with duplicates 
//permutation c space
// permutation uppercase
//print space string
// josephus


// ip="ab"
// op="";
// ip-op tree
//-make ip somaller
// consider desigination gor inp them make inp samllaer

#include<bits/stdc++.h>
using namespace std;


void generate(string inp,string op,int k)
{
	//int val=op.length();
	if(inp.length()==0&&op.length()==k)
	{
		cout<<op<<endl;
		return;
	}
	
	char ch=inp[0];
	string op1=op;
	string op2=op;
	op2.push_back(ch);
	inp.erase(inp.begin()+0);
	generate(inp,op1,k);
	generate(inp,op2,k);
	
}
int main()
{
	
	string s="abc";
	
	string op="";
	
	int n=s.length();
	
	int k=2;
	generate(s,op,k);
	
	
}
