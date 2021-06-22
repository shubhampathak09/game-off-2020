// find all occurecndec of given wiord inside a string

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	string s="hello everyone how are you doing? i am doint good, and wish to see every once doing well and safe.The outbreak of covid is goinf to end soon";
	
	
	string search="to";
	
	
	int index=s.find(search);
	 
	 while(index!=-1)
	 {
	 	
	 	cout<<index<<" "<<s.substr(index,2)<<endl;
	    
		
		 	
	 	index=s.find(search,index+1);
	 	
	 }
	// noice
}
