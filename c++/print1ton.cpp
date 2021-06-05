// print 1 to n

#include<bits/stdc++.h>


using namespace std;

void print(int n)   //1 2 3 4 5 // n
{
	if(n==0)
	{
		return;
	}
	
    int x=n;
    
    print(x-1);
    cout<<x<<" ";
  //  return;
}

int main()
{
	
	print(5);
	
}
