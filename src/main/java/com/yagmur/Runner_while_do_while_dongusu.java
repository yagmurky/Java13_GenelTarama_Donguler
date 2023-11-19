package com.yagmur;

import java.util.Scanner;

public class Runner_while_do_while_dongusu {
    public static void main(String[] args) {

        /**
         *while ve do-while Döngüleri:
         *
         * while ve do-while döngüleri, belirli bir koşul sağlandığı sürece çalışan döngülerdir.
         *
         * do-while döngüsü, koşulu kontrol etmeden önce en az bir kez döngü içindeki işlemleri gerçekleştirir.
         * Performans açısından, for döngüsüne göre genellikle daha az optimize edilmiş olabilir.
         */

        //while syntax(Sonsuz Döngü)(Koşul doğru olduğu sürece.):
        boolean yagmurYagiyorMu= false;
        while (yagmurYagiyorMu) {
            System.out.println("Şemsiye Al.");
        }

        //do_while syntax
        do {
            System.out.println("Şemsiye Al.");
        } while (yagmurYagiyorMu);

        //do-while örneği

        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Menü:");
            System.out.println("1. Toplama Yap");
            System.out.println("2. Çıkarma Yap");
            System.out.println("3. Ç I K I Ş");
            System.out.print("Lütfen bir seçenek girin (1-3): ");

            secim = scanner.nextInt();

            switch (secim) {
                case 1: System.out.println("Toplama yapılıyor."); break;
                case 2: System.out.println("Çıkarma yapılıyor."); break;
                case 3: System.out.println("Programdan çıkılıyor."); break;
                default: System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }

        } while (secim != 3);

        scanner.close();


    }
}
