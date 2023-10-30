package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        long[] fibonacci = new long[100];
        fibonacci[0]=1;
        fibonacci[1]=1;
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);
        for(int i=2 ; i < 100 ;i++){
            fibonacci[i]=fibonacci[i - 1] + fibonacci[i -2];
            System.out.println(fibonacci[i]);
        }


    }
}
