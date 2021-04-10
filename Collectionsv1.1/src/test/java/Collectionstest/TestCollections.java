package Collectionstest;

import java.util.Scanner;

import com.collections.AllStringManipulationsUsingCcollections;
import com.collections.ArrayConcepts;

public class TestCollections {
	
	 static ArrayConcepts arr;
	 static AllStringManipulationsUsingCcollections string;
	 static Scanner scn;
	
	public static void main (String[] args)
	{
		scn = new Scanner(System.in);
		arr = new ArrayConcepts();
		arr.ArrayImplementation();
		arr.rotateArrayusingDN();
		
		
		string = new AllStringManipulationsUsingCcollections();
		System.out.println("Enter the String to remove the Duplicates");
		String s = scn.next();
		string.removeDuplicatesusingLinkedHashSet(s);
				
	}	

}

