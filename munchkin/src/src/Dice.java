package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Dice extends javax.swing.JDialog {

    private Random generator = new Random();
    private int value;
    private Timer timerDice;

    public Dice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        timerDice = new Timer(100, diceAction);
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
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(231, 117, 93));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice1.png"))); // NOI18N
        dice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diceMouseClicked(evt);
            }
        });
        getContentPane().add(dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diceMouseClicked
        timerDice.stop();
        //jB_OK.setVisible(true);
        pack();
    }//GEN-LAST:event_diceMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dice dialog = new Dice(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel dice;
    // End of variables declaration//GEN-END:variables
}
