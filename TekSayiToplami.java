import java.io.BufferedReader;
import java.io.IOException;

public class TekSayiToplami {
    public TekSayiToplami() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int sayi, toplam = 0;
        System.out.print("Sayi giriniz: ");
        sayi = Integer.parseInt(br.readLine());
        while (sayi > 0) {
            if (sayi % 2 == 1) {
                toplam += sayi;

            }
            System.out.print("Sayi giriniz: ");
            sayi = Integer.parseInt(br.readLine());

        }
        System.out.println("Toplam: " + toplam);

    }
}
