// deletion from trie
#include<bits/stdc++.h>
using namespace std;

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



void insert(string word,trie*root)
{
	
}


bool find(string word,trie*root)
{
	return false;
}


bool isempty(trie*root)
{
	
	for(int i=0;i<26;i++)
	{
		if(root->child[i])
		return false;
	}
	return true;
}

trie*remove(trie *root,string key,int depth)
{



if(root==NULL)
return NULL;


if(depth==key.size())
{
	
	if(root->isend==true)
	root->isend=false;
	
	
	if(isempty(root))
	{
	
	delete(root);
	
	root=NULL;
}
return root;
}

int index=key[depth]-'a';
root->child[index]=remove(root->child[index],key,depth+1);


if(isempty(root)&&root->isend==false)
{
	delete(root);
	root=NULL;
}


return root;	
}

int main()
{
	
	
}
