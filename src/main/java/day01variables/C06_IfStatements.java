package day01variables;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        // if eğer demektir else değilse

        // Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen bir Dogal sayi giriniz : ");
        int number01 = input.nextInt();

        boolean isEmpty = number01 % 02 == 0;

        if (isEmpty) {
            System.out.println(number01 + " sayisi Ciftir.");
        } else {
            System.out.println(number01 + " sayisi Tektir.");
        }

        // else if : eger değilse demektir.

        // Kullanicidan alinan bir sayinin pozitif,
        // negatif veya notr oldugunu kontrol eden kodu yaziniz.

        System.out.print("Lütfen bir sayi giriniz : ");
        double number02 = input.nextDouble();

        boolean isPositive = number02 > 0;
        boolean isNegative = number02 < 0;

        if (isPositive) {
            System.out.println(number02 + " sayisi pozitif!");
        } else if (isNegative) {
            System.out.println(number02 + " sayisi negatif!");
        } else {
            System.out.println(number02 + " sayisi nötrdür!");
        }
    }
}
