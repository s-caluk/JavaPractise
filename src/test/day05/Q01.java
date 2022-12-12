package test.day05;

public class Q01 {
    /*
       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.

       Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */

    public static void main(String[] args) {
        int toplam=0;
        for (int i = 100; i > 0; i--) {
            if (i%13==0){
                System.out.println(i+" sayısı 13 e tam bölünür.");
                toplam+=i;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
