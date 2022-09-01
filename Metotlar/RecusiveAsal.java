import java.util.Scanner;

// says if a number is a prime number with recusive
public class RecusiveAsal {
    public RecusiveAsal(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number = scan.nextInt();
        System.out.println(number +" sayisi " + (isPrime(number)==true ? "Asaldir." :"Asal Degil") );
        scan.close();
    }
    
    public boolean isPrime(int number) {
        if (number == 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        return isPrime(number, 3);
    }
    
    public boolean isPrime(int number, int i) {
        if (i * i > number)
            return true;
        if (number % i == 0)
            return false;
        return isPrime(number, i + 2);
    }
}
