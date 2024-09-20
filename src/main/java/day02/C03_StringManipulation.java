package day02;

import java.util.Scanner;

public class C03_StringManipulation {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        odev!! bosluk karakteri varsada hata mesaji verin
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen gmail adresi giriniz : ");
        String email = input.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen doğru gmail adresi giriniz!");
        } else if (email.contains(" ")) {
            System.out.println("Mail hesabınız boşluk karakteri içeremez!");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi.");
        } else {
            System.out.println("Hatalı işlem yaptınız. Lutfen tekrar kontol ediniz.");
        }
    }
}
