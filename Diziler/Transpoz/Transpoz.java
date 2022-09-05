package Diziler.Transpoz;

public class Transpoz { 
    public Transpoz(){
        int[][] dizi = new int[3][3];
        dizi[0][0] = 1;
        dizi[0][1] = 2;
        dizi[0][2] = 3;
        dizi[1][0] = 4;
        dizi[1][1] = 5;
        dizi[1][2] = 6;
        dizi[2][0] = 7;
        dizi[2][1] = 8;
        dizi[2][2] = 9;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoz");
        for (int i = 0; i < dizi[0].length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                System.out.print(dizi[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}
