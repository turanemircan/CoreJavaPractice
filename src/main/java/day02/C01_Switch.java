package day02;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

        // Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        // 1. Adım
        Scanner input = new Scanner(System.in);

        // 2. Adım normal koşullarda kullanıcıya bilgi verirdik
        System.out.print("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\n5- Us almak\n6- Kalan Hespalamak\nLutfen yukardan yapmak istediginiz işlemin numarasını giriniz : ");
        int num01 = input.nextInt();

        switch (num01) {
            case 1:
                System.out.print("Lutfen toplamak istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilarin toplami : " + (input.nextDouble() + input.nextDouble()));
                break;
            case 2:
                System.out.print("Lutfen cikarmak istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilarin farki : " + (input.nextDouble() - input.nextDouble()));
                break;
            case 3:
                System.out.print("Lutfen carpmak istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilarin carpimi : " + (input.nextDouble() * input.nextDouble()));
                break;
            case 4:
                System.out.print("Lutfen bolmek istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilarin bolumu : " + (input.nextDouble() / input.nextDouble()));
                break;
            case 5:
                System.out.print("Lutfen us'unu almak istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilarin usu : " + (Math.pow(input.nextDouble(), input.nextDouble())));
                break;
            case 6:
                System.out.print("Lutfen kalani bulmak istediğiniz iki sayi giriniz : ");
                System.out.println("Sayilardan kalan : " + (input.nextDouble() % input.nextDouble()));
                break;
            default:
                System.out.println("Lutfen var olan bir islem seçiniz.");
        }
    }
}
