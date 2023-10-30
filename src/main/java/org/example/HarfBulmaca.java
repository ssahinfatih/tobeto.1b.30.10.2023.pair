package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfBulmaca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime giriniz = ");
        String input = scanner.nextLine();
        karakterSayilari(input);
    }

    static void karakterSayilari(String input) {
        input = input.toLowerCase(); // Büyük/küçük harf duyarlılığını ortadan kaldırmak için küçük harfe çevirir

        // Her karakterin sayısını tutmak için bir dizi
        int[] karakterSayilari = new int[26]; // 26 harflik İngilizce alfabe için

        // Girdi dizesini döngüyle gezin
        for (char c : input.toCharArray()) {

                int index = c - 'a'; // Karakterin alfabe indeksini hesaplayın
                karakterSayilari[index]++;
        }

        // Karakter sayılarını yazdır
        /*for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';
            if (karakterSayilari[index] > 0) {
                System.out.println(c + ":" + karakterSayilari[index]);
            }
        }
        */
        for (int i = 0; i < 26; i++) {
            if (karakterSayilari[i] > 0) {
                char c = (char) ('a' + i);
                System.out.print(c + ":" + karakterSayilari[i] + " ");

            }
        }

    }
}