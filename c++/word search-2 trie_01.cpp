// an intersetig application of trie
// word boogle-2

#include<bits/stdc++.h>
using namespace std;


#define M 3
#define N 3

struct node
{
	struct node*child[26];
	bool isend;
	
	node()
	{
		for(int i=0;i<26;i++)
		child[i]=NULL;
		
	    isend=true;
	}
	
};


void insert(node*root,string s)
{
	
	node*curr=root;
	
    for(int i=0;i<s.length();i++)
    {
    	int index=s[i]-'a';
    	if(curr->child[index]==NULL)
    	{
    		curr->child[index]=new node();
		}
		curr=curr->child[index];
	}
	
	 curr->isend=true;
}


int dx[]={1,1,0,-1,-1,-1,0,1};
int dy[]={0,1,1,1,0,-1,-1,-1};

void searchWord(int i,int j,node*root,bool visited[M][N],string word,char boggle[M][N])
{
	
	if(root->isend)
	{
		cout<<word;
		cout<<endl;
	}
	
	if(i>=0&&i<M&&j>=0&&j<N&&visited[i][j]==false)
	{
		visited[i][j]=1;
		
		for(int k=0;k<26;k++)
		{
			if(root->child[k]!=NULL)
			{
				char ch= (char)k+'A';
				for(int p=0;p<8;p++)
				{
					// i j alreadu in word srarching the adjacents
					
					if(i+dx[p]>=0&&j+dy[p]>=0&&i+dx[p]<M&&j+dy[p]<N&&visited[i+dx[p]][j+dy[p]]==0&&boggle[i+dx[p]][j+dy[p]]==ch)
					searchWord(i+dx[p],j+dy[p],root->child[k],visited,word+ch,boggle);
				}
				
			}
		}
		visited[i][j]=false;
	}
}

// cool

int main()
{
	
	
	// iterate thoright thae matrix , then picl
	// char such its in child of root
	// ch=boogle[i][j];
	// index ch-'a';
	//if(root->child[index]!=null)
	// str+ch;
	// search(word)
	// str="";
}
