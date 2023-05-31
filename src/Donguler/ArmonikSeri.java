package Donguler;

import java.util.Scanner;

public class ArmonikSeri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi;
        double top = 0.0;

        System.out.print("Harmanik serisini bulmak istediginiz sayi: ");
        sayi = scan.nextInt();

        for (double i = 1; i <= sayi; i++) {
            top += (1 / i);
        }
        System.out.println("Harmonik seri: " + top);
    }
}
