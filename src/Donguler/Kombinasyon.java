package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long komb, birinciSayi, ikinciSayi, faktBir = 1, faktIki = 1, faktFark = 1;

        System.out.print("Lutfen kombinasyon icin birinci sayiyi giriniz: ");
        birinciSayi = scan.nextInt();
        System.out.print("Lutfen kombinasyon icin ikinci sayiyi giriniz: ");
        ikinciSayi = scan.nextInt();

        for (int i = 1; i <= birinciSayi; i++) {
            faktBir *= i;
        }
        for (int j = 1; j <= ikinciSayi; j++) {
            faktIki *= j;
        }
        for (int k = 1; k <= (birinciSayi-ikinciSayi); k++) {
            faktFark *= k;
        }
        komb = faktBir/(faktIki*faktFark);

        System.out.println("=================================================");
        System.out.println("C(" + birinciSayi + "," + ikinciSayi + ") = " + komb);
    }
}
