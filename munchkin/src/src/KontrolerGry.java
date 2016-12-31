package src;

import java.util.Arrays;

public class KontrolerGry {

    public Gracz gracz;
    public Gracz komputer;
    public DystrybutorKart karty;

    public KontrolerGry() {
        karty = new DystrybutorKart();
        gracz = new Gracz();
        komputer = new Gracz();
        rozdajKarty();
    }

    private void rozdajKarty() {
        gracz.kartyWRece.add(karty.nastepnaKartaDrzwi());
        gracz.kartyWRece.add(karty.nastepnaKartaSkarbu());
        komputer.kartyWRece.add(karty.nastepnaKartaDrzwi());
        komputer.kartyWRece.add(karty.nastepnaKartaSkarbu());
        System.out.println(Arrays.toString(gracz.kartyWRece.toArray()));
        System.out.println(Arrays.toString(komputer.kartyWRece.toArray()));
    }


}
