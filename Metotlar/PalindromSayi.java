import java.util.Scanner;

public class PalindromSayi {
    public PalindromSayi() {
        String metin1, metin2 = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        metin1 = scanner.nextLine();

        for (int i = 0; i < metin1.length(); i++) {
            metin2 += metin1.substring(metin1.length() - 1 - i, metin1.length() - i);

        }
        System.out.println(metin2);
        if (metin1.equals(metin2)) {
            System.out.println("Palindrom sayidir.");
        } else {
            System.out.println("Palindrom sayi değildir.");
        }
        scanner.close();
    }
}
