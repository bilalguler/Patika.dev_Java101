package Donguler;

public class YildizElmas {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int k = 0; (k < 5 - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 5; x >= 1; x--) {
            for (int k = 5; (k > x - 1); k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*x-3); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
