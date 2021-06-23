// word boggle 2 
#include<bits/stdc++.h>
using namespace std;

#define N 3

char boogle[N][N]={ { 'G', 'I', 'Z' },
                          { 'U', 'E', 'K' },
                          { 'Q', 'S', 'E' } };


struct trie
{
	
	trie*child[26];
	bool isend;
	
	trie()
	{
		for(int i=0;i<26;i++)
		child[i]=NULL;
		
		isend=false;
	}
};

trie*root;



void search(trie*root,bool visited[N][N],int i,int j,string s)
{
	
	if(root->isend==true)
	{
		cout<<s<<endl;
		return;
	}
	
	
	if(i>=0&&i<N&&j>=0&&j<N)
	{
		
		visited[i][j]=true;
		
		for(int k=0;k<26;k++)
		{
			if(root->child[k]!=NULL)
			{
				 
				 char ch=(char)k+(char)'A';
				 
				 if(i+1>=0&&i+1<N&&j+1>=0&&j+1<N&&boogle[i+1][j+1]==ch) 
				 search(root->child[k],visited,i+1,j+1,s+ch); 
				 
				 if(i>=0&&i<N&&j+1>=0&&j+1<N&&boogle[i][j+1]==ch)
				 search(root->child[k],visited,i,j+1,s+ch);
				 
				 if(i+1>=0&&i+1<N&&j-1>=0&&j-1<N&&boogle[i+1][j-1]==ch)
				 search(root->child[k],visited,i+1,j-1,s+ch);
				 
				 if(i>=0&&i<N&&j-1>=0&&j-1<N&&boogle[i][j-1]==ch)
				 search(root->child[k],visited,i,j-1,s+ch);
				 
				 if(i-1>=0&&i-1<N&&j-1>=0&&j-1<N&&boogle[i-1][j-1]==ch)
				 search(root->child[k],visited,i-1,j-1,s+ch);
				 
				 if(i-1>=0&&i-1<N&&j>=0&&j<N&&boogle[i-1][j]==ch)
				 search(root->child[k],visited,i-1,j,s+ch);
				 
				 if(i-1>=0&&i-1<N&&j+1>=0&&j+1<N&&boogle[i-1][j+1]==ch)
				 search(root->child[k],visited,i-1,j+1,s+ch);
				 
				 if(i+1>=0&&i+1<N&&j>=0&&j<N&&boogle[i+1][j]==ch)
				 search(root->child[k],visited,i+1,j,s+ch);
			}
		}
		visited[i][j]=false;
	}
}
void insert(struct trie*root,string s)
{
	
	
	struct trie*curr=root;
	for(int i=0;i<s.length();i++)
	{
		
		int index=s[i]-'A';
//		cout<<index<<" ";
		if(curr->child[index]==NULL)
		{
			curr->child[index]=new trie();
		}
        curr=curr->child[index];		
		}
		
		curr->isend=true;	
}


bool search(struct trie*root,string s)
{
	
	struct trie*curr=root;
	
	for(int i=0;i<s.length();i++)
	{
		int index=s[i]-'A';
		if(curr->child[index]==NULL)
		{
			return false;
		}
		curr=curr->child[index];
	}
	
	return curr->isend==true;
	}

int main()
{
	
	vector<string>dict={"GEEKS","FOR","QUIZ","GEE" };
    
	
	root=new trie();
	
	for(auto x:dict)
	{
	
	insert(root,x);
}
	bool visited[N][N];
	
	for(int i=0;i<N;i++)
{
	for(int j=0;j<N;j++)
	visited[i][j]=true;
}
	
	struct trie*curr=root;
	
	string str="";
	
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			
			
			if(curr->child[boogle[i][j]-'a'])
			{
				str.push_back(boogle[i][j]);
				search(root,visited,i,j,str);
				str="";
			}
			
			}	
}
}




/*
	cout<<search(root,"FOR")<<endl;
	cout<<search(root,"geek");	
*/

