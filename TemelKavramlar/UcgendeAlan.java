package TemelKavramlar;

import java.util.Scanner;

public class UcgendeAlan {
    public UcgendeAlan() {
        double a, b, c, cevre, u, alan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Kenari giriniz: ");
        a = sc.nextDouble();
        System.out.print("Ikinci Kenari giriniz: ");
        b = sc.nextDouble();
        System.out.print("Ucuncu Kenari giriniz: ");
        c = sc.nextDouble();
        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan :\t" + alan);
        sc.close();

    }
}
