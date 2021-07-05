
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
	
	return curr->isend==1;
}


void delete_trie(string word,trie*root)
{
     
	 if(search(word,root)==false)
	 {
	 	cout<<"Not possible to delete word that does not exisit in trie";
	 	cout<<endl;
		 return;
		 }	
		 
		 
		trie*curr=root; 
		 
		 
		 for(int i=0;i<word.length();i++)
		 {
		 	int index=word[i]-'a';
		 	if(curr->child[index]!=NULL)
		 	{
		 		curr=curr->child[index];
			 }
		 }
		 
		 curr->isend=0;
		 return;
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
	
	
	cout<<search("dog",root)<<endl;  // 1 now
	
	cout<<search("cater",root);
	
	cout<<endl;
	
	delete_trie("cater",root);
	
	cout<<search("deer",root);
	
	delete_trie("dog",root);
	
	cout<<endl;
	
	cout<<search("dog",root);  // now set to 0
}
