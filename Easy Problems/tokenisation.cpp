// string tokenisation

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	string input;
	
	getline(cin,input);
	
	stringstream ss(input); // stringstream buffer
	
	// supports  >> and <<
	
	vector<string>tokens;
	 
	string token;
	
	while(getline(ss,token,' '))
	{
		tokens.push_back(token);
		
	}
	

	for(auto t:tokens)
	{
		cout<<t<<endl;
	}
}
