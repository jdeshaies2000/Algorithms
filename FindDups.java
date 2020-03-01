/*
    Homework: Week 1 - Day 3 - Algorithms #1

    1. Create a function to print the duplicates in a list of strings
    public void findDuplicates(List<String> strings){};
*/

import java.util.*;

class FindDups {

    public static void findDuplicates(List<String> strings) {

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
	    for (int j = i + 1; j < strings.size(); j++) {
	        if (strings.get(i).equals(strings.get(j))) {
		    System.out.println("Duplicate Found: " + strings.get(i));
                }
            }
	}
    }

    public static void main (String [] args) {

        List<String> listStrings = List.of("One","Two","Three","Four","Two","Three");
        findDuplicates(listStrings);
    }
}

/*
    OUTPUT:

    MacBook-Pro-7:Documents filedemployee$ java FindDups.java
    [One, Two, Three, Four, Two, Three]
    Duplicate Found: Two
    Duplicate Found: Three
    MacBook-Pro-7:Documents filedemployee$
*/
