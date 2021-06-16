
// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

struct petrolPump
{
    int petrol;
    int distance;
};


 // } Driver Code Ends
/*
The structure of petrolPump is 
struct petrolPump
{
    int petrol;
    int distance;
};*/

/*You are required to complete this method*/
class Solution{
  public:
  
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(petrolPump p[],int n)
    {
       //Your code here
       
       
       for(int i=0;i<n;i++)
       {
           
           int start=i;
           int end=i;
           int distance=0;
           int current=p[start].petrol;
           while(true)
           {
           bool flag1=false;
           bool flag2=false;
               
           if(current<p[start].distance)
           {
               i=i+1;
               start=i;
               end=i;
               distance=0;
             current=p[start].petrol;
             flag1=true;
             flag2=true;
           }
           else
           {
               distance=distance +p[start].distance;
               current=current-p[start].distance;
               start=i+1;
               if(start==end)
               {
                   return 1;
               }
               flag1=true;
               flag2=true;
           }
           
           
           if(flag1==false&&flag2==false)
           break;
           }
       }
       return 0;
    }
};



// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        petrolPump p[n];
        for(int i=0;i<n;i++)
            cin>>p[i].petrol>>p[i].distance;
        Solution obj;
        cout<<obj.tour(p,n)<<endl;
    }
}
  // } Driver Code Ends
