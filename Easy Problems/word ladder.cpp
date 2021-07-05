#include<bits/stdc++.h>
using namespace std;


struct node
{
	string word;
	int level;
	
	node(string word,int level)
	{
		this->word=word;
		this->level=level;
	}
};
 

int wordladder(string start,string target)
{
	
	
	queue<node>q;
	q.push(new node(start,1));
	
	
	while(!q.empty())
	{
		
		auto x=q.front();
		q.pop();
		
		if(x.word==target)
		return x.level;
		
		string cword=x.word;
		
		for(int i=0;i<cword.size();i++)
		{
			char orig_char=cword[i];
			for(char c='a';c<='z';c++)
			{
				cword[i]=c
				
				if(cword==target)
			}
		}
	}
}
//???
int main()
{
	
	
	
}
