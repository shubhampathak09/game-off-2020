#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	
	vector<int>a={8,6,7};
	
	vector<int>temp=a;
	
	for(auto x:a)
	{
		temp.push_back(x);
	}
	
	int n=temp.size();
	
	vector<int>nge(n);
	
	nge[n-1]=-1;
	
	stack<int>s;
	s.push(temp[n-1]);
	
	for(int i=n-2;i>=0;i--)
	{
		
	while(s.empty()==false&&s.top()<=temp[i])
	{
		s.pop();
		}	
	if(s.empty())
	{
		nge[i]=-1;
		}
		else
		nge[i]=s.top();
		
		s.push(temp[i]);	
	}
	
	vector<int>res;
	
	for(int i=0;i<a.size();i++)
	{
		cout<<nge[i]<<" ";
		res.push_back(nge[i]);
	}
	
	cout<<endl;
}
