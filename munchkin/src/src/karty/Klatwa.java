package src.karty;

public class Klatwa extends Drzwi {
    public Klatwa.TypKlatwy typ; 
    
    public Klatwa(String n, String s, Klatwa.TypKlatwy p) {
        super(n, s);
        typ = p;
    }
    
    public enum TypKlatwy {
        STRAC_POZIOM, STRAC_KLASE, STRAC_RASE, ZYSKAJ_POZIOM;
    }

}
