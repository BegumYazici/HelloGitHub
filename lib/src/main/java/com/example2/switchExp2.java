package com.example2;

import java.util.Scanner;

/**
 * Created by asus1 on 4.5.2017.
 */
public class switchExp2 {

    public static void main(String[] args) {

        int secim;
        do {
            System.out.println("--Adres Defterimiz--");
            String sb = new String("YeniAdresGir AdresSil AdresGuncelle AdresGor Cikis");
            String[] dizi = sb.split(" ");

            for (int i = 0; i < dizi.length; i++) {

                System.out.println((i + 1) + " " + dizi[i]);
            }

            Scanner giris = new Scanner(System.in);

            System.out.println("Seciminiz: (1,2,3,4,5):");
            secim = giris.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("Yeni adres eklemek mi istiyorsunuz?");
                    break;
                case 2:
                    System.out.println("Bir adres silecek misiniz?");
                    break;
                case 3:
                    System.out.println("Bir adres guncelleyecek misiniz?");
                    break;
                case 4:
                    System.out.println("Bir adres mi goreceksiniz?");
                    break;
                case 5:
                    System.out.println("Hosca kal!");
                    break;
                default:
                    System.out.printf("%d geçerli bir seçim değildir %n", secim);
                    break;
            }

            System.out.println("Devam etmek ici bir tusa basiniz: ");
            secim = giris.nextInt();
                System.out.println();
        }while (secim!=5);
    }
}