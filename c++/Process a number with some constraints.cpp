#include<bits/stdc++.h>
using namespace std;

int cont=0;

void solve(int n,int c,vector<int>&res)
{
	
	if(c>n)
	{
		cont++;
		for(auto x:res)
		cout<<x<<" ";
		cout<<endl;
		return;
	}
	for(int i=0;i<2*n;i++)
	{
		if(res[i]==-1&&res[i+c+1]==-1&&(i+c+1)<2*n)
		{
			res[i]=c;
			res[i+c+1]=c;
			solve(n,c+1,res);
			
			res[i]=-1;
			res[i+c+1]=-1;
		}
	}
}
//0 1 2 3 4 5
// 3 1 2 1 3 2
int main()
{
	
	
	int c=1;
	int n=7;
	
	vector<int>res(2*n);
	
	for(int i=0;i<2*n;i++)
	res[i]=-1;
	
	solve(n,c,res);
	
	cout<<"Total Solution"<<" "<<cont;
}
