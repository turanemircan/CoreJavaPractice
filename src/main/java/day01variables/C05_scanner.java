package day01variables;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        // Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        // kisa kenarlarini ve
        // yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        // ilk adım scanner objesini olusturmak
        Scanner input = new Scanner(System.in);

        // 1. Yol:

        /*
        // Kullanıcıya mesaj vermek
        System.out.print("Lütfen uzun kenarı giriniz : ");

        // variable atama
        double uzunKenar = input.nextDouble();

        System.out.print("Lütfen kısa kenarı giriniz : ");

        double kısaKenar = input.nextDouble();

        System.out.print("Lütfen yüksekliğini giriniz : ");

        double yukseklik = input.nextDouble();

        System.out.println("Prizmanın Hacmi : " + uzunKenar * kısaKenar * yukseklik);
        */

        // 2. Yol:

        System.out.print("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin sırasıyla uzun , kısa kenarini ve yükseliğini giriniz ☻");

        double uzunKenar = input.nextDouble();
        double kisaKenar = input.nextDouble();
        double yukseklik = input.nextDouble();

        System.out.println("prizmanın hacmi : " + uzunKenar * kisaKenar * yukseklik);
    }
}
