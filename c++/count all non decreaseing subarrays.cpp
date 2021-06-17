 // codechef easy dp-1
 
 #include<bits/stdc++.h>
 using namespace std;
 
 
 int main()
 {
 	
 	int t;
 	
 	cin>>t;
 	
 	while(t--)
 	{
 		
	 int n;
	 
	 cin>>n;
	 
    vector<int>a(n);	
 	//int a[]={1,4,2,3};
 	
 	//int n=sizeof(a)/sizeof(a[0]);
 	for(int i=0;i<n;i++)
 	{
 		cin>>a[i];
	 }
 	
 	int dp[n];
 	
 	dp[0]=1;
 	
 	int count=dp[0];
 	
 	for(int i=1;i<n;i++)
 	{
 		
 		
 		if(a[i]>a[i-1])
 		{
 			dp[i]=dp[i-1]+1;
		 }
 		else
 		{
 			dp[i]=1;
		 }
		 
		 count=count+dp[i];
	 }
 	
 	cout<<count<<endl;
 }
 }

 
