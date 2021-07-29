// brute force method just to check if two string are anagrams


#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	string s1="education";
	
	string s2="auctioned";
	
	
	
	map<char,int>mp;
	
	
	for(int i=0;i<s1.length();i++)
	{
		mp[s1[i]]++;
	}
	
	
	for(int i=0;i<s2.length();i++)
	{
		if(mp.find(s2[i])==mp.end())
		{
			cout<<"They are not anagrams";
			return 0;
		}
		
		
		mp[s2[i]]--;
		
		if(mp[s2[i]]==0)
		mp.erase(s2[i]);
	}
	
	
	if(mp.size()!=0)
	{
		cout<<"Not Anagrams";
		return 0;
	}else
	{
		cout<<"They are anagrams";
		return 0;
	}
}


/*


struct TrieNode
{
    // each node stores a map to its child nodes
    map<char, TrieNode*> child;
 
    // stores anagrams in the leaf node
    string words;
};
 
// Function to insert a string into a Trie
void insert(TrieNode* &root, string word, string originalWord)
{
    // start from the root node
    TrieNode* curr = root;
    for (char c: word)
    {
        // create a new node if the path doesn't exist
        if (curr->child.find(c) == curr->child.end()) {
            curr->child[c] = new TrieNode();
        }
 
        // go to the next node
        curr = curr->child[c];
    }
 
    // anagrams will end up at the same leaf node
    curr->words += originalWord + ' ';
}
 
// A recursive function that traverses a Trie in preorder fashion and
// prints all anagrams together
void printAnagrams(TrieNode *root)
{
    // base case
    if (root == nullptr) {
        return;
    }
 
    // print the current word
    if (root->words.length() != 0) {
        cout << root->words << endl;
    }
 
    // recur for all child nodes
    for (auto &child: root->child) {
        printAnagrams(child.second);
    }
}
 
// Function to group anagrams from a given list of words
void groupAnagrams(vector<string> &words)
{
    // construct an empty trie
    TrieNode* root = new TrieNode();
 
    // do for each word
    for (string word: words)
    {
        // Sort the characters of the current word and insert it into the Trie.
        // The original word gets stored in the leaf node
 
        string sorted = word;
        sort(sorted.begin(), sorted.end());
 
        insert(root, sorted, word);
    }
 
    // print all anagrams together
    printAnagrams(root);
}

*/
