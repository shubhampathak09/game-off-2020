// Node class

#include<bits/stdc++.h>
using namespace std;

class Node
{
	public:
		string name;
		
		list<string>nbrs;
		
		Node(string name)
		{
			this->name=name;
		}
};


class Graph
{
	
	// all nodes
	// location
	
	// Hahmap,string node*adress
	// same concept use in lru as well
	
	unordered_map<string,Node*>m;
	
	
	public:
		
		Graph(vector<string>cities)
		{
			
			for(auto city:cities)
			{
			
			m[city]=new Node(city);
				
			}
			
		}
		
		void addEdge(string x,string y,bool undirected=false)
		{
			
			m[x]->nbrs.push_back(y);
			if(undirected==true)
			{
				m[y]->nbrs.push_back(x);
			}
		}
		
	void display()
	{
			
//	map<string,Node*>::iterator it;
//	
//	for(it=m.begin();it!=m.end();++it)
//	{
//		cout<<it->first<<" ";
//		for(auto x:it->second.nbr)
//		{
//			cout<<x<<" ";
//		}
//		cout<<endl;
//		}	

  for(auto x:m)
  {
  //	if(x.second->nbrs.size()>=1)
  	cout<<x.first<<" : ";
  	
  	for(auto z:x.second->nbrs)
  	{
  		
    	  
  	cout<<z<<" ";
  }
  	cout<<endl;
  }

}
};


int  main()
{
	
	vector<string>cities={"London","Newyork","Paris","Budapest"};
	
	
	
	Graph *g=new Graph(cities);
	
	g->addEdge("Newyork","London");
	
	g->addEdge("Paris","NewYork");
	
	g->addEdge("Budapest","Paris");
	
	g->addEdge("Budapest","London");
	
	
g->display();	


// why iterator not working???
}
