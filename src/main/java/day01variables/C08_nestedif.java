package day01variables;

import java.util.Scanner;

public class C08_nestedif {
    public static void main(String[] args) {

        // Bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz.
        // Yas : 18 ve uzeri olmali
        // Kilo : 50'dan ust olmali

        Scanner input = new Scanner(System.in);

        System.out.print("Yasinizi giriniz : ");
        byte age = input.nextByte();
        if (age >= 18) {
            System.out.print("Kilonuzu giriniz : ");
            float weight = input.nextFloat();
            if (weight >= 50) {
                System.out.println("Lutfen asagidaki formu doldurunuz.");
            } else {
                System.out.println("Lutfen " + (50 - weight) + " kilo daha alıp geliniz.");
            }
        } else {
            System.out.println("Lütfen " + (18 - age) + " yil sonra geliniz.");
        }
    }
}
