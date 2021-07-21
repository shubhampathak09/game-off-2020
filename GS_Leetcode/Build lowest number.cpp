// Remove k digits

#include<bits/stdc++.h>
using namespace std;


string removek(string num,int k)
{
	
	stack<char>st;
	for(int i=0;i<num.length();i++)
	{
		
		
		
		while(!st.empty()&&k>0&&st.top()>num[i])
		{
			
			st.pop();
			
			
			
			k--;
		}
		
		if(st.empty()==false&&num[i]=='0')
		{
			continue;
		}else
		{
			st.push(num[i]);
		}
	}
	
	while(st.empty()==false&&k--)
	{
		st.pop();
	}
	if(st.empty())
	{
		return "0";
	}
	
	string ans="";
	
	while(!st.empty())
	{
		char top=st.top();
		st.pop();
		ans=top+ans;
	}
	return ans;
}


int main()
{
	
	
	string num="1345";
	
	
	cout<<removek(num,2);
}
