// grouping Anagrams together using trie#

#include<bits/stdc++.h>
using namespace std;


struct trie{
	
	bool isend;
	
	map<char,trie*>mp;
};



void insert(string word,trie*root)
{
	
	trie*curr=root;
	
	for(auto ch:word)
	{
		if(curr->mp.find(ch)==curr->mp.end())
		{
			curr->mp[ch]=new trie();
		}
		curr=curr->mp[ch];
	}
	curr->isend=true;
}


bool find(string gword,trie*root)
{
	
	trie*curr=root;
	
    for(auto ch:gword)
	{
		
		if(curr->mp.find(ch)==curr->mp.end())
		{
			return false;
		}
		
		curr=curr->mp[ch];
		}	
	
	
	if(curr->isend==true)
	return true;
	else
	return false;
}



int main()
{

map<string,set<string>>anagrams;


//vector<string>dict={"cat","rat","pat","fat"};


vector<string> words = {
        "auctioned", "actors", "altered", "streaming", "related",
        "education", "aspired", "costar", "despair", "mastering"
    };

trie *root=new trie();

	
for(auto x:words)
{
	string temp=x;
	
	sort(temp.begin(),temp.end());
	
	if(find(temp,root)==1)
	{
		anagrams[temp].insert(x);
	}
	else
	{
    anagrams[temp].insert(x);	
	insert(temp,root);
}
	}	
	
//	cout<<find("dac",root);
	
//	cout<<find("cat",root);



for(auto x:anagrams)
{
	
	for(auto y:x.second)
	{
		cout<<y<<" ";
	}
	cout<<endl;
}

}
