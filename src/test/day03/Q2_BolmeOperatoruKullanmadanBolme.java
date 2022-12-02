package test.day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {

    public static void main(String[] args) {

        /*
        Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz");
        int b = scan.nextInt();

        System.out.println(bol(a, b));
        System.out.println(a + "/" + b + "=" + bol(a, b) ); //bu cikti daha janjanli

    }

    static int bol(int bolunen, int bolen) {

        int bolum = 0;               //her döngüde bos kovayi dolduracagiz, (for baslangic gibi...)
        while(bolunen >= bolen){     //burdaki sarti body nin icinde etkilemen(arttirman yada azaltman) lazim.
            bolunen -= bolen;
            bolum++;                 //(for artma miktari gibi...)
        }
        return bolum;

    }
}
