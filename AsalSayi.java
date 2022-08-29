import java.util.Scanner;

public class AsalSayi {
    public AsalSayi() {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi = sc.nextInt();

        System.out.print("2 ");
        for (int i = 3; i < sayi; i++) {
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) {
                    break;
                } else if (i == j && i % j == 0) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
