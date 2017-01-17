package src;

import src.gui.Komunikat;
import src.gui.Kostka;
import src.gui.Gra;
import src.karty.*;

public class Tura {

    public void otworzDrzwi(Drzwi drzwi) {
        if (drzwi instanceof Potwor) {
            Gra.walczButton.setVisible(true);
        } else if (drzwi instanceof Klatwa) {
            rzucKlatwe((Klatwa)drzwi);
            Gra.zrobioneButton.setVisible(true);
        } else {
            Gra.wezDoRekiButton.setVisible(true);
        }
    }
    
    public void rzucKlatwe(Klatwa k) {
        if (k.typ.equals(Klatwa.TypKlatwy.STRAC_KLASE)) {
            KontrolerGry.gracz.klasa = null;
        }else if (k.typ.equals(Klatwa.TypKlatwy.STRAC_POZIOM)) {
            if (KontrolerGry.gracz.poziom > 1)
                KontrolerGry.gracz.poziom -= 1;
        }else if(k.typ.equals(Klatwa.TypKlatwy.STRAC_RASE)){
            KontrolerGry.gracz.rasa = null;
        }else {
            KontrolerGry.gracz.poziom += 1;
        }
    }
    
    public void walka(Potwor potwor, javax.swing.JFrame frame) {
        if (KontrolerGry.gracz.poziomBojowy() > potwor.poziom) {
            KontrolerGry.gracz.poziom += potwor.poziomyDoWygrania;
            System.out.print(potwor.poziomyDoWygrania);
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
