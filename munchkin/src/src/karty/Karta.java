package src.karty;

public class Karta {

    public final String nazwa;

    public Karta(String n) {
        nazwa = n;
    }
    
    @Override
    public String toString(){
        return nazwa;
    }
}
