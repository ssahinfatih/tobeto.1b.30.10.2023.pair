package org.example;
//Write a Java program finds first two amicable pairs.
public class AmicablePairs {
    public static void main(String[] args) {
        int adet = 0;
        int sayi1, sayi2;

        for (sayi1 = 1; adet < 2; sayi1++) {
            sayi2 = toplamBolenleriBul(sayi1);
            int sayi2Toplam = toplamBolenleriBul(sayi2);

            if (sayi2Toplam == sayi1 && sayi1 != sayi2) {
                System.out.println((adet + 1) + ": " + sayi1 + " - " + sayi2);
                adet++;
            }
        }
    }
    public static int toplamBolenleriBul(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam;
    }
}