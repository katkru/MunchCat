package src.gui;

import java.awt.Component;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;
import src.Gracz;
import src.karty.*;
import src.KontrolerGry;

public class Gra extends javax.swing.JFrame {

    KontrolerGry kontroler;

    public Gra() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
        wezDoRekiButton.setVisible(false);
        walczButton.setVisible(false);
        kontroler = new KontrolerGry();
        ustawKartyNaPanelu(kartyWRece, kontroler.gracz.kartyWRece);
    }

    public void aktualizujGracza() {
        poziom.setText("Twój poziom: " + kontroler.gracz.poziom);
        poziomBojowy.setText("Twój poziom bojowy: " + kontroler.gracz.poziomBojowy);

        ustawKartyNaPanelu(kartyNaStole, kontroler.gracz.kartyNaStole);
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
        otworzDrzwi = new javax.swing.JButton();
        walczButton = new javax.swing.JButton();
        wezDoRekiButton = new javax.swing.JButton();
        wylozZRekiButton = new javax.swing.JButton();
        otwarteDrzwi = new javax.swing.JPanel();
        kartyNaStoleKomputera = new javax.swing.JPanel();
        kartyWRece = new javax.swing.JPanel();
        kartyNaStole = new javax.swing.JPanel();
        poziomBojowyKomputera = new javax.swing.JLabel();
        poziomKomputera = new javax.swing.JLabel();
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

        otworzDrzwi.setText("Otwórz drzwi");
        otworzDrzwi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otworzDrzwiActionPerformed(evt);
            }
        });
        getContentPane().add(otworzDrzwi);
        otworzDrzwi.setBounds(0, 520, 130, 23);

        walczButton.setText("Walcz z potworem");
        walczButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walczButtonActionPerformed(evt);
            }
        });
        getContentPane().add(walczButton);
        walczButton.setBounds(0, 420, 130, 23);

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

        kartyNaStoleKomputera.setBackground(new java.awt.Color(25, 91, 19));
        kartyNaStoleKomputera.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty komputera"));
        getContentPane().add(kartyNaStoleKomputera);
        kartyNaStoleKomputera.setBounds(140, 350, 520, 120);

        kartyWRece.setBackground(new java.awt.Color(255, 199, 86));
        kartyWRece.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty w ręce"));
        getContentPane().add(kartyWRece);
        kartyWRece.setBounds(140, 630, 520, 120);

        kartyNaStole.setBackground(new java.awt.Color(25, 91, 19));
        kartyNaStole.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty na stole"));
        getContentPane().add(kartyNaStole);
        kartyNaStole.setBounds(140, 480, 520, 120);

        poziomBojowyKomputera.setText("Poziom bojowy komputera: 1");
        getContentPane().add(poziomBojowyKomputera);
        poziomBojowyKomputera.setBounds(1090, 220, 160, 14);

        poziomKomputera.setText("Poziom komputera: 1");
        getContentPane().add(poziomKomputera);
        poziomKomputera.setBounds(1090, 200, 120, 14);

        poziomBojowy.setText("Twój poziom bojowy: 1");
        getContentPane().add(poziomBojowy);
        poziomBojowy.setBounds(1100, 300, 130, 14);

        poziom.setText("Twój poziom: 1");
        getContentPane().add(poziom);
        poziom.setBounds(1100, 270, 90, 20);

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
        kontroler.gracz.wylozKartyNaStol(zaznaczoneKarty);
        aktualizujGracza();
    }//GEN-LAST:event_wylozZRekiButtonActionPerformed

    private void koniecTuryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koniecTuryButtonActionPerformed
        kontroler.komputer.wylozKartyNaStol(kontroler.komputer.kartyWRece);
        ustawKartyNaPanelu(kartyNaStoleKomputera, kontroler.komputer.kartyNaStole);
        poziomBojowyKomputera.setText("Poziom bojowy komputera: " + kontroler.komputer.poziomBojowy);
    }//GEN-LAST:event_koniecTuryButtonActionPerformed

    private void otworzDrzwiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otworzDrzwiActionPerformed
        Drzwi d = kontroler.karty.nastepnaKartaDrzwi();
        CopyOnWriteArrayList<Karta> nastepneDrzwi = new CopyOnWriteArrayList();
        nastepneDrzwi.add(d);
        ustawKartyNaPanelu(otwarteDrzwi, nastepneDrzwi);

        if (d instanceof Potwor) {
            walczButton.setVisible(true);
            ///
            ///
            kontroler.karty.odrzuconeDrzwi.add(d);
        } else {
            wezDoRekiButton.setVisible(true);
        }
    }//GEN-LAST:event_otworzDrzwiActionPerformed

    private void wezDoRekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wezDoRekiButtonActionPerformed
        kontroler.gracz.kartyWRece.add(((KartaGUI) otwarteDrzwi.getComponent(0)).karta);
        aktualizujGracza();
        otwarteDrzwi.removeAll();
        otwarteDrzwi.repaint();
        otwarteDrzwi.revalidate();
        wezDoRekiButton.setVisible(false);
    }//GEN-LAST:event_wezDoRekiButtonActionPerformed

    private void walczButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walczButtonActionPerformed
        //if (kontroler.gracz.poziom > ((Potwor) ((KartaGUI) otwarteDrzwi.getComponent(0)).karta).poziom)
        Kostka dice = new Kostka(this);
        //Kostka.createInstance(this);
        int number = dice.nextNumber();
        System.out.println(number);
    }//GEN-LAST:event_walczButtonActionPerformed

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
    private javax.swing.JPanel kartyNaStoleKomputera;
    private javax.swing.JPanel kartyWRece;
    private javax.swing.JButton koniecTuryButton;
    private javax.swing.JPanel otwarteDrzwi;
    private javax.swing.JButton otworzDrzwi;
    private javax.swing.JLabel poziom;
    private javax.swing.JLabel poziomBojowy;
    private javax.swing.JLabel poziomBojowyKomputera;
    private javax.swing.JLabel poziomKomputera;
    private javax.swing.JButton walczButton;
    private javax.swing.JButton wezDoRekiButton;
    private javax.swing.JButton wylozZRekiButton;
    // End of variables declaration//GEN-END:variables
}
