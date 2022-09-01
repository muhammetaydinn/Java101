import java.util.Scanner;

public class EbobEkok {
    public EbobEkok() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayi giriniz: ");
        a = sc.nextInt();
        System.out.print("Ikinci Sayi giriniz: ");
        b = sc.nextInt();
        System.out.println("Ebob: " + ebob(a, b));
        System.out.println("Ekok: " + ekok(a, b));
        sc.close();
    }

    public int ebob(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return ebob(a - b, b);
        } else {
            return ebob(a, b - a);
        }
    }

    public int ekok(int a, int b) {

        return (a * b) / ebob(a, b);

    }

}
