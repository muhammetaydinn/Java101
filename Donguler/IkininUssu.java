import java.io.BufferedReader;
import java.io.IOException;

public class IkininUssu {
    public IkininUssu() throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int sayi;
        System.out.print("Sayi giriniz: ");
        try {
            sayi = Integer.parseInt(br.readLine());
            for (int i = 0; i <= Math.pow(2, sayi); i++) {
                if (i % 4 == 0) {
                    System.out.println(i);

                } else if (i % 5 == 0) {
                    System.out.println(i);

                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Sayi girmediniz");
        }

    }
}
