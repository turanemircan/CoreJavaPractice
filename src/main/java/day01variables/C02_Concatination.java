package day01variables;

public class C02_Concatination {
    public static void main(String[] args) {

        // Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        // Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        // "concatenation" islemi birlestirme yapar
        // Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir
        // Java daima yukarıdan asagıya ve soldan sag dogru ilerler islemleri yapar

        /*
        Matematikteki islem oncelikleri :
        1)parantez ici islemleri yapar
        2)us alma islemleri yapılır
        3)carpma ve bolme islemleri
        4)toplama ve cıkarma islemleri
        5)eger ayni oncelige sahipse soldan saga dogru islemler sirasiyla yapılır.
        */

        String ifade01 = "Ali Can ";

        char ifade02 = '?';

        String ifade03 = "topu bana ";

        String ifade04 = " kere atar mısın";

        int ifade05 = 1;

        // Yukarıdaki ifadelerle anlamlı bir cumle olusturalım.
        System.out.println(ifade01 + ifade03 + ifade05 + ifade05 + ifade04 + ifade02);
    }
}
