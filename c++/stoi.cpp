#include<bits/stdc++.h>
using namespace std;
 

int integerstring(string s,int n)
{
	
	/// 1234    4321
	if(n==1)
    {
    	//cout<<s[0]-'0';
    	return s[0]-'0';
	}
	
	
	
	int lastremove=s[n-1]-'0';
//	int rem=integerstring(s,n-1);
	
	//int remin=integerstring(s);
     return 10*(integerstring(s,n-1))+lastremove;
	 
	//sum+= 	
	//cout<<remin<<endl;   //321
     
	//cout<<num;
	//return 10*integerstring(s)+lastremove;
}

int main()
{
	
	
	string s="1234";
	
	
 
	cout<<s;
	//cout<<s;
	
//	int pos=s.length()-1;
	int n=s.length();
	
	int x=integerstring(s,n);
	
	
	cout<<x;
	
	
//	int x='1'-'0';
//	
//	
//	cout<<x;
	// 4321 ->s
	
	
	
	
	
	
}
