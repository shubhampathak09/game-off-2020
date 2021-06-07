// largest number

#include<bits/stdc++.h>
using namespace std;

bool cmp(string x,string y)
{
	
	string s1=x+y;
	string s2=y+x;
	
	return s1>s2;
}

int main()
{
	
	
	vector<int>a={54,546,548,60};
	
	vector<string>s;
	
	for(auto x:a)
	{
		string temp=to_string(x);
		s.push_back(temp);
	}
	
	sort(s.begin(),s.end(),cmp);
	
	if(s[0]=="0")
	{
		cout<<"not possible";
		return;
	}
	
	for(auto x:s)
      cout<<x;
}
