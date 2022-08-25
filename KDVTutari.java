import java.lang.reflect.Constructor;
import java.util.Scanner;

public class KDVTutari {
    public static void KDVTutari(){
        double tutar,kdvOrani=0.18;


        Scanner sc=new Scanner(System.in);
        System.out.println("Ucret Tutarini giriniz: ");

         tutar=sc.nextInt();
         double kdvTutar=tutar*kdvOrani;
         double kdvliTutar=tutar+kdvTutar;
         System.out.println("Tutar:\t\t\t"+tutar);
         System.out.println("KDV Orani:\t\t"+kdvOrani);
         System.out.println("KDV Orani:\t\t"+kdvTutar);
         System.out.println("KDVli Tutar:\t\t"+kdvliTutar);
         sc.close();
        
        
       



    }
}
