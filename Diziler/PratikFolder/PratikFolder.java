package Diziler.PratikFolder;

public class PratikFolder {
    public PratikFolder() {
        int[] list = { 56, 34, 1, 8, 101, -2, -33 ,34,8,5,5};
        for (int i = 0; i < list.length; i++) {
                for (int j = i+1; j < list.length; j++) {
                    if((list[i]==list[j])&&list[i]%2==0){
                        System.out.println("Dizinin " + i + ". elemanı " + j + ". elemanı ile aynı değerli");
                    }
                }
        }

      
    }
    
}
