package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        int n = 100;

        while (i<= n){
            if (i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if (i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }
            else if (i%15 ==0){
                System.out.println("FizzBuzz!!");
            }
            else {System.out.println(i);}
            i++;
        }


    }
}
