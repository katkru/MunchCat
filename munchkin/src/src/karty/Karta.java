package src.karty;

public class Karta {

    public final String nazwa;
    public final String sciezka;
    
    public Karta(String n, String s) {
        nazwa = n;
        sciezka = s;
    }
    
    @Override
    public String toString(){
        return nazwa;
    }
}
