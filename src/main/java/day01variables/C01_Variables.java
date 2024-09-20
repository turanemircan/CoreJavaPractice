package day01variables;

public class C01_Variables {
    public static void main(String[] args) {

        /*
        2 tanedir. primitive ve non-primitive olmak uzere icerisinde kucuk degerler saklanir.
        Pasif ozelliklerdir.
        */

        // iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz

        int a = 76;
        double b = 89.6;
        double toplam = a + b;
        System.out.println("Toplam = " + toplam); // Toplam = 165.6

        // Ayni sayilari toplayip sadece tam kismini alin

        int toplam02 = a + (int) b;

        // 2.yol
        // int toplam02 = (int)(a+b);

        // 3. yol
        // int toplam02 = (int) toplam;

        double x = 5.7;
        double y = 6.8;

        double toplam03 = x + y;
        System.out.println("Toplam03 = " + toplam03); // Toplam03 = 12.5

        int toplam04 = (int) x + (int) y; // Veri kaybı daha fazladır. Kullanımı önerilmez.
        System.out.println("Toplam04 = " + toplam04); // Toplam04 = 11

        int toplam05 = (int) (x + y);
        System.out.println("Toplam05 = " + toplam05); // Toplam05 =12

        int toplam06 = (int) toplam03;
        System.out.println("Toplam06 = " + toplam06); // Toplam06 = 12
    }
}
