package Siniflar.Boks;

public class BoksMain {
    public BoksMain(){
        Fighter marc = new Fighter("Marc" , 15 , 95, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 105, 100,0 );
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

    }
    
}
