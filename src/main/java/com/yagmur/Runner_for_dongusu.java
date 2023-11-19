package com.yagmur;

public class Runner_for_dongusu {
    public static void main(String[] args) {

        /**
         * for Döngüsü:
         *
         * for döngüsü, belirli bir başlangıç değerinden başlayarak
         * belirli bir koşulu kontrol eder ve belirli bir artış miktarında çalışır.
         *
         * Genellikle diziler veya koleksiyonlardaki elemanları işlemek için kullanılır.
         * Performans açısından genellikle etkili bir şekilde çalışır.
         */

        //for Ornek: bir dizinin elemanlarını yazdırma.

        int[] dizi = {18, 20, 30, 46, 58};
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }


        //for Ornek: carpim tablosu olusturma

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }





    }
}
