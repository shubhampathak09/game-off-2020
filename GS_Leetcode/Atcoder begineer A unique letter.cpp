#include<bits/stdc++.h>
using namespace std;

void solve(string s){
     map<char,int>mp;
     char c;
	for(auto x: s){
		mp[x]++;
		}
	}
	for(auot x :mp){
		if(mp[x]==1){
			cout<<x<<endl;
			return;
	}
	}
	cout<<-1<<endl;
	return;
}

int main(){
	solve(string s);
}
