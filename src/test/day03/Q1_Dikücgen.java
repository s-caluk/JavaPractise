
package test.day03;

import java.util.Scanner;

public class Q1_Dikücgen {
    public static void main(String[] args) {

        /*
   Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dik ücgen olup olmadigini anlamak icin 3 kenar uzunlugu giriniz");

        System.out.println("Birinci kenar uzunlugunu giriniz");
        int a = scan.nextInt();

        System.out.println("Ikinci kenar uzunlugu giriniz");
        int b = scan.nextInt();

        System.out.println("Ücüncü kenar uzunlugunu giriniz");
        int c = scan.nextInt();

        System.out.println("===================1.Cözüm============================");
        if( (a*a) + (b*b) == (c*c) ) System.out.println("Bu bir dik ücgendir");
        else if ( (b*b) + (c*c) == (a*a)) System.out.println("Bu bir dik ücgendir");
        else if ( (a*a) + (c*c) == (b*b)) System.out.println("Bu bir dik ücgendir");
        else  System.out.println("Bu bir dik ücgendir");


        System.out.println("===================2.Cözüm============================");
        if( (a*a) + (b*b) == (c*c) || (b*b) + (c*c) == (a*a) || (a*a) + (c*c) == (b*b) )
            System.out.println("Bu bir dik ücgendir");
        else
            System.out.println("Bu bir dik ücgen degildir");


        //buranin konu ile alakasi yok.amac diger klasin methoduna nasil ulasilir onu göstermek
        Q2_BolmeOperatoruKullanmadanBolme obje = new Q2_BolmeOperatoruKullanmadanBolme();
        System.out.println(obje.bol(20,4));
    }
}
