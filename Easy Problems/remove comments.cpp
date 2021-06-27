//remove comments
 
#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	
//	vector<vector<string>>source={"/*Test program*/","int main()","// variable declaration","{"," ","int a,int b,int c;","/* This is a test","multiline","comment for","testing */","a= b + c;"};

 //   vector<vector<string>>sorce={"you are","such","an ass"};
	
	vector<string>result;
	
	bool blocked=false;
	
	vector<string>res;
	
    for(string s:source)
    {
    	string out="";
    	
    	for(int i=0;i<s.size();i++)
    	{
    		
    		if(!blocked)
    		{
    			if(i==s.size()-1)
    			{
    				out+=s[i];
				}
				else
				{
					string t=s.substr(i,2);
					if(t=="/*")
					{
						blocked=true;
					//	i++;
					}else if(t=="//")
					{
						break;
					}else
					{
						out+=s[i];
					}
				}
			}
			else
			{
			
			
			string t=s.substr(i,2);
			
			if(t=="*/")
			{
				i++;
				blocked=false;
				
				}	
		// **
				
				
			}
    		
		}
	}
	
	// cool 
}

