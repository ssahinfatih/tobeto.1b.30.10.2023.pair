package org.example;
//How to determine if the string has all unique characters.
public class UniqueCharacter {
    public static void main(String[] args) {
        String input = "abceei";
        boolean status = true;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println("Tüm karakterler benzersiz değil");
                    status = false;
                }
            }
        }
        if(status==true)
            System.out.println("Tüm karakterler benzersiz.");
    }
}