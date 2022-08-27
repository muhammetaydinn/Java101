import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KullaniciGirisi {
    public KullaniciGirisi(){
        System.out.println("Kullanıcı Adı Giriniz:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String kullaniciAdi = br.readLine();
            System.out.println("Parola Giriniz:");
            String parola = br.readLine();
            if(kullaniciAdi.equals("admin") && parola.equals("admin")){
                System.out.println("Hoşgeldiniz");
            }else{
                System.out.println("Kullanıcı adı veya parola hatalı");
            }
        }catch(Exception e){
            System.out.println("Hata");
        }
    }
    }
       
        
    

    

