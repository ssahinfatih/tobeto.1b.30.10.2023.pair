package org.example;

import java.util.Scanner;

//Write a Java program finds first 10 perfect numbers.
public class PerfectNumbers {
    public static boolean isPerfectNumber(long number) {
        long sumOfDivisors = 0;

        for (long i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        long count = 0;
        long number = 2;

        while (count < 10) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}