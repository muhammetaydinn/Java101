import java.util.Scanner;

public class ArmstrongNumber {
    public ArmstrongNumber(){
        //find outs Armstrong number
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;
        int temp = sayi;
        while (temp > 0) {
            int digit = temp % 10;
            toplam += Math.pow(digit, 3);
            temp /= 10;
        }
        if (toplam == sayi) {
            System.out.println("Sayi Armstrong sayi");
        } else {
            System.out.println("Sayi Armstrong sayi degil");
        }
        sc.close();
        
    }
}
