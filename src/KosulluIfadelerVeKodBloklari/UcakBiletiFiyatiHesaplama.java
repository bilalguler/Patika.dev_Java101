package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double kmBasiUcreti = 0.10, toplamUcret, onIkiInd = 0.5, yirmiDortInd = 0.1, altmisBesInd = 0.3;
        double yasIndirimi = 0, indirimliTutar = 0, gitGelInd;
        int yas, yolculukTipi, km;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini seçiniz.\n1) Tek Yön\n2) Gidiş Dönüş");
        System.out.print("Seçiminiz: ");
        yolculukTipi = inp.nextInt();

        System.out.println("===================================================");

        if ((km <= 0 || yas < 0) || (yolculukTipi > 2 || yolculukTipi < 1)) {
            System.out.println("Hatalı veri girdiniz!");
        }

        toplamUcret = km * kmBasiUcreti;

        if (yas < 12) {
            yasIndirimi = toplamUcret * onIkiInd;
        }
        if (yas < 24) {
            yasIndirimi = toplamUcret * yirmiDortInd;
        }
        if (yas > 65) {
            yasIndirimi = toplamUcret * altmisBesInd;
        }
        indirimliTutar = toplamUcret - yasIndirimi;

        if (yolculukTipi == 2) {
            gitGelInd = indirimliTutar * 0.20;
            toplamUcret = (indirimliTutar - gitGelInd) *2;
        }
        else {
            toplamUcret = indirimliTutar;
        }

        System.out.println("Toplam Tutar = " + toplamUcret + " TL");
    }
}
