package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg ,armutFiyat = 2.14, elmaKg, elmaFiyat = 3.67, dmtsKg, dmtsFiyat = 1.11;
        double muzKg, muzFiyat = 0.95, ptlcnKg, ptlcnFiyat = 5.0, toplam;

        System.out.println("GÜLER MANAVA HOŞ GELDİNİZ..");

        System.out.print("Armut Kaç Kilo? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        dmtsKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        ptlcnKg = input.nextDouble();

        toplam = (armutKg*armutFiyat) + (elmaKg*elmaFiyat) + (dmtsKg*dmtsFiyat) + (muzKg*muzFiyat) + (ptlcnKg*ptlcnFiyat);

        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
}
