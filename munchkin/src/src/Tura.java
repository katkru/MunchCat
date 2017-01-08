package src;

import src.gui.Komunikat;
import src.gui.Kostka;
import src.karty.Potwor;

public class Tura {

    public void walka(Potwor potwor, javax.swing.JFrame frame) {
        if (KontrolerGry.gracz.poziomBojowy() > potwor.poziom) {
            KontrolerGry.gracz.poziom += potwor.poziomyDoWygrania;
            KontrolerGry.gracz.kartyWRece.add(KontrolerGry.karty.nastepnaKartaSkarbu());
            KontrolerGry.karty.odrzuconeDrzwi.add(potwor);
            Komunikat wygrana = new Komunikat(frame, "<html>Wygrałeś walkę!<br>Dostaniesz skarby i poziom!</html>");
            wygrana.setVisible(true);
        } else {
            ucieczka(potwor, frame);
        }
    }

    public void ucieczka(Potwor potwor, javax.swing.JFrame frame) {
        Kostka kostka = new Kostka(frame, potwor.marnyKoniec);
        int oczka = kostka.nextNumber();
        if (oczka < 5) {
            KontrolerGry.gracz.poziom = 1;
        } 
    }
}
