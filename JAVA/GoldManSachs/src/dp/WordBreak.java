package dp;

import java.util.List;

import java.util.*;

public class WordBreak {

	
	public static boolean wordBreak(String s, List<String> wordDict) {
        
	
	HashSet<String>hs=new HashSet<>();	
	
	int[] dp=new int[s.length()];
	
	int n=dp.length;
	
	for(String word:wordDict)
	{
		hs.add(word);
		
	}
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<=i;j++)
		{
			String wo=s.substring(j,i+1);
			
			if(hs.contains(wo)==true)
			{
				if(j>0)
				dp[i]+=dp[j-1];
				else
				dp[i]=1;	
			}
		}
		
	}
	
	if(dp[n-1]>0)
		return true;
	else
		return false;
    //return dp[n-1];
	}
	
	
	public static void main(String[] args)
	{
		
		String s="catsandog";
		
		List<String>wordDict=new ArrayList<>();
		
		wordDict.add("cats");
		wordDict.add("dog");

		wordDict.add("sand");
		wordDict.add("and");
		wordDict.add("cat");
		 
		
		
		boolean result=wordBreak(s,wordDict);
		
		System.out.println(result);
		
	}

}
