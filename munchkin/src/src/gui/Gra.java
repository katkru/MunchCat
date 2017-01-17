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
        zrobioneButton.setVisible(false);
        wezKarteDrzwiButton.setVisible(false);
        walczZPotworemZRekiButton.setVisible(false);
        kontroler = new KontrolerGry();
        tura = new Tura();
        ustawKartyNaPanelu(kartyWRece, KontrolerGry.gracz.kartyWRece, false);
    }

    public void aktualizujKartyIPoziomyGracza() {
        poziom.setText("" + KontrolerGry.gracz.poziom);
        poziomBojowy.setText("" + KontrolerGry.gracz.poziomBojowy());
        if (KontrolerGry.gracz.klasa != null) {
            klasa.setText("" + KontrolerGry.gracz.klasa.toString());
        } else {
            klasa.setText("brak");
        }
        if (KontrolerGry.gracz.rasa != null) {
            rasa.setText("" + KontrolerGry.gracz.rasa.toString());
        } else {
            rasa.setText("człowiek");
        }
        ustawKartyNaPanelu(kartyNaStole, KontrolerGry.gracz.kartyNaStole, true);
        ustawKartyNaPanelu(kartyWRece, KontrolerGry.gracz.kartyWRece, false);

        repaint();
        revalidate();
    }

    private void ustawKartyNaPanelu(JPanel panel, CopyOnWriteArrayList<Karta> karty, boolean mala) {
        panel.removeAll();
        for (Karta k : karty) {
            KartaGUI karta;
            if (mala) {
                karta = new KartaMalaGUI();
            } else {
                karta = new KartaGUI();
            }
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
        walczZPotworemZRekiButton = new javax.swing.JButton();
        wezKarteDrzwiButton = new javax.swing.JButton();
        zrobioneButton = new javax.swing.JButton();
        koniecTuryButton = new javax.swing.JButton();
        otworzDrzwiButton = new javax.swing.JButton();
        walczButton = new javax.swing.JButton();
        odrzucKartyButton = new javax.swing.JButton();
        wylozZRekiButton = new javax.swing.JButton();
        wezDoRekiButton = new javax.swing.JButton();
        otwarteDrzwi = new javax.swing.JPanel();
        kartyWRece = new javax.swing.JPanel();
        kartyNaStole = new javax.swing.JPanel();
        klasa = new javax.swing.JLabel();
        rasa = new javax.swing.JLabel();
        poziomBojowy = new javax.swing.JLabel();
        poziom = new javax.swing.JLabel();
        kartaDuza = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        homeButton.setBounds(1210, 70, 80, 60);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(1260, 70, 80, 60);

        walczZPotworemZRekiButton.setText("Walcz z potworem z ręki");
        walczZPotworemZRekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walczZPotworemZRekiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(walczZPotworemZRekiButton);
        walczZPotworemZRekiButton.setBounds(790, 470, 190, 25);

        wezKarteDrzwiButton.setText("Weź kartę drzwi");
        wezKarteDrzwiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wezKarteDrzwiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(wezKarteDrzwiButton);
        wezKarteDrzwiButton.setBounds(640, 470, 130, 25);

        zrobioneButton.setText("Zrobione");
        zrobioneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrobioneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zrobioneButton);
        zrobioneButton.setBounds(640, 510, 130, 25);

        koniecTuryButton.setText("Koniec tury");
        koniecTuryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koniecTuryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(koniecTuryButton);
        koniecTuryButton.setBounds(790, 510, 130, 25);
        koniecTuryButton.getAccessibleContext().setAccessibleName("");

        otworzDrzwiButton.setText("Otwórz drzwi");
        otworzDrzwiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otworzDrzwiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(otworzDrzwiButton);
        otworzDrzwiButton.setBounds(790, 510, 130, 25);

        walczButton.setText("Walcz z potworem");
        walczButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walczButtonActionPerformed(evt);
            }
        });
        getContentPane().add(walczButton);
        walczButton.setBounds(790, 510, 130, 25);

        odrzucKartyButton.setText("Odrzuc karty");
        odrzucKartyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odrzucKartyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(odrzucKartyButton);
        odrzucKartyButton.setBounds(0, 480, 130, 25);

        wylozZRekiButton.setText("Wyłóż kartę z ręki");
        wylozZRekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wylozZRekiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(wylozZRekiButton);
        wylozZRekiButton.setBounds(0, 510, 130, 25);
        wylozZRekiButton.getAccessibleContext().setAccessibleName("Wyłóż na stół");
        wylozZRekiButton.getAccessibleContext().setAccessibleDescription("");

        wezDoRekiButton.setText("Weź kartę do ręki");
        wezDoRekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wezDoRekiButtonActionPerformed(evt);
            }
        });
        getContentPane().add(wezDoRekiButton);
        wezDoRekiButton.setBounds(790, 510, 130, 25);

        otwarteDrzwi.setBackground(new java.awt.Color(25, 91, 19));
        otwarteDrzwi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        getContentPane().add(otwarteDrzwi);
        otwarteDrzwi.setBounds(650, 310, 350, 130);

        kartyWRece.setBackground(new java.awt.Color(255, 199, 86));
        kartyWRece.setOpaque(false);
        getContentPane().add(kartyWRece);
        kartyWRece.setBounds(30, 600, 1310, 320);

        kartyNaStole.setBackground(new java.awt.Color(25, 91, 19));
        kartyNaStole.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "karty na stole"));
        getContentPane().add(kartyNaStole);
        kartyNaStole.setBounds(20, 310, 620, 160);

        klasa.setFont(new java.awt.Font("Century751 No2 BT", 0, 36)); // NOI18N
        klasa.setForeground(new java.awt.Color(204, 204, 204));
        klasa.setText("brak");
        getContentPane().add(klasa);
        klasa.setBounds(1130, 240, 200, 80);

        rasa.setFont(new java.awt.Font("Century751 No2 BT", 0, 36)); // NOI18N
        rasa.setForeground(new java.awt.Color(204, 204, 204));
        rasa.setText("człowiek");
        getContentPane().add(rasa);
        rasa.setBounds(1130, 220, 230, 30);

        poziomBojowy.setFont(new java.awt.Font("Century751 No2 BT", 0, 36)); // NOI18N
        poziomBojowy.setForeground(new java.awt.Color(204, 204, 204));
        poziomBojowy.setText("1");
        getContentPane().add(poziomBojowy);
        poziomBojowy.setBounds(1130, 160, 140, 50);

        poziom.setFont(new java.awt.Font("Century751 No2 BT", 0, 36)); // NOI18N
        poziom.setForeground(new java.awt.Color(204, 204, 204));
        poziom.setText("1");
        getContentPane().add(poziom);
        poziom.setBounds(1130, 110, 100, 40);

        kartaDuza.setBackground(new java.awt.Color(25, 91, 19));
        kartaDuza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kartaDuza.setForeground(new java.awt.Color(255, 255, 255));
        kartaDuza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(kartaDuza);
        kartaDuza.setBounds(1440, 130, 220, 360);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgroundWithData.jpg"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(-10, -50, 2030, 1080);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 210, 41, 16);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 140, 41, 16);

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
        Drzwi drzwi = KontrolerGry.karty.nastepnaKartaDrzwi();
        CopyOnWriteArrayList<Karta> nastepneDrzwi = new CopyOnWriteArrayList();
        nastepneDrzwi.add(drzwi);
        ustawKartyNaPanelu(otwarteDrzwi, nastepneDrzwi, false);
        tura.otworzDrzwi(drzwi);
    }//GEN-LAST:event_otworzDrzwiButtonActionPerformed

    private void wezDoRekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wezDoRekiButtonActionPerformed
        KontrolerGry.gracz.kartyWRece.add(((KartaGUI) otwarteDrzwi.getComponent(0)).karta);

        wezDoRekiButton.setVisible(false);
        aktualizujKartyIPoziomyGracza();
        wyczyscKartyPoOtwarciuDrzwi();

        wezKarteDrzwiButton.setVisible(true);
        if (KontrolerGry.maPotworaWRece()) {
            walczZPotworemZRekiButton.setVisible(true);////////////////////////////////////
        }
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

    private void zrobioneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrobioneButtonActionPerformed
        Drzwi d = (Drzwi) ((KartaGUI) otwarteDrzwi.getComponent(0)).karta;
        KontrolerGry.karty.odrzuconeDrzwi.add(d);
        wyczyscKartyPoOtwarciuDrzwi();
        zrobioneButton.setVisible(false);
        wezKarteDrzwiButton.setVisible(true);
        if (KontrolerGry.maPotworaWRece()) {
            walczZPotworemZRekiButton.setVisible(true);///////////////////////////////
        }
    }//GEN-LAST:event_zrobioneButtonActionPerformed

    private void wezKarteDrzwiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wezKarteDrzwiButtonActionPerformed
        wezKarteDrzwiButton.setVisible(false);
        walczZPotworemZRekiButton.setVisible(false);
        Drzwi drzwi = KontrolerGry.karty.nastepnaKartaDrzwi();
        KontrolerGry.gracz.kartyWRece.add(drzwi);
        aktualizujKartyIPoziomyGracza();
        wyczyscKartyPoOtwarciuDrzwi();
        koniecTuryButton.setVisible(true);
    }//GEN-LAST:event_wezKarteDrzwiButtonActionPerformed

    private void walczZPotworemZRekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walczZPotworemZRekiButtonActionPerformed
        walczZPotworemZRekiButton.setVisible(false);
        wezKarteDrzwiButton.setVisible(false);

        CopyOnWriteArrayList<Karta> zaznaczonyPotwor = zaznaczoneKarty(kartyWRece);
        KontrolerGry.gracz.kartyWRece.remove(zaznaczoneKarty(kartyWRece).get(0));
        aktualizujKartyIPoziomyGracza();
        ustawKartyNaPanelu(otwarteDrzwi, zaznaczonyPotwor, false);
        walczButton.setVisible(true);
    }//GEN-LAST:event_walczZPotworemZRekiButtonActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel kartaDuza;
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
    public static javax.swing.JButton walczButton;
    private javax.swing.JButton walczZPotworemZRekiButton;
    public static javax.swing.JButton wezDoRekiButton;
    private javax.swing.JButton wezKarteDrzwiButton;
    private javax.swing.JButton wylozZRekiButton;
    public static javax.swing.JButton zrobioneButton;
    // End of variables declaration//GEN-END:variables
}
