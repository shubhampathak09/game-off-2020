
#include<bits/stdc++.h>
using namespace std;

struct trie
{
	
	struct trie*child[26];
	int isend;
	
	trie()
	{
		for(int i=0;i<26;i++)
		child[i]=NULL;
		
		isend=0;
		
	}
	
};



void insert(string word,trie*root)
{
	
	
	trie*curr=root;
	
	
	for(auto x:word)
	{
		int index=x-'a';
		
		if(curr->child[index]==NULL)
		{
			curr->child[index]=new trie();
		}
		curr=curr->child[index];
	}
	curr->isend=1;
}


bool search(string word,trie*root)
{
	
	trie*curr=root;
	
	for(auto x:word)
	{
		int index=x-'a';
		
		if(curr->child[index]==NULL)
		{
			return false;
		}
		curr=curr->child[index];
	}
	
	return curr->isend==true;
}


void delete(string word,trie*root)
{
	
	// complete the fuction body here
	
}

int main()
{
	
	
	struct trie*root=new trie();
	
	insert("dog",root);
	insert("deer",root);
	insert("duck",root);
	insert("dragon",root);
	insert("cat",root);
	
	insert("caterpillar",root);
	
	
	cout<<search("dog",root)<<endl;
	
	cout<<search("cater",root);
	
	
}
