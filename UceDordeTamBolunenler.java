import java.io.BufferedReader;
import java.io.IOException;

public class UceDordeTamBolunenler {
    public UceDordeTamBolunenler() throws NumberFormatException, IOException {
        // TODO Auto-generated constructor stub
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        
        int sayi,toplam=0,sayac=0;
        double ortalama;
        System.out.print("Sayi giriniz: ");
        sayi=Integer.parseInt(br.readLine());
        for(int i=0;i<sayi;i++){
            if(i%3==0 || i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        ortalama=(double)toplam/sayac;
        System.out.println("Toplam: "+toplam+"\nSayac: "+sayac+"\nOrtalama: "+ortalama);
    }
}
