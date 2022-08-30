import java.util.Scanner;

public class UsluRecusive {
    public UsluRecusive(){
        // gives power of a number with recusive
        Scanner scan = new Scanner(System.in);
        System.out.print("Base :");
        int base = scan.nextInt();
        System.out.print("Exponent :");
        int exponent = scan.nextInt();
        System.out.println("Result :" + power(base, exponent));
       
    }
    
    public int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }
}
