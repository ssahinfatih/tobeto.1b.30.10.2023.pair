package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Kelime  = ");
        String ilkDizi = scanner.nextLine();
        System.out.print("İkinci Kelime  = ");
        String ikinciDizi = scanner.nextLine();

        if (areAnagrams(ilkDizi, ikinciDizi)) {
            System.out.println(ilkDizi + " ile " + ikinciDizi + " birbirinin anagramıdır.");
        } else {
            System.out.println(ilkDizi + " ile " + ikinciDizi + " birbirinin anagramı değildir.");
        }
    }

    static boolean areAnagrams(String dizi1, String dizi2) {
        // Dizilerin uzunluğu farklı ise anagram değil
        if (dizi1.length() != dizi2.length()) {
            return false;
        }

        // Dizileri alfabetik sıraya sırala
        char[] dizi1Chars = dizi1.toCharArray();//toCharArray girdiğimiz kelimeyi harf harf ayırıp diziye atıyoruz.
        char[] dizi2Chars = dizi2.toCharArray();

        Arrays.sort(dizi1Chars);//alfabetik olarak sıralıyor.
        Arrays.sort(dizi2Chars);

        // Sıralanmış dizileri karşılaştır
        return Arrays.equals(dizi1Chars, dizi2Chars);//equals kullanarak bir birlerine eşit mi kontrolü yapıyor.
    }
}

