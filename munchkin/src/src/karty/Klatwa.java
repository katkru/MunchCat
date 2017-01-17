package src.karty;

public class Klatwa extends Drzwi {
    public boolean isPositive;
    
    public Klatwa(String n, String s, Boolean p) {
        super(n, s);
        isPositive = p;
    }

}
