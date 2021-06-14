#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	string s;
	getline(cin,s);
	
//	reverse(s.begin(),s.end());
	
	int k=0;
	
	for(int i=0;i<s.length();i++)
	{
		if(s[i]==' ')
		{
			cout<<i<<" ";
			reverse(s.begin()+k,s.begin()+i-1);
			k=i+1;
		}
	}
	cout<<s;
//	for(int i=0;i<s.length();i++)
//	{
//		
//		
//		if(s[i]==' ')
//		{
//			cout<<i<<" "<<k<<endl;
//			reverse(s.begin()+k,s.begin()+i-1);
//			k=i+1; 
//		}
//		
//	}
//	cout<<k<<" "<<s.length()-1;
	reverse(s.begin()+k,s.end());
	
	cout<<s;
}
