// example 2

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	string para="welcome here in my world,you are free to do anything unless you start breaking my codes";
	
	string s;
	
	getline(cin,s);
	
	
	
	int index=para.find(s);
	
	cout<<index;
	
	
	
	index=para.find(s,index+1);
	
	cout<<endl;
	
	if(index!=-1)
	cout<<index;
	else 
	cout<<-1;
	
}
