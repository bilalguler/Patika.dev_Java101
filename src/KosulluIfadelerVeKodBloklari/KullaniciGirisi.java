package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secim, userName, password;
        System.out.print("Kullanıcı adınız: ");
        userName = scan.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = scan.nextLine();
        System.out.println("==========================================");
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı bir giriş yaptınız..");
            System.out.println("==========================================");
        }
        else {
            if (!password.equals("java123")) {
                System.out.println("Şifreniz yanlış... Şifrenizi değiştirmek ister misiniz?");
                System.out.println("1) Evet\n2) Hayır");
                System.out.print("Seçiminiz: ");
                secim = scan.nextLine();
                System.out.println("==========================================");
                if (secim.equals("1")) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    password = scan.nextLine();
                    if (password.equals("java123")){
                        System.out.println("Eski ve yeni şifre aynı olamaz!");
                        System.out.print("Şifrenizi tekrar giriniz: ");
                        password = scan.nextLine();
                        System.out.println("==========================================");
                    }
                    System.out.println("Tebrikler. Yeni şifreniz '" + password + "'.");
                }
                System.out.println("==========================================");
            }
            if (!userName.equals("patika")) {
                System.out.println("Kullanıcı adınız yanlış. Kullanıcı adınızı değiştirmek ister misiniz?");
                System.out.println("1) Evet\n2) Hayır");
                System.out.print("Seçiminiz: ");
                secim = scan.nextLine();
                System.out.println("==========================================");
                if (secim.equals("1")) {
                    System.out.print("Yeni kullanıcı adınızı giriniz: ");
                    userName= scan.nextLine();
                    System.out.println("==========================================");
                    if (userName.equals("patika")){
                        System.out.println("Eski ve yeni kullanıcı adınız aynı olamaz!");
                        System.out.print("Kullanıcı adınızı tekrar giriniz: ");
                        userName = scan.nextLine();
                    }
                    System.out.println("Tebrikler. Yeni kullanıcı adınız '" + userName + "'.");
                }
                System.out.println("==========================================");
            }
        }
        System.out.println("Kullanıcı adı ve şifreniz '" + userName + "', '" + password + "' olmuştur.");
        System.out.println("Çıkış yapılıyor...");
    }
}
