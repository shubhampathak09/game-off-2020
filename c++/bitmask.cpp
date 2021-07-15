// bit mask

// set-: add, remove display

#include<bits/stdc++.h>
using namespace std;

void display(int subset);

void remove(int x,int subset)
{
	
	// first check if x is already presnet or not
	
	// as x will x-1th  bit
	x=x-1;
	
	
	if((1<<x)&subset==0)
	{
		cout<<" number not present in set so cangt remove";
		return;
	}
	
	int mask=(1<<x);
	
	subset=(subset)^mask;
	
	cout<<"After removing display the left numbers.."<<endl;
	
	display(subset);
}

void add (int x,int subset)
{
	// x will be x-1 th bit
	
	x=x-1;
	
	int mask=(1<<x);
	
	subset=(subset|mask);
	
	cout<<endl;
	
	display(subset);
		
}
void display(int subset)
{
	
	// n=10;
	
	
	for(int i=0;i<=9;i++)
	{
		int mask=(1<<i);
		if(subset&mask)
		{
			cout<<(i+1)<<" ";
		}
	}
}


int main()
{
	display(15); // 1 1 1 1
	
    cout<<endl;
	
	remove(2,15);
	
	add(6,15);
	
	

}


// basics of bit mask imporatnat concept
