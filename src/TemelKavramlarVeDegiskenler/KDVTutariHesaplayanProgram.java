package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double para, paraKdv, kdvTutar, kdv;
        boolean kdvDurum;

        System.out.print("KDV'sini Hesaplamak İstediginiz Tutarı Giriniz: ");
        para = scan.nextInt();

        kdvDurum = (0 < para) && (1000 > para);
        kdv = kdvDurum ? 0.18 : 0.8;

        kdvTutar = kdv * para;
        paraKdv = kdvTutar + para;

        System.out.println("KDV Oranı = " + kdv);
        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV'li Fiyat = " + paraKdv);
        System.out.println("KDV Tutarı = " + kdvTutar);

    }
}
