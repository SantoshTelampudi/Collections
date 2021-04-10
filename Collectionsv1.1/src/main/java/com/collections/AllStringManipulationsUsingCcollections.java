package com.collections;

import java.util.LinkedHashSet;

public class AllStringManipulationsUsingCcollections {

	
	public void removeDuplicatesusingLinkedHashSet(String str)
    {
		
		LinkedHashSet<Character> s = hashset(str);
		//Linked Hashset will not add the duplicate elements present in the String, it will store only the unique values
       /* LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        System.out.println("Removing Duplicate elements using Hashset");
        System.out.println("After removing the duplicates---->");
        // print string after deleting duplicate elements*/
		for(Character ch : s)
            System.out.print(ch);
    }
	
	private LinkedHashSet<Character> hashset(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        System.out.println("Removing Duplicate elements using Hashset");
        System.out.println("After removing the duplicates---->");
		return lhs;
		
	}
	
	public void printDuplicateelementsinString(String str)
	{
		
		
	}
	

}
