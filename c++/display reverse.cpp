// display array in reverse

#include<bits/stdc++.h>
using namespace std;

void displayreverse(int a[],int idx,int n)
{
	
	// 5 4 1 2 3   3 2 1 4 5
	           // 3 2 1 4
	 if(idx==n)
	 {
	 	
	 //	cout<<a[idx];
	 	return;
	 	
	 }
			             
	 int num=a[idx];
	 
	 displayreverse(a,idx+1,n);          
	 cout<<""+num;          
}

int main()
{
	
	
int a[]={3,4,5,1,2,3};
	
int n=sizeof(a)/sizeof(a[0]);	 
	
	
	int idx=0;
   displayreverse(a,idx,n);	
	
}

// wtf face

