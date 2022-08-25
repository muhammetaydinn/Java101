import java.util.Scanner;
import java.lang.*;

public class VKI {
    public static void VKI() {
        double kg,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kg giriniz: ");
        kg=sc.nextDouble();
        System.out.print("m giriniz: ");
        m=sc.nextDouble();
        double vki=kg/(m*m);
        System.out.println("VKIniz :\t"+vki);
        sc.close();

        
    }
}
