package src.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Kostka extends javax.swing.JDialog {

    private Random generator = new Random();
    private int value;
    private Timer timerDice;
    private final String marnyKoniec;

    public Kostka(java.awt.Frame parent, String k) {
        super(parent, true);
        initComponents();
        marnyKoniec = k;
        timerDice = new Timer(500, diceAction);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        timerDice.start();
    }

    private int privateNextNumber() {
        return (generator.nextInt(6) + 1);
    }

    private ActionListener diceAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ev) {
            value = privateNextNumber();
            String path = "/img/dice" + value + ".png";
            dice.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
            pack();
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dice = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(231, 117, 93));
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice1.png"))); // NOI18N
        dice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diceMouseClicked(evt);
            }
        });
        getContentPane().add(dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 120));

        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 40));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diceMouseClicked
        timerDice.stop();
        if (value >= 5) {
            text.setText("Uff, udało ci się uciec");
        } else {
            text.setText("Niestety nie udało Ci się uciec przed potworem. Lądujesz znów na 1 poziomie");
        }
        okButton.setVisible(true);
        pack();
    }//GEN-LAST:event_diceMouseClicked

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    public int nextNumber() {
        okButton.setVisible(false);
        pack();
        timerDice.start();
        this.setVisible(true);
        return value;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel dice;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
