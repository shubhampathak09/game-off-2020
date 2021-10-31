#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b)
{
	if(b==0)
	return a;
  else
return gcd(b,a%b);
	
}

int main()

{
	
	
cout<<gcd(12,15)<<endl;
cout<<gcd(16,4)<<endl;

cout<<gcd(15,16)<<endl;

cout<<gcd(15,12)<<endl;


	
	
}

