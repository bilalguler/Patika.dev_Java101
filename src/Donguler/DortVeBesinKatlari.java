package Donguler;
import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Sınır sayısını giriniz: ");
        n = scan.nextInt();

        System.out.print("Dördün kuvvetleri: ");
        for (int i = 1; i < n; i*=4) {
            System.out.print(i + " ");
        }
        System.out.print("\nBeşin kuvvetleri: ");
        for (int j = 1; j < n; j*=5) {
            System.out.print(j + " ");
        }
    }
}
