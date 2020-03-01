/*
    Homework: Week 1 - Day 3 - Algorithms #4

    4. Create a function to check if the two strings are Anagrams: Eg COAT and TACO would be anagrams
    public boolean checkAnagrams(String word1, String word2){};
*/

import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 

class CheckAnagram { 
  
    public static boolean checkAnagrams(String word1, String word2) 
    {  
        char[] word1Chars = word1.toCharArray(),
               word2Chars = word2.toCharArray();
   
        if (word1Chars.length != word2Chars.length) 
            return false; 
 
        Arrays.sort(word1Chars); 
        Arrays.sort(word2Chars); 
  
        for (int i = 0; i < word1Chars.length; i++) 
            if (word1Chars[i] != word2Chars[i]) 
                return false; 
  
        return true; 
    } 

    public static void main(String args[]) 
    { 
        String string1 = "COAT",
               string2 = "TACO";
 
        if (checkAnagrams(string1, string2)) 
            System.out.printf("%s and %s are anagrams of each other", string1, string2); 
        else
            System.out.printf("%s and %s are not anagrams of each other", string1, string2);

	System.out.println(); 
    } 
}   

/*
    OUTPUT:

    MacBook-Pro-7:Documents filedemployee$ java CheckAnagram.java
    COAT and TACO are anagrams of each other
    MacBook-Pro-7:Documents filedemployee$
*/
