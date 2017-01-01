package src;

import java.util.concurrent.CopyOnWriteArrayList;
import src.karty.*;

public class Gracz {

    String imie;
    Enum plec;
    public CopyOnWriteArrayList<Karta> kartyWRece;
    public CopyOnWriteArrayList<Karta> kartyNaStole;
    public int poziom;
    public int sumaBonusuow;

    Gracz() {
        poziom = 1;
        sumaBonusuow = 0;
        kartyWRece = new CopyOnWriteArrayList<>();
        kartyNaStole = new CopyOnWriteArrayList<>();
    }

    public int poziomBojowy(){
        return poziom + sumaBonusuow;
    }
    
    private boolean czyMoznaWylozycKarteNaStol(Karta k) {
        //TODO sprawdzanie czy np nie chcemy dodać drugich butów
        if (k instanceof Potwor) {
            return false;
        }
        return true;
    }

    public void wylozKartyNaStol(CopyOnWriteArrayList<Karta> karty) {
        karty.forEach(k -> {
            if (czyMoznaWylozycKarteNaStol(k)) {
                kartyNaStole.add(k);
                kartyWRece.remove(k);
                if (k instanceof Przedmiot) {
                    sumaBonusuow += ((Przedmiot) k).bonus;
                }
            }
        });
    }
}
