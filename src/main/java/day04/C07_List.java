package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_List {
    public static void main(String[] args) {

        /*
        bir listede ortalamanin ustunde olan eleman sayisini bulunuz
        //List.of methodu kısa surede list olusturmayı saglar fakat arraylistlerde kullanılamaz
        List<Double> mylist = List.of(1.5, 3.14, 1.8, 57.57, 37.0, 13.5);
        */

        /*
        elemanların toplami
        eleman sayisi
        */

        /*
        double sum = 0;
        for (Double a : mylist) {
            sum += a;
        }
        double ort = sum / mylist.size();
        System.out.println(ort);//19.085
        int sayac = 0;
        for (Double a : mylist) {
            if (a > ort) {
                sayac++;
                System.out.println(a);
            }
        }
        */

        List<Integer> lst = new ArrayList<>();
        Random random1 = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 200; i++) {
            lst.add(random1.nextInt(1000));
        }

        System.out.println(lst);
        System.out.println("Lutfen birden bine kadar bir sayi tahmin edin");

        int tahminEdilenSayi = scanner.nextInt();
        if (lst.contains(tahminEdilenSayi)) {
            System.out.println("Tahmin dogru bildiniziniz");
        } else {
            System.out.println("Tahmin yanlis tekrar dene");
        }
        System.out.println(lst.size());

         /*
        icinde 200 tane farkli 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */

        /*
        Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
        */

        // Gelcek hafta multi dimensional arraylerden devam edicez
    }
}