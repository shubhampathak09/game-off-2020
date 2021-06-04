// merger overlapping intervals

#include<bits/stdc++.h>
using namespace std;

struct node
{
	int start;
	int finish;
	
	node(int start,int finish)
	{
		this->start=start;
		this->finish=finish;
	}
};

bool cmp(struct node m1,struct node m2)
{
	
	return m1.finish>m2.finish;
	
}

int main()
{
	
	int n=6;
	
	node meetings[6]={{22,28},{1,8},{25,27},{14,19},{27,30},{5,12}};
	
	
	sort(meetings,meetings+6,cmp);
	
	stack<node>s;
	
	for(int i=0;i<n;i++)
	{
		s.push(node(meetings[i].start,meetings[i].finish));
	}
	
	while(s.size()>=2)
	{
		node first=s.top();
		s.pop();
		node second=s.top();
		s.pop();
		// check overlap
		if(first.finish<=second.start||first.start<=second.finish)
		{
			
			node nw=new node(min(first.start,second.start),min(first.finish,second.finish));
			s.push(nw);
		}
		else
		{
			cout<<first.start<<" "<<first.finish<<endl;
			cout<<second.start<<" "<<second.finish<<endl;
		}
	}
	
	if(!s.empty())
	//cout<<meetings[0].finish;
	cout<<s.top().start<<" "<<s.top().second<<endl;
}// fuck iot


// fu

