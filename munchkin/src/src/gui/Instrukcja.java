package src.gui;

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

public class Instrukcja extends javax.swing.JFrame {

    private Timer timer;
    private int counter = 0;

    public Instrukcja() {

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
        cardTable = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
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
        nextButton.setBounds(1730, 830, 90, 40);

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
        enlargedCard.setBounds(1650, 140, 230, 400);

        arrow1.setFocusable(false);
        arrow1.setName(""); // NOI18N
        getContentPane().add(arrow1);
        arrow1.setBounds(670, 560, 40, 110);

        arrow2.setFocusable(false);
        arrow2.setName(""); // NOI18N
        getContentPane().add(arrow2);
        arrow2.setBounds(480, 560, 40, 110);

        cardTable.setName(""); // NOI18N
        getContentPane().add(cardTable);
        cardTable.setBounds(680, 400, 90, 150);

        card1.setName(""); // NOI18N
        getContentPane().add(card1);
        card1.setBounds(50, 700, 170, 290);

        card2.setName(""); // NOI18N
        getContentPane().add(card2);
        card2.setBounds(240, 700, 170, 290);

        card3.setFocusCycleRoot(true);
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

        card9.setName(""); // NOI18N
        getContentPane().add(card9);
        card9.setBounds(220, 510, 50, 90);

        card7.setName(""); // NOI18N
        getContentPane().add(card7);
        card7.setBounds(60, 350, 50, 90);

        card8.setName(""); // NOI18N
        getContentPane().add(card8);
        card8.setBounds(140, 350, 50, 90);

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
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card7.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card8.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(card9.getName());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardMouseExited();
            }
        });
        cardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardMouseEntered(cardTable.getName());
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
            Logger.getLogger(Instrukcja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Instrukcja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Instrukcja.class.getName()).log(Level.SEVERE, null, ex);
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
            setBackground();
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

    private ActionListener timerAction2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ev) {
            ++counter;
            setBackground();
            playSound("src/img/sounds/card.wav");
            if (counter == 11) {
                timer.stop();
                card7.setName("elf");
                card8.setName("miecz");
            }
        }
    };

    private void setBackground() {
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruction/" + counter + ".jpg")));
        this.validate();
        this.repaint();
    }

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        ++counter;
        playSound("src/img/sounds/next.wav");

        switch (counter) {
            case 2:
                --counter;
                timer = new Timer(400, timerAction);
                timer.start();
                break;

            case 7:
                setBackground();
                arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.gif")));
                nextButton.setVisible(false);
                card4.requestFocus();
                break;
            case 10:
                --counter;
                timer = new Timer(400, timerAction2);
                timer.start();
                break;
            case 14:
                setBackground();
                cardTable.setName("klatwa");
                playSound("src/img/sounds/card.wav");
                break;
            case 16:
                setBackground();
                cardTable.setName("");
                break;
            case 19:
                setBackground();
                cardTable.setName("osmioscian");
                playSound("src/img/sounds/card.wav");
                break;
            case 23:
                setBackground();
                cardTable.setName("");
                card3.setName("buty");
                playSound("src/img/sounds/ding.wav");
                break;
            case 24:
                arrow2.setVisible(true);
                nextButton.setVisible(false);
                setBackground();
                break;
            case 26:
                cardTable.setName("powtorka");
                playSound("src/img/sounds/ding.wav");
                setBackground();
                break;
            case 27:
                cardTable.setName("");
                setBackground();
                break;
            case 28:
                cardTable.setName("rozwscieczony");
                playSound("src/img/sounds/card.wav");
                setBackground();
                break;
            case 29:
                cardTable.setName("");
                setBackground();
                break;
            case 30:
                cardTable.setName("drob");
                playSound("src/img/sounds/card.wav");
                setBackground();
                break;
            case 33:
                cardTable.setName("");
                playSound("src/img/sounds/ding.wav");
                nextButton.setVisible(false);
                setBackground();
                break;                  
            default:
                setBackground();
                nextButton.requestFocus();
                break;
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        if (counter == 7) {
            ++counter;
            setBackground();
            arrow1.setVisible(false);
            playSound("src/img/sounds/card.wav");
            arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.gif")));
            card4.setName("");
            card5.setName("wojownik");
            enlargedCard.setIcon(null);
            card3.requestFocus();
        }
    }//GEN-LAST:event_card4MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        if (counter == 8) {
            ++counter;
            arrow2.setVisible(false);
            playSound("src/img/sounds/card.wav");
            card3.setName("");
            card6.setName("pila");
            nextButton.setVisible(true);
            enlargedCard.setIcon(null);
            setBackground();
        } else if (counter == 24) {
            ++counter;
            arrow2.setVisible(false);
            playSound("src/img/sounds/card.wav");
            card3.setName("");
            card9.setName("buty");
            nextButton.setVisible(true);
            enlargedCard.setIcon(null);
            setBackground();
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
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JLabel cardTable;
    private javax.swing.JLabel enlargedCard;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
