package src.gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playButton = new javax.swing.JButton();
        instructionButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        authorsButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MunchCat");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1680, 1050));
        setMinimumSize(new java.awt.Dimension(1680, 1050));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1680, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setBackground(new java.awt.Color(255, 204, 102));
        playButton.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("GRAJ");
        playButton.setBorder(null);
        playButton.setDefaultCapable(false);
        playButton.setFocusable(false);
        playButton.setName(""); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 830, 140));

        instructionButton.setBackground(new java.awt.Color(255, 204, 102));
        instructionButton.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        instructionButton.setForeground(new java.awt.Color(255, 255, 255));
        instructionButton.setText("INSTRUKCJA");
        instructionButton.setBorder(null);
        instructionButton.setBorderPainted(false);
        instructionButton.setDefaultCapable(false);
        instructionButton.setFocusable(false);
        instructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(instructionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 830, 140));

        exitButton.setBackground(new Color(0,0,0,0));
        exitButton.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        exitButton.setForeground(new java.awt.Color(2, 40, 21));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exitButton.setMaximumSize(new java.awt.Dimension(80, 50));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 100, 50, 40));

        authorsButton.setBackground(new java.awt.Color(255, 204, 102));
        authorsButton.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        authorsButton.setForeground(new java.awt.Color(255, 255, 255));
        authorsButton.setText("AUTORZY");
        authorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(authorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 830, 140));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1700, 1100));
        background.setMinimumSize(new java.awt.Dimension(1700, 1100));
        background.setPreferredSize(background.getMaximumSize());
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1710, 1130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        final Gra gamecontroller = new Gra();
        gamecontroller.setVisible(true);
        close();
    }//GEN-LAST:event_playButtonActionPerformed

    public void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }

    private void instructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionButtonActionPerformed
        final Instrukcja instruction = new Instrukcja();
        instruction.setVisible(true);
        close();
    }//GEN-LAST:event_instructionButtonActionPerformed

    private void authorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsButtonActionPerformed
        Autorzy authors = new Autorzy();
        authors.setVisible(true);
        close();
    }//GEN-LAST:event_authorsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorsButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton instructionButton;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables

}
