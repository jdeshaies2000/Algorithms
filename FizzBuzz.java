/*
    Homework: Week 1 - Day 3 - Algorithms #3

    3. Create a function that will print:
    "fizz" if the number is divisible by 3
    "buzz" if the number is divisible by 5
    "fizzbuzz" if the number is divisible by both
*/

import java.util.*;

class FizzBuzz {

    public static void fizzbuzzPrinter (int number) {
        if ((number % 3 == 0) && (number % 5 == 0))
            System.out.println("fizzbuzz");
        else if (number % 3 == 0)
            System.out.println("fizz");
        else if (number % 5 == 0)
            System.out.println("buzz");
    }

    public static void main (String [] args) {

        fizzbuzzPrinter(1);
        fizzbuzzPrinter(9);
        fizzbuzzPrinter(10);
        fizzbuzzPrinter(15);
    }
}

/*
    OUTPUT:

    MacBook-Pro-7:Documents filedemployee$ java FizzBuzz.java
    fizz
    buzz
    fizzbuzz
    MacBook-Pro-7:Documents filedemployee$
*/
