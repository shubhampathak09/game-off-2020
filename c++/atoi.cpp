
// cool
#include<bits/stdc++.h>
using namespace std;


int myAtoiRecursive(string s, int n)
{
    // Base case (Only one digit)
    if (n == 1)
        return s[0] - '0';
  
    // If more than 1 digits, recur for (n-1), multiplu result with 10
    // and add last digit
    return (10 * myAtoiRecursive(s, n - 1) + s[n-1] - '0');
}

int main()
{
	string s="1234";
	
	int n=s.length();
	
	cout<<myAtoiRecursive(s,n);
	
	
}
