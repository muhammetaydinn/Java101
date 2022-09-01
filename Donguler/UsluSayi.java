import java.util.Scanner;

public class UsluSayi {
    public UsluSayi(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayi giriniz: ");
        a = sc.nextInt();
        System.out.print("Ikinci Sayi giriniz: ");
        b = sc.nextInt();
        System.out.println("Toplam: " + Math.pow(a,b));
        sc.close();
    }
}
