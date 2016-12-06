package src;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class Instruction extends javax.swing.JFrame {

    private Timer timer;
    private int counter = 0;

    public Instruction() {

        initComponents();
        addListeners();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        enlargedCard = new javax.swing.JLabel();
        arrow1 = new javax.swing.JLabel();
        arrow2 = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setMaximizedBounds(getMaximizedBounds());
        setMinimumSize(getMinimumSize());
        setUndecorated(true);
        setSize(getMaximumSize());
        getContentPane().setLayout(null);

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusable(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton);
        nextButton.setBounds(1020, 70, 90, 40);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(1440, 80, 80, 60);

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusable(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menuButton);
        menuButton.setBounds(1370, 90, 90, 40);

        enlargedCard.setFocusable(false);
        getContentPane().add(enlargedCard);
        enlargedCard.setBounds(1130, 30, 230, 400);

        arrow1.setFocusable(false);
        arrow1.setName(""); // NOI18N
        getContentPane().add(arrow1);
        arrow1.setBounds(670, 560, 40, 110);

        arrow2.setFocusable(false);
        arrow2.setName(""); // NOI18N
        getContentPane().add(arrow2);
        arrow2.setBounds(480, 560, 40, 110);

        card1.setName(""); // NOI18N
        getContentPane().add(card1);
        card1.setBounds(50, 700, 170, 290);

        card2.setName(""); // NOI18N
        getContentPane().add(card2);
        card2.setBounds(240, 700, 170, 290);

        card3.setName(""); // NOI18N
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });
        getContentPane().add(card3);
        card3.setBounds(420, 700, 170, 290);

        card4.setName(""); // NOI18N
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });
        getContentPane().add(card4);
        card4.setBounds(610, 700, 170, 290);

        card5.setName(""); // NOI18N
        getContentPane().add(card5);
        card5.setBounds(60, 510, 50, 90);

        card6.setName(""); // NOI18N
        getContentPane().add(card6);
        card6.setBounds(140, 510, 50, 90);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/0.jpg"))); // NOI18N
        background.setFocusable(false);
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addListeners() {
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card1.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });

        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card2.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });

        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card3.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });

        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card4.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card5.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card6.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
    }

    private void playSound(String soundName) {
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = null;
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Instruction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Instruction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Instruction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        close();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_menuButtonActionPerformed

    private ActionListener timerAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ev) {
            ++counter;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
            if (counter == 6) {
                timer.stop();
                card1.setName("mlody");
                card2.setName("pierscien");
                card3.setName("pila");
                card4.setName("wojownik");
            } else {
                playSound("src/img/sounds/card.wav");
            }
        }
    };



    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        ++counter;
        playSound("src/img/sounds/next.wav");

        if (counter == 2) {
            --counter;
            timer = new Timer(400, timerAction);
            timer.start();
        }
        if (counter == 7) {
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
            arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.gif")));
            nextButton.setVisible(false);
        } else {
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
            nextButton.requestFocusInWindow();
        }
        /*Dice dice = new Dice(this, true);
        dice.setVisible(true);
        close();*/
    }//GEN-LAST:event_nextButtonActionPerformed

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        if (counter == 7) {
            ++counter;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
            arrow1.setVisible(false);
            playSound("src/img/sounds/card.wav");
            arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.gif")));
            card4.setName("");
            card5.setName("wojownik");
            enlargedCard.setIcon(null);
        }
    }//GEN-LAST:event_card4MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        if (counter == 8) {
            ++counter;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
            arrow2.setVisible(false);
            playSound("src/img/sounds/card.wav");
            card3.setName("");
            card6.setName("pila");
            nextButton.setVisible(true);
            enlargedCard.setIcon(null);
        }
    }//GEN-LAST:event_card3MouseClicked

        private void cardMouseExited() {
        enlargedCard.setIcon(null);
    }

    private void cardMouseEntered(String name) {
        if (!name.equals("")) {
            String path = "/img/cards/" + name + ".jpg";
            enlargedCard.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
        }
    }
    
    public void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrow1;
    private javax.swing.JLabel arrow2;
    private javax.swing.JLabel background;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel enlargedCard;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
