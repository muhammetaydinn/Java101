import java.util.Scanner;

public class YildizTersUcgen {
    public YildizTersUcgen() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        n*=2;
       
        for (int i = (n - 1) / 2; i >= 0; i--) {

            for (int j = 0; j < (n - 2 * i - 1) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}