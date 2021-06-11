// excel sheet cloumn value

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	int n=702;
	
	string result="";
	
	while(n)
	{
		char c= (n-1)%26 +'A';
		result=c+result;
		n=(n-1)/26;
	}
	
	cout<<result;
}
