package org.example;

public class deneme {
    public static void main(String[] args) {
        int sayi = 586;
        double birler;
        double onlar;
        double yüzler = sayi / 100;
        double toplam=0;

        birler = sayi%10;
        sayi -= birler;
        onlar = sayi/10;

        int arms=0;
        System.out.println(sayi%10);
        System.out.println("birler basamağı ="+birler);
        for(int i=0;i <= birler;i++){

            arms+=birler*i;

        }
        System.out.println("arms birler" + arms);
        System.out.println("-----------------------");

        for(int i=0;i <= onlar;i++){

            arms+=onlar*i;

        }
        System.out.println("arms birler" + arms);
        System.out.println(sayi%10);
        System.out.println("onlar basamağı ="+onlar%10);
        System.out.println("-----------------------");

        for(int i=0;i <= onlar;i++){

            arms+=yüzler*i;

        }
        System.out.println(sayi/100);  // 100 ler basamağını verdi
        System.out.println("yüzler basamağı ="+sayi/100);
        System.out.println("-----------------------");


    }
}
