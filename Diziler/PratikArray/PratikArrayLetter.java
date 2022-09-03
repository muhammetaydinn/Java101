package Diziler.PratikArray;

public class PratikArrayLetter {
    public PratikArrayLetter(){
        String[][] letter = new String[9][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
               if((i%2==1||j%2==1)||(i==2&&j==2)||(i==6&&j==2)){
                   letter[i][j]="  ";
            }
            else{
                letter[i][j]=" 0";
            }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        
    }
    
}
