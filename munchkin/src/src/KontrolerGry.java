package src;

import java.util.concurrent.CopyOnWriteArrayList;
import src.karty.*;

public class KontrolerGry {

    public static Gracz gracz;
    public static DystrybutorKart karty;

    public KontrolerGry() {
        karty = new DystrybutorKart();
        gracz = new Gracz();

        rozdajKarty();
    }

    private void rozdajKarty() {
        gracz.kartyWRece.add(karty.nastepnaKartaDrzwi());
        gracz.kartyWRece.add(karty.nastepnaKartaSkarbu());
    }

    public void odrzucZaznaczoneKary(CopyOnWriteArrayList<Karta> kartyOdrzucone) {
        for (Karta karta : kartyOdrzucone) {
            gracz.kartyNaStole.remove(karta);
            gracz.kartyWRece.remove(karta);
            if (karta instanceof Drzwi) {
                karty.odrzuconeDrzwi.add((Drzwi) karta);
            } else {
                karty.odrzuconeSkarby.add((Skarb) karta);
            }
        }
    }
}
