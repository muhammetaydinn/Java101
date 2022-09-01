import java.util.Scanner;

public class MukemmelSayi {
    public MukemmelSayi(){
        int sayi,toplam=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi = sc.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println("Mukemmel sayi");
        }
        else{
            System.out.println("Mukemmel sayi degil");
        }
        sc.close();


    }
}
