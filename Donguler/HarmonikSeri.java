import java.util.Scanner;

public class HarmonikSeri {
    public HarmonikSeri() {
        // calculate the harmonic series
        int n, i;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The answer is: " + sum);

        sc.close();
    }
}
