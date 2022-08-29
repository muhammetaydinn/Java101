import java.util.Scanner;

public class Taksimetre {
    public Taksimetre() {
        double a, KMBasi, ucret, acilis;
        KMBasi = 2.20;
        acilis = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç KM:\t\t");
        a = sc.nextDouble();

        ucret = a * KMBasi + acilis;
        System.out.println("Ucret " + (ucret < 20 ? "20 lira" : ucret + " lira"));
        sc.close();

    }

}
