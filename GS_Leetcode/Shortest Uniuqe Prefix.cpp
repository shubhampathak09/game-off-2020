// shortest unique prefix
#include<bits/stdc++.h>
using namespace std;


struct trie
{
	
	int fq;
	bool isend;
	map<char,trie*>child;
	string wr;
};


map<string ,string>result;

void insert(string word,trie*&root)
{
	
	trie*curr=root;
	
	for(int i=0;i<word.length();i++)
	{
		char c=word[i];
		if(curr->child.find(c)==curr->child.end())
		{
			curr->child[c]=new trie();
		}
			curr->child[c]->fq++;
		curr=curr->child[c];
	
	}
    
	curr->isend=true;
	curr->wr=word;
}



void printShortestUniquePrefix(struct trie*root,string word_so_far)
{
	
	
	if(root==NULL)
	return;
	
	
	
	if(root->fq==1)
	{
	//	cout<<word_so_far<<endl;
		
	//	result[root->wr]=word_so_far;
		return;
	}
	
	for(auto child:root->child)
	{
		printShortestUniquePrefix(child.second,word_so_far+child.first);
	}
}

int main()
{
	trie*root=new trie();
	
	vector<string>words=  { "AND", "BOOL", "BONFIRE", "CATCH", "CASE", "CHAR" };
	
	
	for(auto x:words)
	{
	 
		insert(x,root);
	}
	

//	
	string word_so_far="";
	
	printShortestUniquePrefix(root,word_so_far);
	
	
	cout<<"printing the prefix.."<<endl;
	

    //cout<<result.size();
	
	// will check
}

