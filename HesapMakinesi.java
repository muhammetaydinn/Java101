//Muhammet Aydın
//Hesap makinesi 4 işlemi "a+b" "a-b" "a*b" "a/b" seklinde yazarak direkt cevaba ulastirir.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HesapMakinesi {
    public HesapMakinesi() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try{
                System.out.println("Gir:");

            String islem = br.readLine();
            int carp = islem.indexOf("*");
            int bol = islem.indexOf("/");
            int topla = islem.indexOf("+");
            int cikar = islem.indexOf("-");

            if (topla != -1) {

                int n1 = Integer.valueOf(islem.substring(0, topla)).intValue();

                int n2 = Integer.valueOf(islem.substring(topla + 1)).intValue();

                System.out.println(n1 + n2);

            } else if (carp != -1) {
                int n1 = Integer.valueOf(islem.substring(0, carp)).intValue();
                int n2 = Integer.valueOf(islem.substring(carp + 1)).intValue();
                System.out.println(n1 * n2);

            } else if (bol != -1) {
                int n1 = Integer.valueOf(islem.substring(0, bol)).intValue();
                int n2 = Integer.valueOf(islem.substring(bol + 1)).intValue();

                if (n2 == 0) {
                    System.out.println("0'a bölünemez");
                    break;
                } else
                    System.out.println(n1 / n2);

            } else if (cikar != -1) {
                int n1 = Integer.valueOf(islem.substring(0, cikar)).intValue();
                int n2 = Integer.valueOf(islem.substring(cikar + 1)).intValue();
                System.out.println(n1 - n2);

            } else {

                System.out.println("Hatalı İşlem");
            }

            }catch(Exception e){
                System.out.println("Hata");
            }

            

        }

    }

}
