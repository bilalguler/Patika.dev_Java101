package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1, sayi2,islem,bolumIslem;

        System.out.print("İşlem yapmak istediğiniz birinci sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("İşlem yapmak istediğiniz ikinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();

        System.out.println("---------------------------------------------------");

        System.out.println("Yapmak istediğiniz işlemi seçiniz..");
        System.out.println("1)Toplam\n2)Çıkartma\n3)Çarpma\n4)Bölme");
        System.out.print("Seçiminiz: ");
        islem = scan.nextInt();

        System.out.println("---------------------------------------------------");

        switch (islem){
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = " +  (sayi1-sayi2));
                break;
            case 3:
                System.out.println(sayi1 + " * " + sayi2 + " = " +  (sayi1*sayi2));
                break;
            case 4:
                bolumIslem = sayi1*sayi2;
                switch (bolumIslem){
                    case 0:
                        System.out.println("0 ile bölüm olmaz.");
                        break;
                    default:
                        System.out.println(sayi1 + " / " + sayi2 + " = " +  (sayi1/sayi2));
                        break;
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir tercih yapınız..");
                break;
        }
    }
}
