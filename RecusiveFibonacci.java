import java.util.Scanner;

public class RecusiveFibonacci{
    public RecusiveFibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.println(fibonacci(sayi));
    }
    public int fibonacci(int sayi){
        if(sayi == 0){
            return 0;
        }
        else if(sayi == 1){
            return 1;
        }
        else{
            return fibonacci(sayi - 1) + fibonacci(sayi - 2);
        }
    }
}