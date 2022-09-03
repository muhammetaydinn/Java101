package Diziler.HarmonikOrtalama;

public class HarmonikOrtalama {
    public HarmonikOrtalama() {
        // program that calculates the average of harmonics
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double harmonicSeri = 0;
       
        double sum=0;
        for(double i:arr){
            sum+=1/i;
        }
        double average= arr.length/sum;
        System.out.println("Harmonik ortalama: "+ average);
    }
}
