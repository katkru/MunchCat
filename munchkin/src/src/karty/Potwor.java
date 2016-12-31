package src.karty;

public class Potwor extends Drzwi {

    public final String marnyKoniec;
    public final int skarby;
    public final int poziom;
    public int poziomyDoWygrania = 1;

    public Potwor(String n, String k, int s, int p) {
        super(n);
        marnyKoniec = k;
        skarby = s;
        poziom = p;
    }

    @Override
    public String toString() {
        return "<html>" + nazwa + "<br>Poziom: " + poziom + "<br>Marny koniec: " + marnyKoniec
                + "<br>Skarby: " + skarby + "<br>Poziomy do wygrania: " + poziomyDoWygrania + "</html>";
    }
}
