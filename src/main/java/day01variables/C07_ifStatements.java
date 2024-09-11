package day01variables;

import java.util.Scanner;

public class C07_ifStatements {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner input = new Scanner(System.in);

        System.out.print("100 uzerinden bir not giriniz : ");
        float num01 = input.nextFloat();

        if (num01 < 0 || num01 > 100) {
            System.out.println("Lutfen gecerli bir not giriniz.");
        } else if (num01 < 50) {
            System.out.println("Notunuz : D");
        } else if (num01 < 60) {
            System.out.println("Notunuz : C");
        } else if (num01 < 80) {
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");
        }
    }
}
