import java.util.Scanner;

public class FibonacciSerisi {
    public FibonacciSerisi() {
        int sayi, n1, n2, n3, n0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi = sc.nextInt();
        n1 = 1;
        n2 = 1;

        System.out.print("9 Elemanli Fibonacci Serisi : 0 1 1 ");

        for (int i = 0; i < sayi - 3; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

        }
    }
}
