package day01variables;

import java.util.Locale;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve
        // dairenin alanini hesaplayip yazdirin cevre formulu 2πr'dir.
        // (pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        // ilk adım önce scanner objesi oluştur.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // Kullaniciya bilgi vermek
        System.out.print("Lütfen hesaplamak istediğiniz Dairenin çapını giriniz 😁 : ");

        // Kavanoza koyma (variable)
        double r = input.nextDouble();

        // Math class' ı java icerisindeki matematik ile ilgili işlemlerin yetersiz oldugu durumlarda kullanılan matematik class'tır!
        // Math.pow(r,2); // r²
        // System.out.println("Math.PI = " + Math.PI);

        System.out.println("Cevre = " + String.format("%.2f", 2 * Math.PI * r));
        System.out.println("Alan = " + String.format("%.2f", Math.PI * Math.pow(r, 2)));
    }
}
