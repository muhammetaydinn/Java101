import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurcProgrami {
    public BurcProgrami() throws NumberFormatException, IOException {
        // Burç bulan program
        System.out.println("Burç Bulan Programına Hoşgeldiniz");
        // Doğum ayı ve gününü alır

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ay, gun;
        System.out.println("Doğum ayını giriniz:");
        ay = Integer.parseInt(br.readLine());
        System.out.println("Doğum gününü giriniz:");
        gun = Integer.parseInt(br.readLine());
        // Burçların isimlerini ve doğum gününe göre burçlarını bulur
        String[] burcIsimleri = { "Kova", "Balık", "Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi",
                "Akrep", "Yay" };
        if (ay == 1 && gun >= 20 || ay == 2 && gun <= 18) {
            System.out.println("Doğum gününüz " + burcIsimleri[0] + " Burçınızdır.");
        } else if (ay == 2 && gun >= 19 || ay == 3 && gun <= 20) {
            System.out.println("Doğum gününüz " + burcIsimleri[1] + " Burçınızdır.");
        } else if (ay == 3 && gun >= 21 || ay == 4 && gun <= 19) {

            System.out.println("Doğum gününüz " + burcIsimleri[2] + " Burçınızdır.");
        } else if (ay == 4 && gun >= 20 || ay == 5 && gun <= 20) {
            System.out.println("Doğum gününüz " + burcIsimleri[3] + " Burçınızdır.");
        } else if (ay == 5 && gun >= 21 || ay == 6 && gun <= 21) {
            System.out.println("Doğum gününüz " + burcIsimleri[4] + " Burçınızdır.");
        } else if (ay == 6 && gun >= 22 || ay == 7 && gun <= 22) {

            System.out.println("Doğum gününüz " + burcIsimleri[5] + " Burçınızdır.");
        } else if (ay == 7 && gun >= 23 || ay == 8 && gun <= 22) {

            System.out.println("Doğum gününüz " + burcIsimleri[6] + " Burçınızdır.");
        } else if (ay == 8 && gun >= 23 || ay == 9 && gun <= 22) {

            System.out.println("Doğum gününüz " + burcIsimleri[7] + " Burçınızdır.");

        } else if (ay == 9 && gun >= 23 || ay == 10 && gun <= 22) {

            System.out.println("Doğum gününüz " + burcIsimleri[8] + " Burçınızdır.");

        } else if (ay == 10 && gun >= 23 || ay == 11 && gun <= 21) {

            System.out.println("Doğum gününüz " + burcIsimleri[9] + " Burçınızdır.");

        } else if (ay == 11 && gun >= 22 || ay == 12 && gun <= 21) {
            System.out.println("Doğum gününüz " + burcIsimleri[10] + " Burçınızdır.");
        } else if (ay == 12 && gun >= 22 || ay == 1 && gun <= 19) {

            System.out.println("Doğum gününüz " + burcIsimleri[11] + " Burçınızdır.");
        } else {
            System.out.println("Doğum gününüz geçersizdir.");
        }

    }

}
