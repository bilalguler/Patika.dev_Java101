package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Hava Sıcaklığını giriniz: ");
        heat = inp.nextInt();

        if (heat < 25) {
            if (heat >= 15){
                System.out.println("Pikniğe gidebilirsiniz. İyi eğlenceler..");
            } else if (heat >= 5) {
                System.out.println("Sinemaya gidebilirsiniz. İyi eğlenceler..");
            } else {
                System.out.println("Kayağa gidebilirsiniz. İyi eğlenceler..");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz. İyi eğlenceler..");
        }
    }
}
