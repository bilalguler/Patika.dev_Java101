package Donguler;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal =  false;
                }
            }
            if (asal) {
                System.out.print(i + ", ");
            }
        }
    }
}
