package Donguler;
import java.util.Scanner;

public class UcVeDorteBolunenlerinOrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, count = 0, total = 0;
        double average;
        System.out.print("Lütfen bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                count++;
            }
        }
        average = total / count;
        System.out.println("Ortalama: " + average);
    }
}
