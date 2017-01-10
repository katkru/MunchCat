package src;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import src.karty.*;

public class DystrybutorKart {

    public CopyOnWriteArrayList<Skarb> kartySkarbow;
    public CopyOnWriteArrayList<Drzwi> kartyDrzwi;
    public CopyOnWriteArrayList<Skarb> odrzuconeSkarby;
    public CopyOnWriteArrayList<Drzwi> odrzuconeDrzwi;

    DystrybutorKart() {
        zainicjalizujKartyDrzwi();
        zainicjalizujKartySkarbow();
        odrzuconeSkarby = new CopyOnWriteArrayList();
        odrzuconeDrzwi = new CopyOnWriteArrayList();
    }

    private void zainicjalizujKartyDrzwi() {
        kartyDrzwi = new CopyOnWriteArrayList();
        kartyDrzwi.add(new Potwor("osmioscian", "odrzuc wszystkie duże rzeczy", 1, 2));
        kartyDrzwi.add(new Rasa("rasa1"));
        kartyDrzwi.add(new Klasa("klasa1"));
        kartyDrzwi.add(new Potwor("drob", "tracisz 1 poziom", 1, 2));
        kartyDrzwi.add(new Potwor("osmioscian", "odrzuc wszystkie duże rzeczy", 1, 2));
        kartyDrzwi.add(new Rasa("rasa3"));
        kartyDrzwi.add(new Klatwa("klatwa1"));
        kartyDrzwi.add(new Klatwa("klatwa2"));
        kartyDrzwi.add(new Klatwa("klatwa3"));
        kartyDrzwi.add(new Klatwa("klatwa4"));
        kartyDrzwi.add(new Potwor("drob", "tracisz 1 poziom", 1, 2));

        potasujKarty(kartyDrzwi);
    }

    private void zainicjalizujKartySkarbow() {
        kartySkarbow = new CopyOnWriteArrayList();
        kartySkarbow.add(new Przedmiot("pila", 3) );
        kartySkarbow.add(new Przedmiot("miecz", 2));
        kartySkarbow.add(new Przedmiot("buty", 1));
        kartySkarbow.add(new Przedmiot("portki", 1));
        kartySkarbow.add(new Przedmiot("hełm", 2));
        kartySkarbow.add(new Przedmiot("pila", 3));
        kartySkarbow.add(new Przedmiot("miecz", 2));
        kartySkarbow.add(new Przedmiot("buty", 1));
        kartySkarbow.add(new Przedmiot("portki", 1));
        kartySkarbow.add(new Przedmiot("hełm", 2));
        potasujKarty(kartySkarbow);
    }

    public Drzwi nastepnaKartaDrzwi() {
        if (kartyDrzwi.isEmpty()) {
            kartyDrzwi = new CopyOnWriteArrayList<>(odrzuconeDrzwi);
            odrzuconeDrzwi.clear();
            potasujKarty(kartyDrzwi);
        }
        return kartyDrzwi.remove(0);
    }

    public Skarb nastepnaKartaSkarbu() {
        if (kartySkarbow.isEmpty()) {
            kartySkarbow = new CopyOnWriteArrayList<>(odrzuconeSkarby);
            odrzuconeDrzwi.clear();
            potasujKarty(kartySkarbow);
        }
        return kartySkarbow.remove(0);
    }

    private void potasujKarty(CopyOnWriteArrayList lista) {
        long seed = System.nanoTime();
        Collections.shuffle(lista, new Random(seed));
    }
}
