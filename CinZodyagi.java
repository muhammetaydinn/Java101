import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CinZodyagi {
    public CinZodyagi() throws NumberFormatException, IOException{
        int yil;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        yil=Integer.parseInt(bf.readLine());
        int kalanyil=yil%12;
        String[] zodyak={"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        System.out.println("Cin Zodyagi Burcunuz : "+zodyak[kalanyil]);
    }
}
