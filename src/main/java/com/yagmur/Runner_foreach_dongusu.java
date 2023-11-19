package com.yagmur;

public class Runner_foreach_dongusu {
    public static void main(String[] args) {
        /**
         * foreach Dongusu:
         *
         * foreach döngüsü, dizileri veya Iterable koleksiyonları gezme amacıyla kullanılır.
         *
         * Performans açısından genellikle etkili bir şekilde çalışır, ancak koleksiyon türüne
         * ve boyutuna bağlı olarak performans farklılıkları gösterebilir.
         */


        //foreach Dongusu Ornek:

        int[] dizi = {1, 2, 3, 4, 5};

        for (int eleman : dizi) {
            System.out.println(eleman);
        }


        String[] kelimeler = {"Java", "C", "Python", "JavaScript"};

        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }


    }
}
