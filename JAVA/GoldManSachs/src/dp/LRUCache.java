package dp;

import java.util.*;

public class LRUCache {

	
	//static int CAP_SIZE=4;
	
	int capacity;
	
	public Deque<Integer>cache;
	
	public HashSet<Integer>lookup;
	
	
	LRUCache(int size)
	{
		
		this.capacity=size;
		cache=new LinkedList<>();
		lookup=new HashSet<Integer>();
		
	}
	
	public void refer(int key)
	{
		
		if(!lookup.contains(key))
		{
			if(cache.size()==capacity)
			{
				int last=cache.removeLast();
				lookup.remove(last);
				 cache.addFirst(key);
				lookup.add(key);
				
			}
			else
			{
				  // does not contain key and cachje is not full
				cache.addFirst(key);
				lookup.add(key);
			}
			
		}
		else
		{
			cache.remove(key);
			cache.addFirst(key);
			lookup.add(key);
		}
		
		 
	}
	
	public void display()
	{
		 
		for(int i:cache)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		
		
		LRUCache lru=new LRUCache(4);
		
		lru.refer(1);
		lru.refer(2);
		lru.refer(3);
		lru.refer(1);
		lru.refer(4);
		lru.refer(5);
		
		lru.display();
	}`
	
}
// somthing getting messed up here
// needed to addFIrst ande removeLast operation
// dequeu is nothing but douubly linked list

// see impl of dequeu, HashSet,HashMap,LinkedHashMap etc to know more about java programming
// and internal working
//