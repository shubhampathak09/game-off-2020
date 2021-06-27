#include<bits/stdc++.h>
using namespace std;

class graph
{
	int V;
	
	list<int>*adj;
	
	public:
		graph(int V)
		{
			this->V=V;

		}
		
		void addedge(int v,int w)
		{
			adj[v].push_back(w);
		//	ad[w].push_back(v);
		}
		
		void bfs(int s)
		{
			
     		bool *visited=new bool[V];	
			
			for(int i=0;i<V;i++)
			{
				
				visited[i]=false;
			}
			
			
			queue<int>q;
			
			
			visited[s]=true;
			
			q.push(s);
			
			
			while(!q.empty())
			{
				
				int s=q.front();
				
				cout<<s<<" ";
				q.pop();
				
				for(auto x:adj[s])
				{
					if(visited[x]==false)
					{
						visited[x]=true;
						q.push(x);
					}
				}
			}
		}
};

int main()
{
	
	// can test
	
}
