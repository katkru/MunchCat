package src.gui;

import java.awt.Color;
import src.karty.Karta;

public class KartaGUI extends javax.swing.JPanel {

    public Karta karta;
    public boolean wybrana = false;

    public KartaGUI() {
        initComponents();
        setBackground(new Color(240, 240, 240));
    }

    public void ustawKarte(Karta k) {
        karta = k;

        grafika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cards_NEW/" + karta.sciezka + "M.jpg")));

        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grafika = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        grafika.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        grafika.setMaximumSize(new java.awt.Dimension(150, 255));
        grafika.setMinimumSize(new java.awt.Dimension(150, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafika, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafika, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        wybrana = !wybrana;
        if (wybrana) {
            setBackground(new Color(153, 153, 150));
        } else {
            setBackground(new Color(240, 240, 240));
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        Gra.kartaDuza.setText(karta.toString());
        if (!karta.sciezka.equals("")) {
            String path = "/img/cards_NEW/" + karta.sciezka + ".jpg";
            Gra.kartaDuza.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
        }
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        Gra.kartaDuza.setText("");
        Gra.kartaDuza.setIcon(null);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grafika;
    // End of variables declaration//GEN-END:variables
}
