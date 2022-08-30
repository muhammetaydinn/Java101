import java.util.Scanner;

public class RecusiveDesen {
    boolean isArtis = false;
    public RecusiveDesen(){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayisi : ");
        a = scan.nextInt();
        System.out.print("Ciktisi : " + a);
        dongu(a,a);
        
    }

    private  void dongu(int a,int b) {
        
        if(a<=0){
            
            isArtis = true;
        }else if(a==b&&isArtis){
            System.out.print(a + " ");
            return;
        }
        System.out.print(a+" ");
        dongu(a +(isArtis?5:-5),b);
        
    }
    
}
