// LRU

#include<bits/stdc++.h>
using namespace std;


class LRUCache
{
	
	
	
	int csize;
	
	list<int>dq;
	
	map<int,list<int>::iterator>mp;


public:
	
	LRUCache(int n)
	{
		csize=n;
	}
	
	void refer(int x)
	{
		
		if(mp.find(x)==mp.end())
		{
			
			// not present in cache
			
			// if cahce if full
			
			if(dq.size()==csize)
			{
				
				int last=dq.back();
				
				dq.pop_back();
				
				mp.erase(last);
				
				dq.push_front(x);
				
				mp[x]=dq.begin();
			}
			else
			{
				
				dq.push_front(x);
				mp[x]=dq.begin();
				
			}
			
		}else
		{
			
			// x found in cache
			
			auto pos=mp[x];
			
			dq.erase(pos);
			
		    dq.push_front(x);
			
			mp[x]=dq.begin();
		}
		
		
		
	}
	void display()
	{
	
	for(auto x:dq)
	{
		cout<<x<<" ";
	}
	cout<<endl;	
	}
};

int main()
{
	
	
	LRUCache ca(4);
	
	ca.refer(1);
	
	ca.refer(2);
	
	ca.refer(3);
	
	ca.refer(1);
	
	ca.refer(1);
	
	ca.refer(4);
	
	ca.refer(5);
	
	ca.display();
	
}
