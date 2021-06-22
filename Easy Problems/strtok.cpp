// strktok another function

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	
	char input[1000];
	// strtok works on character arrays
	
	cin.getline(input,1000);
	
	char *token=strtok(input," ");
	
	
	cout<<token<<endl;
	
	while(token!=NULL)
	{
		//token=
		token=strtok(NULL," ");
		cout<<token<<endl;
	}
	
//	cout<<strtok(NULL," ")<<endl;
//	cout<<strtok(NULL," ")<<endl;
//	
	// states are stored in static variable
	// how does this functuon now next state
	//?
	
	
}
