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
        gracz.kartyWRece.add(karty.nastepnaKartaDrzwi());
        gracz.kartyWRece.add(karty.nastepnaKartaSkarbu());
        gracz.kartyWRece.add(karty.nastepnaKartaSkarbu());
    }

    public void odrzucZaznaczoneKary(CopyOnWriteArrayList<Karta> kartyOdrzucone) {
        for (Karta karta : kartyOdrzucone) {
            if (gracz.kartyNaStole.remove(karta)) {
                gracz.usunBonusy(karta);
            } else {
                gracz.kartyWRece.remove(karta);
            }

            if (karta instanceof Drzwi) {
                karty.odrzuconeDrzwi.add((Drzwi) karta);
            } else {
                karty.odrzuconeSkarby.add((Skarb) karta);
            }
        }
    }
    
    public static boolean maPotworaWRece(){
        for(Karta karta : gracz.kartyWRece){
            if(karta instanceof Potwor)
                return true;
        }
        return false;
    }
}
