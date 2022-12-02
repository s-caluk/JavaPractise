
/*
+ "Snippet erstellen" yaparak kodlarini slackten yollamalisin
Alt+imleci asagi cekersen cok satirda degisiklik yapabiliyorsun. 5 satira // eklemek istersen deneyebilirsin
java ters slash \ gördügünde sonrasinda geleni yazdirmaliyim gibi algilar, iki iki algiliyor
variable gri renk ise , hic kullanilmadi demek.her renk degisiminiin bir anlami var.
 */


package test.day01;

public class Q1_Print {
    public static void main(String[] args) {
/*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
*/
    /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.n=next
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */

        System.out.println("Konsolda: ");     //alt+imleci sürükle
        System.out.println("\"Hello \"\\");     //alt+imleci sürükle
        System.out.println("/ \'World\'\"");     //alt+imleci sürükle
        System.out.println("yazdiriniz.");     //alt+imleci sürükle

        System.out.println("============2.cozum======================");

        System.out.println("\"Hello \"\\\n/ 'World'\"");
        System.out.println('\'');              //tek tirnaki char olarak nasil yazdirirsin?


    }
}
