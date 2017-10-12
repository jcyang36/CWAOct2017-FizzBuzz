package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the ending number? ");
        int n=scan.nextInt();
        while(n<1){
            System.out.println("Enter a number greater than 1: ");
            n = scan.nextInt();

        }

        System.out.println("What is the number that will be used to find multiples? ");
         int modulus = scan.nextInt();
         fizzbuzz(i,n);
         System.out.println("There are "+n/7 +" multiples of 7 " + "less than or equal to "+n+ "." );
        System.out.println("There are "+n/17 +" multiples of 17 " + "less than or equal to "+n+ "." );
        System.out.println("There are "+n/23 +" multiples of 23 " + "less than or equal to "+n+ "." );
        System.out.println("There are "+n/modulus +" multiples of " + modulus + " less than or equal to "+n+ "." );

    }

    public static void fizzbuzz(int i, int n) {
        while (i <= n) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 15 == 0) {
                System.out.println("FizzBuzz!!");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
