package TemelKavramlar;

import java.io.BufferedReader;
import java.io.IOException;

public class UceDordeTamBolunenler {
    public UceDordeTamBolunenler() throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int sayi, toplam = 0, sayac = 0;
        double ortalama;
        System.out.print("Sayi giriniz: ");
        sayi = Integer.parseInt(br.readLine());
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = (double) toplam / sayac;
        System.out.println("Toplam: " + toplam + "\nSayac: " + sayac + "\nOrtalama: " + ortalama);
    }
}
