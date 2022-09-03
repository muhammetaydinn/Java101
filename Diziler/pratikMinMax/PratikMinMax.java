package Diziler.pratikMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class PratikMinMax {
    public PratikMinMax() {
        int[] list = { 56, 34, 1, 8, 101, -2, -33 };
        int a, max = 0, min = 0;
        int s1 = 0, s2 = 0;
        System.out.println("Dizi " + Arrays.toString(list));
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz:\t");
        a = sc.nextInt();
        sc.close();

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp1 = list[i];
                    list[i] = list[j];
                    list[j] = temp1;

                }

            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] < a) {
                min = list[i];
                s1++;
            }

        }
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] > a) {
                max = list[i];
                s2++;
            }

        }
        System.out.print("Girilen sayıdan küçük en yakın sayı :\t");
        System.out.println(((s1 > 0 || min < a) ? min : a + "dan kucuk değer bulunamadı"));
        System.out.print("Girilen sayıdan büyük en yakın sayı :\t");
        System.out.println(((s2 > 0 || max > a) ? max : a + "dan buyuk değer bulunamadı"));

    }

}
