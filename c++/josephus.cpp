// josephus

#include<bits/stdc++.h>
using namespace std;

void josephus(vector<int>a,int index,int k)
{
	
	if(a.size()==1)
	{
		cout<<a[0];
		return;
	}
    
    int sz=a.size();
    int ki=(index+k)%sz;
    a.erase(a.begin()+ki);
    
    josephus(a,ki,k);
		
}

int main()
{
	
	int k=2;
	k--;
	
	vector<int>a={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	josephus(a,0,k);
	
	
}
