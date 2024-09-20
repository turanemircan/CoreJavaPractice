package day02;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        toLowerCase:harfleri kucultmeyi saglar
        toUpperCase:harfleri buyultmeyi saglar
        length:karakter sayisini yani uzunlugunu verir
        equals:esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
        equalsIgnoreCase:buyuk kucuk harf farketmeksizin esit mi diye kontrol eder
        indexOf:girilen karakterin ilk indexini dondurur
        lastIndexOf:girilen karakterin son indexini dondurur
        charAt:girilen indexteki karakteri dondurur
        trim:bastaki ve sondaki bosluklari siler
        split:icine girilen degerden boler sag ve sol olmak uzere secim yaptırır(0 sol/1 sag)
        replace:icindeki datayi degistirmeyi saglar
        replaceAll:icindeki datyi gruplar halinde(regex) degistirmeyi saglar
        concat:birlestirme islemi yapar
        subString:ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur
        valueOf:String'i baska dataya baska datalari String'e cevirmeyi saglar.
        contains:icerme durumunu kontrol eder
        endsWith:ne ile bittigini kontrol eder
        startsWith:ne ile basladigini kontrol eder
        isBlank:hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder
        isEmpty:bos mu diye kontrol eder
        */

        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */

        // 1. Adım olarak scanner objesi
        Scanner input = new Scanner(System.in);

        // 2. Adım olarak kullanıcaya bilgi mesaji
        System.out.print("Lütfen kontrol etmek istediğiniz harfi girinz : ");

        // 3. Adım olarak uygun bir variable giriniz.
        String harf = input.next().toLowerCase();

        harf = harf.replaceAll("[^a-z]", "^");

        // ?,!,.,$->

        if (harf.contains("^") || harf.length() > 1) {
            System.out.println("Hatalıdır");
        } else {
            if (harf.equals("e")) {
                System.out.println("Sesli harftir");
            } else {
                System.out.println("Sessiz harftir");
            }
        }
    }
}
