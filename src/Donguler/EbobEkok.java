package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1, j = 1, ebob = 1, ekok = 1;

        System.out.print("Lütfen EBOB-EKOK almak istediğiniz sayıları giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        while (i < a) {
            if (a % i == 0 && b % i ==0) {
                ebob = i;
            }
            i++;
        }

        while (j > 0) {
            if (j % a == 0 && j % b == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
