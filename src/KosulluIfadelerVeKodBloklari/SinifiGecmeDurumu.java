package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik;
        double ort;

        System.out.print("Matematik notunuz: ");
        mat = scan.nextInt();
        mat = ((mat >= 0) && (mat <= 100)) ? mat : 0;

        System.out.print("Fizik notunuz: ");
        fizik = scan.nextInt();
        fizik = ((fizik >= 0) && (fizik <= 100)) ? fizik : 0;

        System.out.print("Kimya notunuz: ");
        kimya = scan.nextInt();
        kimya = ((kimya >= 0) && (kimya <= 100)) ? kimya : 0;

        System.out.print("Turkce notunuz: ");
        turkce = scan.nextInt();
        turkce = ((turkce >= 0) && (turkce <= 100)) ? turkce : 0;

        System.out.print("Muzik notunuz: ");
        muzik = scan.nextInt();
        muzik = ((muzik >= 0) && (muzik <= 100)) ? muzik : 0;

        ort = (mat + fizik + kimya + turkce + muzik) / 5.0;

        System.out.println("-------------------------------------------------------");

        if (ort < 55) {
            System.out.println("Sinifta kaldiniz. Seneye tekrar gorusmek uzere...");
        }
        else {
            System.out.println("Sinifi basariyla gectiniz..");
        }
        System.out.println("Ortalamaniz: " + ort);
    }
}
