// replace all spaces in string with %20

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	string sample="hello,world, how are you?";
	
	//string s;
	
	int n=sample.length();
	
	int cnt_space=0;
	
	for(int i=0;i<n;i++)
	{
		if(sample[i]==' ')
		{
			int cnt_space=cnt_space+1;
			sample.push_back('%');
			sample.push_back('2');
			sample.push_back('20');
		}
		else
		sample.push_back(sample[i]);
	//	cout<<sample<<endl;
		
	
	
	}
	
//	int additional=n+2*cnt_space;

	sample=sample.substr(n);
	
	cout<<sample;
	// standarway
	 
//   
//   for(auto x:sample)
//   {
//   
//   int index=x.find(" ");
//   while(index!=-1)
//   {
//   	
//   	x[index]='*';
//   	index=x.find(" ",index+1);
//   	
//	   }	
//   	
//   	
//   	cout<<x<<endl;
//   }
	
	
	
	
	
}
