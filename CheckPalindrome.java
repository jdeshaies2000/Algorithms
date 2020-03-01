/*
    Homework: Week 1 - Day 3 - Algorithms #2

    2. Create function to check if the string is a palindrome without using string.reverse() method
    public boolean checkPalindrome(String word){};
*/

import java.util.*;

class CheckPalindrome {

    public static boolean checkPalindrome(String word) {

        String reverseWord = "";
         
        char[] characters = word.toCharArray();
 
        for (int i = characters.length - 1 ; i >= 0 ; i-- ) {
            reverseWord = reverseWord + characters[i];
        }

        if (word.equals(reverseWord)) {
            return true;
        } 
	else {
            return false;
        }
    }

    public static void main (String [] args) {
 
        String targetWord1 = "radar",
               targetWord2 = "radars";

        if (checkPalindrome(targetWord1)) { System.out.println(targetWord1 + " is a palindrome"); } 
	else { System.out.println(targetWord1 + " is not a palindrome"); }

        if (checkPalindrome(targetWord2)) { System.out.println(targetWord2 + " is a palindrome"); } 
	else { System.out.println(targetWord2 + " is not a palindrome"); }
    }
}

/*
    OUTPUT:

    MacBook-Pro-7:Documents filedemployee$ java CheckPalindrome.java
    radar is a palindrome
    radars is not a palindrome
    MacBook-Pro-7:Documents filedemployee$ 
*/
