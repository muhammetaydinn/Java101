public class ArtikYilHesaplama {
    public ArtikYilHesaplama() {
        int yil;
        System.out.print("Yil giriniz:");
        yil = Integer.parseInt(System.console().readLine());
        if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }
    }
}
