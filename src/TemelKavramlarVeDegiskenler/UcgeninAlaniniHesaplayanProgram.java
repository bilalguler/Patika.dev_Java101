package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, alan, u;

        System.out.print("Lütfen Birinci Kenari Giriniz: ");
        birinciKenar = scan.nextDouble();
        System.out.print("Lütfen İkinci Kenari Giriniz: ");
        ikinciKenar = scan.nextDouble();
        System.out.print("Lütfen Üçüncü Kenarı Giriniz: ");
        ucuncuKenar = scan.nextDouble();

        cevre = birinciKenar + ikinciKenar + ucuncuKenar;
        u = cevre /2;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
