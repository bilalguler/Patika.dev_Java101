package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, cevre, alan;
        int r, aci;

        System.out.print("Dairenizin yari capi nedir? ");
        r = input.nextInt();

        System.out.print("Kaç derecelik bir daire diliminin alnını bulmak istersiniz? ");
        aci = input.nextInt();

        cevre = ((2 * pi * r) * aci) / 360;
        alan = ((pi * r * r) * aci) / 360;

        System.out.println("Dairenizin Alani: " + alan);
        System.out.println("Dairenizin Cevresi: " + cevre);
    }
}
