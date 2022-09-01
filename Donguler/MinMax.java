import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public MinMax() throws NumberFormatException, IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Kaç tane sayi gireceksiniz: ");
        a = Integer.parseInt(br.readLine());
        int[] dizi = new int[a];
        int[] dizi1 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print((i+1)+". Sayiyi giriniz: ");
            dizi[i] = Integer.parseInt(br.readLine());
            dizi1[i] = i;
        }
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (dizi[i] > dizi[j]) {
                    int temp1 = dizi1[i];
                    dizi1[i] = dizi1[j];
                    dizi1[j] = temp1;
                    // indexleri de tutuyoruz

                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }

            }
        }
        System.out.println("En buyuk sayi: " + dizi[a-1]);
        System.out.println("En kucuk sayi: " + dizi[0]);
        
    }

}
