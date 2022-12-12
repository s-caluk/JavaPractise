package test.day04;

public class Q2_ArraydekiSayilarinToplami {
    public static void main(String[] args) {

        //Create an array of 5 floats and calculate their sum.

        //float[] numbers = new float[5];
        float[] numbers = {1.0f, 2.6f, 3.2f, 5.0f, 7.0f};

        float toplam = 0;

        System.out.println("++++++++FOR LOOP CÖZÜMÜ++++++++++");
        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];
        }
        System.out.println("Toplam : " + toplam);


        System.out.println("++++++++WHILE LOOP CÖZÜMÜ 1 ++++++++++");
        toplam = 0;                      //burda toplami tekrar sifira aldik
        int index = 0;                   //baslangic
        while(index<numbers.length){     //condition
            toplam += numbers[index];
            index++;                     //artis
        }
        System.out.println(toplam);


        System.out.println("++++++++WHILE LOOP CÖZÜMÜ 2 ++++++++++");
        toplam = 0;
        int ind = numbers.length-1;                   //baslangic
        while(ind>0){                                //condition
            toplam += numbers[ind];
            ind--;                                   //azalis
        }
        System.out.println(toplam);
    }
}
