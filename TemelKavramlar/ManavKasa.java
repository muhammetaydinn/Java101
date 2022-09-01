package TemelKavramlar;
import java.util.Scanner;

public class ManavKasa {
    public ManavKasa() {
        double total = 0;
        double[] fiyatlist = { 2.14, 3.67, 1.11, 0.95, 5 };
        Scanner sc = new Scanner(System.in);
        String[] sepet = { "Armut", "Elma", "Domates", "Muz", "Patlıcan" };
        int[] kilolar = { 0, 0, 0, 0, 0 };
        for (int i = 0; i < 5; i++) {
            System.out.print(sepet[i] + " kilosunu giriniz: ");
            kilolar[i] = sc.nextInt();
            total += kilolar[i] * fiyatlist[i];

        }
        System.out.println(total);

        sc.close();

    }
}
