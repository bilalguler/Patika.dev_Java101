package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Merhaba, not ortalaması programına hoşgeldiniz!!");

        System.out.print("Lütfen Matematik Notunu Giriniz: ");
        mat = scan.nextInt();

        System.out.print("Lütfen Fizik Notunu Giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Lütfen Kimya Notunu Giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Lütfen Türkçe Notunu Giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Lütfen Tarih Notunu Giriniz: ");
        tarih = scan.nextInt();

        System.out.print("Lütfen Müzik Notunu Giriniz: ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce +tarih + muzik);
        double ort = toplam / 6.0;

        String sonuc = ort >= 60 ? "sınıfı geçti" : "sınıftan kaldı";

        System.out.println("Öğrencinin derslerinin ortalaması: " + ort + "\nÖğrenci " + sonuc + ".");
    }
}
