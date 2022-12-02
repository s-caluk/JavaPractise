

package test.day02;

import java.util.Scanner;

public class Q02_SwitchCase_HesapMakinesi {

    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Islem cinsini giriniz:\n1:toplama 2:cikarma 3:carpma 4: bolme ");
        int islem = scan.nextInt();

        System.out.println("=====================benim cözüm====================");

        switch (islem){
            case 1:
                System.out.println(a+b);
                break;

            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a / b);
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("****************** IF Cozumu ********************");

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a/b);
        }
        else System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");

        System.out.println("****************** Switch Case Cozumu 1 ********************");

        switch (islem) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("****************** Switch Case Cozumu 2 ********************");

        System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");


        char isaret = scan.next().charAt(0);

        switch (isaret){
            case '+' : System.out.println(a + " + " + b +" = " + (a+b)); break;

            case '-' : System.out.println(a + " - " + b +" = " + (a-b)); break;

            case '*' : System.out.println(a + " * " + b +" = " + (a*b)); break;

            case '/' : if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a + " / " + b +" = " + (a/b)); break;

            default: System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

    }
}
