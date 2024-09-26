package day03;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        // 1.adım

        Scanner input = new Scanner(System.in);

        // 2.adım donguyu olusturma

        // 3. adım dongu icerisine girilicek olan degerin yaşam alanını olusturmak

        double sayi;
        double toplam = 0;
        do {
            System.out.println("lütfen toplamak istediginiz sayilari giriniz siz 0'a basıncaya kadar toplamaya devam edicektir");
            sayi = input.nextDouble();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println("toplam = " + toplam);
    }
}
