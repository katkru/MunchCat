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
        kartyDrzwi.add(new Klasa("czarodziej", "czarodziej"));
        kartyDrzwi.add(new Klasa("wojownik", "wojownik"));
        kartyDrzwi.add(new Rasa("elf", "elf"));
        kartyDrzwi.add(new Potwor("altanka", "altanka", "", 2, 8));
        kartyDrzwi.add(new Potwor("demonica o ciętym języku", "demonica", "", 3, 12));
        kartyDrzwi.add(new Potwor("forumowy troll", "forumowyTroll", "", 3, 10));
        kartyDrzwi.add(new Potwor("rozwrzeszczany frajer", "frajer", "", 2, 6));
        kartyDrzwi.add(new Potwor("galaretowaty ośmiościan", "galaretowataOsmiornica", "", 1, 2));
        kartyDrzwi.add(new Potwor("lewitujący nochal", "nochal", "", 3, 10));
        kartyDrzwi.add(new Potwor("harfie", "harfie", "", 2, 4));
        kartyDrzwi.add(new Potwor("kulawy goblin", "kulawyGoblin", "", 1, 1));
        kartyDrzwi.add(new Potwor("ślimaki na speedzie", "slimaki", "", 2, 4));
        kartyDrzwi.add(new Potwor("3872 orki", "orki", "", 3, 10));
        kartyDrzwi.add(new Potwor("prawnicy", "prawnicy", "", 2, 6));
        kartyDrzwi.add(new Potwor("żygaczu", "zygaczu", "", 2, 6));
        kartyDrzwi.add(new Potwor("spalony golem", "spalonyGolem", "", 4, 14));
        kartyDrzwi.add(new Potwor("pradawne i niewypowiedziane zło", "zlo", "", 4, 14));
        kartyDrzwi.add(new Potwor("tańczący z kościami", "tanczacyZKosciami", "", 1, 2));
        kartyDrzwi.add(new Potwor("wielka stopa", "wielkaStopa", "", 3, 12));
        kartyDrzwi.add(new Potwor("niezapowiedziana wizyta mamy", "mother", "", 1, 2));
        kartyDrzwi.add(new Potwor("złamany paznokieć", "paznokiec", "", 1, 3));
        kartyDrzwi.add(new Potwor("dworcowy hot-dog (?)", "hotdog", "", 1, 1));
        kartyDrzwi.add(new Potwor("mucha artystycznego bzyczenia", "mucha", "", 1, 1));
        kartyDrzwi.add(new Potwor("popsuty krakowiak", "krakowiak", "", 1, 2));
        kartyDrzwi.add(new Potwor("wirko i żwigura", "wirkoIZwigura", "", 4, 16));
        kartyDrzwi.add(new Klatwa("Sekretny modyfikator mistrza gry", "modyfikator", Klatwa.TypKlatwy.ZYSKAJ_POZIOM));
        kartyDrzwi.add(new Klatwa("wrzątek w mrowisko", "mrowisko", Klatwa.TypKlatwy.ZYSKAJ_POZIOM));
        kartyDrzwi.add(new Klatwa("napój miłosny", "napojMilosny", Klatwa.TypKlatwy.STRAC_KLASE));
        kartyDrzwi.add(new Klatwa("pierścień ochrony", "pierscien", Klatwa.TypKlatwy.STRAC_RASE));
        kartyDrzwi.add(new Klatwa("powtórka z masakry", "powtorkaZMasakry", Klatwa.TypKlatwy.ZYSKAJ_POZIOM));
        kartyDrzwi.add(new Klatwa("wybłagany poziom", "wyblagany", Klatwa.TypKlatwy.ZYSKAJ_POZIOM));
        potasujKarty(kartyDrzwi);
    }

    private void zainicjalizujKartySkarbow() {
        kartySkarbow = new CopyOnWriteArrayList();
        kartySkarbow.add(new Przedmiot("bandanka prawdziwego macho", "bandankaMacho", 3));
        kartySkarbow.add(new Przedmiot("buty tyłko-kopania", "butyTylkoKopania", 2));
        kartySkarbow.add(new Przedmiot("eliksir heroicznej głupoty", "eliksirGlupoty", 1));
        kartySkarbow.add(new Przedmiot("mikstu-ara przemiany", "miksturaPrzemiany", 1));
        kartySkarbow.add(new Przedmiot("magioaktywna mikstura rozwałki", "miksturaRozwalki", 1));
        kartySkarbow.add(new Przedmiot("hełm garnkowy", "helmGarnkowy", 1));
        kartySkarbow.add(new Przedmiot("dość duży kamyczek", "kamyk", 3));
        kartySkarbow.add(new Przedmiot("miecz ukradkowego ataku", "miecz", 2));
        kartySkarbow.add(new Przedmiot("oślizgła zbroja", "oslizglaZbroja", 1));
        kartySkarbow.add(new Przedmiot("peleryna cienia", "pelerynaCienia", 4));
        kartySkarbow.add(new Przedmiot("piła łancuchowa krwawego rozczłonkowania", "pila", 3));
        kartySkarbow.add(new Przedmiot("siedmiomilowe buty", "siedmiomiloweButy", 0));
        kartySkarbow.add(new Przedmiot("trzy i pół metrowa tyczka", "tyczka", 1));
        kartySkarbow.add(new Przedmiot("bandanka prawdziwego macho", "bandankaMacho", 3));
        kartySkarbow.add(new Przedmiot("buty tyłko-kopania", "butyTylkoKopania", 2));
        kartySkarbow.add(new Przedmiot("eliksir heroicznej głupoty", "eliksirGlupoty", 1));
        kartySkarbow.add(new Przedmiot("mikstu-ara przemiany", "miksturaPrzemiany", 1));
        kartySkarbow.add(new Przedmiot("magioaktywna mikstura rozwałki", "miksturaRozwalki", 1));
        kartySkarbow.add(new Przedmiot("hełm garnkowy", "helmGarnkowy", 1));
        kartySkarbow.add(new Przedmiot("dość duży kamyczek", "kamyk", 3));
        kartySkarbow.add(new Przedmiot("miecz ukradkowego ataku", "miecz", 2));
        kartySkarbow.add(new Przedmiot("oślizgła zbroja", "oslizglaZbroja", 1));
        kartySkarbow.add(new Przedmiot("peleryna cienia", "pelerynaCienia", 4));
        kartySkarbow.add(new Przedmiot("piła łancuchowa krwawego rozczłonkowania", "pila", 3));
        kartySkarbow.add(new Przedmiot("siedmiomilowe buty", "siedmiomiloweButy", 0));
        kartySkarbow.add(new Przedmiot("trzy i pół metrowa tyczka", "tyczka", 1));
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
            odrzuconeSkarby.clear();
            potasujKarty(kartySkarbow);
        }
        return kartySkarbow.remove(0);
    }

    private void potasujKarty(CopyOnWriteArrayList lista) {
        long seed = System.nanoTime();
        Collections.shuffle(lista, new Random(seed));
    }
}
