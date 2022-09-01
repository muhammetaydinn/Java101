import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sicaklik {
    public Sicaklik() {
        int sicaklik;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Sicaklik Giriniz:");
            sicaklik = Integer.valueOf(br.readLine()).intValue();
            if (sicaklik < 5) {
                System.out.println("Kayak");
            } else if (sicaklik > 5 && sicaklik < 15) {
                System.out.println("Sinema");
            } else if (sicaklik > 15 && sicaklik < 25) {
                System.out.println("Piknik");
            } else
                System.out.println("Yüz");
        } catch (Exception e) {
            System.out.println("Hata");
        }

    }
}
