// power

#include<bits/stdc++.h>
using namespace std;

int power2(int n,int x)
{
	if(x==1)
	{
		return n;
	}
	
	
	if(x&1)
	{
		return power2(n,x/2)*power2(n,x/2)*n;
	}
	else
	{
		return power2(n,x/2)*power2(n,x/2);
	}
}

int power(int n,int x)
{
	
	if(x==0)
	{
		return 1;
	}
	
	return n*power(n,x-1);
	
}

int main()
{
	
cout<<power(10,3);

cout<<endl;

cout<<power2(2,3);	



}
