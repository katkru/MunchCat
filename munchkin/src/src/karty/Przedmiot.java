package src.karty;

public class Przedmiot extends Skarb {

    public final int bonus;

    public Przedmiot(String n, String s, int b) {
        super(n, s);
        bonus = b;
    }

    @Override
    public String toString() {
        return "<html>" + nazwa + "<br>bonus: " + bonus + "</html>";
    }
}
