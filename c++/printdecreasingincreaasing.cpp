//
#include<bits/stdc++.h>    
using namespace std;

void pdi(int n)
{
	if(n==1)
	{
		cout<<1<<endl;
		cout<<1<<endl;
		return;
	}
	// base case
	
	cout<<n<<endl;
	pdi(n-1);
	cout<<n<<endl;
}

int main()
{
	
	int n;
	cin>>n;
	
	pdi(n);
	
//	3
//	2
//	1
//	1
//	2
//	3
//	
//	3
//	2
//	1
//	1
//	2
//	3
}
