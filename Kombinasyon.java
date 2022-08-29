import java.util.Scanner;

public class Kombinasyon {
    public Kombinasyon(){
        //calculate combinations of inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        
        //factorial method
        int nfactorial = factorial(n);
        System.out.println("Enter the number of seleceted elements: ");

        int r=sc.nextInt();
        int rfactorial = factorial(r);

        int n_rFactorial = factorial(n-r);

        System.out.println("The answer is: " + nfactorial/(rfactorial*n_rFactorial));


        
        


        

    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

    

