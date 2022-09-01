package TemelKavramlar;
import java.util.Scanner;

public class Hipotenus {
    public Hipotenus() {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Kenari giriniz: ");
        a = sc.nextDouble();
        System.out.print("Ikinci Kenari giriniz: ");
        b = sc.nextDouble();
        c = Math.sqrt(a * a + b * b);

        System.out.println("Ucuncu kenar :\t" + c);
        sc.close();

    }
}
