package src;

import java.util.concurrent.CopyOnWriteArrayList;
import static src.KontrolerGry.*;
import src.karty.*;

public class Gracz {

    String imie;
    Enum plec;
    public Klasa klasa;
    public Rasa rasa;
    public CopyOnWriteArrayList<Karta> kartyWRece;
    public CopyOnWriteArrayList<Karta> kartyNaStole;
    public int poziom;
    public int sumaBonusuow;

    Gracz() {
        poziom = 1;
        sumaBonusuow = 0;
        rasa = null;
        klasa = null;
        kartyWRece = new CopyOnWriteArrayList<>();
        kartyNaStole = new CopyOnWriteArrayList<>();
    }

    public int poziomBojowy() {
        return poziom + sumaBonusuow;
    }

    private boolean czyMoznaWylozycKarteNaStol(Karta k) {
        //TODO sprawdzanie czy np nie chcemy dodać drugich butów
        if (k instanceof Potwor) {
            return false;
        } else if (k instanceof Klatwa) {
            return false;
        }
        return true;
    }

    public void wylozKartyNaStol(CopyOnWriteArrayList<Karta> karty) {
        karty.forEach(karta -> {
            if (czyMoznaWylozycKarteNaStol(karta)) {
                kartyNaStole.add(karta);
                kartyWRece.remove(karta);

                if (karta instanceof Przedmiot) {
                    sumaBonusuow += ((Przedmiot) karta).bonus;
                } else if (karta instanceof Klasa) {
                    if (klasa != null) {
                        usunKarte(klasa);
                    }
                    klasa = (Klasa) karta;
                } else if (karta instanceof Rasa) {
                    if (rasa != null) {
                        usunKarte(rasa);
                    }
                    rasa = (Rasa) karta;
                }
            }
        });
    }

    private void usunKarte(Karta karta) {
        kartyNaStole.remove(karta);
        if (karta instanceof Drzwi) {
            karty.odrzuconeDrzwi.add((Drzwi) karta);
        } else {
            karty.odrzuconeSkarby.add((Skarb) karta);
        }
    }

    public void usunBonusy(Karta karta) {
        if (karta instanceof Przedmiot) {
            sumaBonusuow -= ((Przedmiot) karta).bonus;
        } else if (karta instanceof Klasa) {
            klasa = null;
        } else if (karta instanceof Rasa) {
            rasa = null;
        }
    }
}
