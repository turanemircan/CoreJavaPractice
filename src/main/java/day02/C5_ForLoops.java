package day02;

import java.util.Scanner;

public class C5_ForLoops {
    public static void main(String[] args) {

        /*
        // Odev:
        Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
        */

        /*
        Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("100'den kucuk bir pozitif tam sayi giriniz : ");
        byte num01 = input.nextByte();

        if (num01 < 0 || num01 > 100) {
            System.out.println("Lutfen 100'den kucuk bir pozitif tam sayi giriniz!");
        } else {
            /*
            // 1. Yol:
            for (int i = 1; i <= num01; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            */
            // 2.Yol
            for (int i = 3; i <= num01; i += 3) {
                System.out.print(i + " ");
            }
        }
    }
}
