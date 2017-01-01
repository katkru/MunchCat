package src;

import src.gui.Komunikat;
import src.gui.Kostka;
import src.karty.Potwor;

public class Tura {

    public void walka(Gracz gracz, Potwor potwor, javax.swing.JFrame frame) {
        if (gracz.poziomBojowy() > potwor.poziom) {
            gracz.poziom += potwor.poziomyDoWygrania;
            gracz.kartyWRece.add(KontrolerGry.karty.nastepnaKartaSkarbu());
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
            //tutaj marny koniec
        } 
    }
}
