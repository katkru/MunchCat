package src.gui;

import java.awt.Component;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;
import src.*;
import src.karty.*;

public class Gra extends javax.swing.JFrame {

    public static KontrolerGry kontroler;
    Tura tura;

    public Gra() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
        wezDoRekiButton.setVisible(false);
        walczButton.setVisible(false);
        koniecTuryButton.setVisible(false);
        kontroler = new KontrolerGry();
        tura = new Tura();
        ustawKartyNaPanelu(kartyWRece, KontrolerGry.gracz.kartyWRece);
    }

    public void aktualizujKartyIPoziomyGracza() {
        poziom.setText("Twój poziom: " + kontroler.gracz.poziom);
        poziomBojowy.setText("Twój poziom bojowy: " + kontroler.gracz.poziomBojowy());
        if (KontrolerGry.gracz.klasa != null) {
            klasa.setText("Twoja klasa: " + KontrolerGry.gracz.klasa.toString());
        }
        if (KontrolerGry.gracz.rasa != null) {
            rasa.setText("Twoja rasa: " + KontrolerGry.gracz.rasa.toString());
        }
        ustawKartyNaPanelu(kartyNaStole, KontrolerGry.gracz.kartyNaStole);
        ustawKartyNaPanelu(kartyWRece, kontroler.gracz.kartyWRece);

        //buttonWylozZReki.setEnabled(!playerModel.getHiddenTreasures().isEmpty());
        repaint();
        revalidate();
    }

    private void ustawKartyNaPanelu(JPanel panel, CopyOnWriteArrayList<Karta> karty) {
        panel.removeAll();
        for (Karta k : karty) {
            KartaGUI karta = new KartaGUI();
            karta.ustawKarte(k);
            karta.setVisible(true);
            panel.add(karta);
        }
        panel.repaint();
        panel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        koniecTuryButton = new javax.swing.JButton();
        otworzDrzwiButton = new javax.swing.JButton();
        walczButton = new javax.swing.JButton();
        odrzucKartyButton = new javax.swing.JButton();
        wezDoRekiButton = new javax.swing.JButton();
        wylozZRekiButton = new javax.swing.JButton();
        otwarteDrzwi = new javax.swing.JPanel();
        kartyWRece = new javax.swing.JPanel();
        kartyNaStole = new javax.swing.JPanel();
        klasa = new javax.swing.JLabel();
        rasa = new javax.swing.JLabel();
        poziomBojowy = new javax.swing.JLabel();
        poziom = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setMaximizedBounds(getMaximizedBounds());
        setMinimumSize(getMinimumSize());
        setUndecorated(true);
        setSize(getMaximumSize());
        getContentPane().setLayout(null);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(1360, 80, 80, 60);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(1439, 80, 80, 60);

        koniecTuryButton.setText("Koniec tury");
        koniecTuryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koniecTuryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(koniecTuryButton);
        koniecTuryButton.setBounds(0, 550, 130, 23);
        koniecTuryButton.getAccessibleContext().setAccessibleName("");

        otworzDrzwiButton.setText("Otwórz drzwi");
        otworzDrzwiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otworzDrzwiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(otworzDrzwiButton);
        otworzDrzwiButton.setBounds(0, 520, 130, 23);

        walczButton.setText("Walcz z potworem");
        walczButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walczButtonActionPerformed(evt);
            }
        });
        getContentPane().add(walczButton);
        walczButton.setBounds(0, 420, 130, 23);

        odrzucKartyButton.setText("Odrzuc karty");
        odrzucKartyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odrzucKartyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(odrzucKartyButton);
        odrzucKartyButton.setBounds(0, 580, 130, 23);

        wezDoRekiButton.setText("Weź kartę do ręki");
        wezDoRekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wezDoRekiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(wezDoRekiButton);
        wezDoRekiButton.setBounds(0, 450, 130, 23);

        wylozZRekiButton.setText("Wyłóż kartę z ręki");
        wylozZRekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wylozZRekiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(wylozZRekiButton);
        wylozZRekiButton.setBounds(0, 490, 130, 23);
        wylozZRekiButton.getAccessibleContext().setAccessibleName("Wyłóż na stół");
        wylozZRekiButton.getAccessibleContext().setAccessibleDescription("");

        otwarteDrzwi.setBackground(new java.awt.Color(25, 91, 19));
        otwarteDrzwi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        getContentPane().add(otwarteDrzwi);
        otwarteDrzwi.setBounds(680, 400, 390, 200);

        kartyWRece.setBackground(new java.awt.Color(255, 199, 86));
        kartyWRece.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty w ręce"));
        getContentPane().add(kartyWRece);
        kartyWRece.setBounds(140, 630, 520, 120);

        kartyNaStole.setBackground(new java.awt.Color(25, 91, 19));
        kartyNaStole.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty na stole"));
        getContentPane().add(kartyNaStole);
        kartyNaStole.setBounds(140, 390, 520, 210);

        klasa.setText("Twoja klasa: brak");
        getContentPane().add(klasa);
        klasa.setBounds(1100, 310, 170, 14);

        rasa.setText("Twoja rasa: człowiek");
        getContentPane().add(rasa);
        rasa.setBounds(1100, 290, 170, 14);

        poziomBojowy.setText("Twój poziom bojowy: 1");
        getContentPane().add(poziomBojowy);
        poziomBojowy.setBounds(1100, 270, 130, 14);

        poziom.setText("Twój poziom: 1");
        getContentPane().add(poziom);
        poziom.setBounds(1100, 240, 90, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameboard.jpg"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        close();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void wylozZRekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wylozZRekiButtonActionPerformed
        CopyOnWriteArrayList<Karta> zaznaczoneKarty = zaznaczoneKarty(kartyWRece);
        KontrolerGry.gracz.wylozKartyNaStol(zaznaczoneKarty);
        aktualizujKartyIPoziomyGracza();
    }//GEN-LAST:event_wylozZRekiButtonActionPerformed

    private void koniecTuryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koniecTuryButtonActionPerformed
        otworzDrzwiButton.setVisible(true);
        koniecTuryButton.setVisible(false);
    }//GEN-LAST:event_koniecTuryButtonActionPerformed

    private void otworzDrzwiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otworzDrzwiButtonActionPerformed
        otworzDrzwiButton.setVisible(false);
        Drzwi d = KontrolerGry.karty.nastepnaKartaDrzwi();
        CopyOnWriteArrayList<Karta> nastepneDrzwi = new CopyOnWriteArrayList();
        nastepneDrzwi.add(d);
        ustawKartyNaPanelu(otwarteDrzwi, nastepneDrzwi);

        if (d instanceof Potwor) {
            walczButton.setVisible(true);
        } else {
            wezDoRekiButton.setVisible(true);
        }
    }//GEN-LAST:event_otworzDrzwiButtonActionPerformed

    private void wezDoRekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wezDoRekiButtonActionPerformed
        KontrolerGry.gracz.kartyWRece.add(((KartaGUI) otwarteDrzwi.getComponent(0)).karta);
        aktualizujKartyIPoziomyGracza();
        wyczyscKartyPoOtwarciuDrzwi();
        wezDoRekiButton.setVisible(false);
        koniecTuryButton.setVisible(true);//roboczo bo to nie kończy jeszcze tury, trzeba pociągnąć kartę albo walczyc ze swoim potworem 
    }//GEN-LAST:event_wezDoRekiButtonActionPerformed

    private void walczButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walczButtonActionPerformed
        Potwor potwor = (Potwor) ((KartaGUI) otwarteDrzwi.getComponent(0)).karta;
        tura.walka(potwor, this);

        aktualizujKartyIPoziomyGracza();
        wyczyscKartyPoOtwarciuDrzwi();
        walczButton.setVisible(false);
        koniecTuryButton.setVisible(true);
    }//GEN-LAST:event_walczButtonActionPerformed

    private void odrzucKartyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odrzucKartyButtonActionPerformed
        CopyOnWriteArrayList<Karta> zaznaczoneKarty = zaznaczoneKarty(kartyWRece);
        zaznaczoneKarty.addAll(zaznaczoneKarty(kartyNaStole));
        kontroler.odrzucZaznaczoneKary(zaznaczoneKarty);

        aktualizujKartyIPoziomyGracza();
    }//GEN-LAST:event_odrzucKartyButtonActionPerformed

    private void wyczyscKartyPoOtwarciuDrzwi() {
        otwarteDrzwi.removeAll();
        otwarteDrzwi.repaint();
        otwarteDrzwi.revalidate();
    }

    private CopyOnWriteArrayList<Karta> zaznaczoneKarty(JPanel panel) {
        KartaGUI k;
        CopyOnWriteArrayList<Karta> zaznaczone = new CopyOnWriteArrayList<>();
        for (Component c : panel.getComponents()) {
            k = (KartaGUI) c;
            if (k.wybrana) {
                zaznaczone.add(k.karta);
            }
        }
        return zaznaczone;
    }

    public void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel kartyNaStole;
    private javax.swing.JPanel kartyWRece;
    private javax.swing.JLabel klasa;
    private javax.swing.JButton koniecTuryButton;
    private javax.swing.JButton odrzucKartyButton;
    private javax.swing.JPanel otwarteDrzwi;
    private javax.swing.JButton otworzDrzwiButton;
    private javax.swing.JLabel poziom;
    private javax.swing.JLabel poziomBojowy;
    private javax.swing.JLabel rasa;
    private javax.swing.JButton walczButton;
    private javax.swing.JButton wezDoRekiButton;
    private javax.swing.JButton wylozZRekiButton;
    // End of variables declaration//GEN-END:variables
}
