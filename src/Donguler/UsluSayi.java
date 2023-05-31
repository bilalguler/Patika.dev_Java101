package Donguler;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi, us = 1, sonuc = 1;

        System.out.print("Üssü alonacak sayı: ");
        sayi = scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        us = scan.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= sayi;
        }
        System.out.println(sayi + " sayısının " + us + ". üssü: " + sonuc);
    }
}
