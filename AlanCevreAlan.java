import java.util.Scanner;

public class AlanCevreAlan {
    public AlanCevreAlan() {
        double r, a, alan, cevre, alan1;

        Scanner sc = new Scanner(System.in);
        System.out.print("r:\t\t");
        r = sc.nextDouble();
        System.out.print("a:\t\t");
        a = sc.nextDouble();
        alan = Math.PI * r * r;
        cevre = Math.PI * 2 * r;
        alan1 = alan * a / 360;
        sc.close();
        System.out.println("Tam dairenin alani\t\t" + alan);
        System.out.println("Tam cevrenin uzunlugu\t\t" + cevre);
        System.out.println("a Acili dairenin alani\t\t" + alan1);

    }
}
