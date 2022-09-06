//Muhammet Aydın
//Metin tabanlı mayın tarlası oyunu.

package Bitirme;

import java.util.Arrays;
import java.util.Scanner;

public class MayinTarlasi {
    public int[][] MayinYerlestir(int mayinSayisi, int satirSayisi, int sutunSayisi, int[][] matris) {
        for (int i = 0; i < mayinSayisi; i++) {
            int satir = 0;
            int sutun = 0;
            do {
                satir = (int) (Math.random() * satirSayisi);
                sutun = (int) (Math.random() * sutunSayisi);
            } while (matris[satir][sutun] == 1);
            matris[satir][sutun] = 1;
        }
        return matris;
    }

    public int[][] mineCounter(int satirSayisi, int sutunSayisi, int[][] matris, int[][] mayinKonumu) {
        int mS = 0;

        // find how many mines are around
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                if (mayinKonumu[i][j] == 0) {

                    if (i - 1 >= 0 && j - 1 >= 0 && mayinKonumu[i - 1][j - 1] == 1) {
                        mS++;
                    }
                    if (i > 0 && mayinKonumu[i - 1][j] == 1) {
                        mS++;
                    }
                    if (i > 0 && j < sutunSayisi - 1 && mayinKonumu[i - 1][j + 1] == 1) {
                        mS++;
                    }
                    if (j > 0 && mayinKonumu[i][j - 1] == 1) {
                        mS++;
                    }
                    if (j < sutunSayisi - 1 && mayinKonumu[i][j + 1] == 1) {
                        mS++;
                    }
                    if (i < satirSayisi - 1 && j > 0 && mayinKonumu[i + 1][j - 1] == 1) {
                        mS++;
                    }
                    if (i < satirSayisi - 1 && mayinKonumu[i + 1][j] == 1) {
                        mS++;
                    }
                    if (i < satirSayisi - 1 && j < sutunSayisi - 1 && mayinKonumu[i + 1][j + 1] == 1) {
                        mS++;
                    }
                    matris[i][j] = mS;
                    mS = 0;
                }

            }
        }
        return matris;

    }

    public void copyTwoDimensionalArray(int[][] matris, int[][] mayinKonumu) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                mayinKonumu[i][j] = matris[i][j];
            }
        }
    }

    public void printSteppeds(boolean[][] steppeds, int satir, int sutun, int[][] matris, int[][] mayinKonumu) {
        steppeds[satir][sutun] = true;
        for (int i = 0; i < steppeds.length; i++) {
            for (int j = 0; j < steppeds[i].length; j++) {
                if (steppeds[i][j] == true) {
                    if (mayinKonumu[i][j] == 1) {
                        System.out.print("* ");

                    } else {
                        System.out.print(matris[i][j] + " ");
                    }
                } else {
                    System.out.print("- ");

                }

            }
            System.out.println();
        }
    }

    public MayinTarlasi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç satır olacak?:\t");
        int satirSayisi = sc.nextInt();
        while (satirSayisi <= 2) {
            System.out.println("Lütfen 3 ve üzeri bir sayı giriniz.");
            satirSayisi = sc.nextInt();
        }

        System.out.print("Kaç sütun olacak?:\t");
        int sutunSayisi = sc.nextInt();
        while (sutunSayisi <= 2) {
            System.out.println("Lütfen 3 ve üzeri bir sayı giriniz.");
            sutunSayisi = sc.nextInt();
        }

        int[][] matris = new int[satirSayisi][sutunSayisi];
        int[][] mayinKonumu = new int[satirSayisi][sutunSayisi];
        boolean[][] steppeds = new boolean[satirSayisi][sutunSayisi];
        for (boolean[] arr1 : steppeds)
            Arrays.fill(arr1, false);

        int mayinSayisi = satirSayisi * sutunSayisi / 4;
        int stepCounter = 0;

        System.out.println("Mayın sayısı: " + mayinSayisi);

        matris = MayinYerlestir(mayinSayisi, satirSayisi, sutunSayisi, matris);
        copyTwoDimensionalArray(matris, mayinKonumu);

        matris = mineCounter(satirSayisi, sutunSayisi, matris, mayinKonumu);

        int satirNo, sutunNo;
        boolean isSteppedonMine = false;

        while (!isSteppedonMine) {
            if (stepCounter + mayinSayisi == (satirSayisi * sutunSayisi)) {
                System.out.println("Tebrikler kazandınız!");
                break;
            }
            System.out.print("Kacinci satiri seciyorsunuz :\t");
            satirNo = sc.nextInt();
            System.out.print("Kacinci sutunu seciyorsunuz :\t");
            sutunNo = sc.nextInt();
            try {
                if (mayinKonumu[satirNo][sutunNo] == 1) {
                    printSteppeds(steppeds, satirNo, sutunNo, matris, mayinKonumu);
                    System.out.println("Mayına bastınız. Oyunu kaybettiniz.");
                    System.out.println("Skorunuz: " + stepCounter);

                    isSteppedonMine = true;
                } else {
                    System.out.println("Mayın yok");
                    printSteppeds(steppeds, satirNo, sutunNo, matris, mayinKonumu);
                    stepCounter++;

                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz degerlerden birisi hatali");
            }

        }
        sc.close();

    }

}
