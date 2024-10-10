package day04;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        /*
        4.soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.
        */

        int[] sayi = {454, 212, 83, 0, 47, 5555, 25, 33, 17, 7, 3, 9, 67, -93, -54};

        Arrays.sort(sayi);

        System.out.println("Max Sayi : " + sayi[sayi.length - 1]);
        maxSayiyiYazdir(sayi);
    }

    public static void maxSayiyiYazdir(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Max Sayi : " + max);
    }
}