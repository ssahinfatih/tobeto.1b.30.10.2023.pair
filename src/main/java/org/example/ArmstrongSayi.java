package org.example;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();
        scan.close();

        if (isArmstrongSayisi(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

    }

    public static boolean isArmstrongSayisi(int sayi) {
        int toplam = 0;
        int gecici = sayi;
        int bizimsayi= sayi;

        int basamakSayisi=0;
        while (bizimsayi > 0) {
            bizimsayi /= 10;
            basamakSayisi++;
        }
       // 153
        while (gecici > 0) {
            int basamak = gecici % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            gecici /= 10;
        }

        return toplam == sayi;
    }
}
