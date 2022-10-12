package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KucuktenBuyugeSayiSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;

        System.out.print("Birinci sayı: ");
        a = scan.nextInt();
        System.out.print("İkinci sayı: ");
        b = scan.nextInt();
        System.out.print("Üçüncü sayı: ");
        c = scan.nextInt();

        System.out.println("====================");

        if (a<b && a<c) {
            if (b<c){
                System.out.println(a+"<"+b+"<"+c);
            }
            else {
                System.out.println(a+"<"+b+"<"+c);
            }
        } else if (b<a && b<c) {
            if (a<c){
                System.out.println(b+"<"+a+"<"+c);
            } else {
                System.out.println(b+"<"+c+"<"+a);
            }
        }else {
            if (a<b){
                System.out.println(c+"<"+a+"<"+b);
            } else {
                System.out.println(c+"<"+b+"<"+a);
            }
        }
    }
}