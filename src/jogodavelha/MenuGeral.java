package jogodavelha;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Joao
 */
public class MenuGeral extends javax.swing.JFrame {

    public MenuGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btjogarlocal1p = new javax.swing.JButton();
        btjogarlocal2p = new javax.swing.JButton();
        btjogarweb = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joao\\Documents\\NetBeansProjects\\JogoDaVelhaValores\\src\\jogodavelha\\icon.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 0, 260, 200);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione uma Opção"));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 126));

        btjogarlocal1p.setText("Um Jogador");
        btjogarlocal1p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogarlocal1pActionPerformed(evt);
            }
        });

        btjogarlocal2p.setText("Dois Jogadores Local");
        btjogarlocal2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogarlocal2pActionPerformed(evt);
            }
        });

        btjogarweb.setText("Dois Jogadores Web");
        btjogarweb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogarwebActionPerformed(evt);
            }
        });

        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjogarlocal1p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogarlocal2p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btjogarweb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btjogarlocal1p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btjogarlocal2p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btjogarweb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btjogarlocal1pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogarlocal1pActionPerformed
        JogoLocal1P j1 = new JogoLocal1P();
        j1.setLocationRelativeTo(null);
        j1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btjogarlocal1pActionPerformed

    private void btjogarlocal2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogarlocal2pActionPerformed
        JogoLocal2P j2 = new JogoLocal2P();
        j2.setLocationRelativeTo(null);
        j2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btjogarlocal2pActionPerformed

    private void btjogarwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogarwebActionPerformed
        String nomeJogador = JOptionPane.showInputDialog(null, "Digite seu nome:");
        JogoWeb2P j3, j4;
        if (nomeJogador.equals("") || nomeJogador == null) {
            nomeJogador = "Jogador 1";
            j3 = new JogoWeb2P(nomeJogador);
        } else {
            j3 = new JogoWeb2P(nomeJogador);
        }
        nomeJogador = JOptionPane.showInputDialog(null, "Digite seu nome:");
        if (nomeJogador.equals("") || nomeJogador == null) {
            nomeJogador = "Jogador 2";
            j4 = new JogoWeb2P(nomeJogador);
        } else {
            j4 = new JogoWeb2P(nomeJogador);
        }
        j3.setLocationRelativeTo(null);
        j4.setLocationRelativeTo(null);
        j3.setVisible(true);
        j4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btjogarwebActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MenuGeral mg = new MenuGeral();
        mg.setLocationRelativeTo(null);
        mg.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btjogarlocal1p;
    private javax.swing.JButton btjogarlocal2p;
    private javax.swing.JButton btjogarweb;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
