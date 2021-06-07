// one element repeated 2 and one missiong fing the number 1-n

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	int a[]={4,3,6,2,1,1};
	
//	int n=sizeof(a)/sizeof(a[0]);
	
	int n=6;
	map<int,int>mp;
	
	for(int i=0;i<n;i++)
	{
		
		mp[a[i]]++;
	}
	
   map<int,int>::iterator it;
 
 int m,r;
 
  for(it=mp.begin();it!=mp.end();++it)
  {
  	
  	if(mp[it->first]>1)
  	{
  		r=it->first;
	  }
   } 
 
   for(int i=1;i<n;i++)
   {
   	if(mp.find(i)==mp.end())
   	{
   		m=i;
	   }
   }
   
   cout<<r<<endl;
   cout<<m<<endl;
	}

