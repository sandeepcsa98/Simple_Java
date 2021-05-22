package com.example;

import java.util.*;
public class LinkedLists {
	
	public static void main(String args[]) {
		
		 LinkedList<String> ll=new LinkedList<String>();  
		 
		 
		 ll.add("Sandeep");
		 ll.add("xyz");
		 ll.add("yella");
		 
		 ll.offer("ss");
		 

		 
		 ll.addFirst("Sandeep123");  //implements deque inteface
		 ll.addLast("Sanjaycs");
		 
		 ll.peekLast();  //it return last element
		 
		 ll.pollFirst();
		 
		 ll.removeLast();
		 for(String e:ll) {
			 System.out.println(e);
		 }
		 
	
		
		 
		 //descending
		 
		 System.out.println("------------------");
		 
		 Iterator itr = ll.descendingIterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
		 
		 
	
		
	}

}
