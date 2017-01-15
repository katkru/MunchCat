package src.gui;

import src.karty.Karta;


public class KartaMalaGUI extends KartaGUI {


    public KartaMalaGUI() {
        initComponents();
    }
    
    @Override
    public void ustawKarte(Karta k) {
        karta = k;
        grafika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cards_NEW/" + karta.sciezka + "MM.jpg")));
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grafika = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafika, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafika, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grafika;
    // End of variables declaration//GEN-END:variables
}
