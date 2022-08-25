import java.util.Scanner;

public class NotOrtalamasi {
  
    public static void NotOrtalamasi() {
        int total=0;
        Scanner sc=new Scanner(System.in);
        String[] dersler={"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] puanlar={0,0,0,0,0,0};

        for(int i=0;i<6;i++){
            System.out.println(dersler[i]+" notunu giriniz: ");
            puanlar[i]=sc.nextInt();
            total +=puanlar[i];

        }
        System.out.println(total/puanlar.length);
        System.out.println(total/puanlar.length>60?"Geçti":"Kaldı");
        sc.close();
    }
}
