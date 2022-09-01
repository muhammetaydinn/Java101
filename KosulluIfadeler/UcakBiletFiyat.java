public class UcakBiletFiyat {
    public UcakBiletFiyat() {

        int mesafe, yas, yolculukTipi;
        double fiyat;
        System.out.print("Mesafe giriniz:");
        mesafe = Integer.parseInt(System.console().readLine());
        System.out.print("Yas giriniz:");
        yas = Integer.parseInt(System.console().readLine());
        System.out.print("Yolculuk Tipi 1-Tek Yön 2-Gidiş-Dönüş:");
        yolculukTipi = Integer.parseInt(System.console().readLine());
        if (mesafe > 0 && yas > 0 && yolculukTipi == 1 || yolculukTipi == 2) {
            fiyat = mesafe * 0.10;
            if (yas < 12) {
                fiyat -= fiyat * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                fiyat -= fiyat * 0.10;
            } else if (yas >= 65) {
                fiyat -= fiyat * 0.30;
            }
            if (yolculukTipi == 2) {
                fiyat -= fiyat * 0.20;
                fiyat *= 2;
            }
            System.out.println("Fiyat: " + fiyat);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}
