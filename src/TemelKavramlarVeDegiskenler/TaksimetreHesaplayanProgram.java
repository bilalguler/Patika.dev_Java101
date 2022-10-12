package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kmBasinaUcret = 2.20, km, toplamUcret;
        int baslangicUcreti = 10;

        System.out.print("Taksiniz Kac Kilometre Yapti? ");
        km = input.nextDouble();

        toplamUcret = baslangicUcreti + (km * kmBasinaUcret);

        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;

        System.out.println("Toplam Ucret: " + toplamUcret);

    }
}
