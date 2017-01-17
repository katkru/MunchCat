package src.gui;

public class Komunikat extends javax.swing.JDialog {

    boolean znikac;

    public Komunikat(java.awt.Frame parent, String tekst, boolean maZniknac) {
        super(parent, true);
        initComponents();
        text.setText(tekst);
        znikac = maZniknac;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(231, 117, 93));
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setToolTipText("");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 230, 80));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        if (znikac) {
            final Menu menu = new Menu();
            menu.setVisible(true);
            close();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
