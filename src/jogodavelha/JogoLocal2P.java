package jogodavelha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JogoLocal2P extends javax.swing.JFrame {

    String nomeJogador = "Jogador 1";

    public JogoLocal2P() {
        initComponents();
        definirNomeJogador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnljogo = new javax.swing.JPanel();
        btjogo1 = new javax.swing.JButton();
        btjogo2 = new javax.swing.JButton();
        btjogo3 = new javax.swing.JButton();
        btjogo4 = new javax.swing.JButton();
        btjogo5 = new javax.swing.JButton();
        btjogo6 = new javax.swing.JButton();
        btjogo7 = new javax.swing.JButton();
        btjogo8 = new javax.swing.JButton();
        btjogo9 = new javax.swing.JButton();
        pnljogadores = new javax.swing.JPanel();
        lblmenujogadores = new javax.swing.JLabel();
        lbljogador1 = new javax.swing.JLabel();
        lbljogador2 = new javax.swing.JLabel();
        variaveljogador1 = new javax.swing.JLabel();
        variaveljogador2 = new javax.swing.JLabel();
        pnlcontrolejogo = new javax.swing.JPanel();
        btjogovoltar = new javax.swing.JButton();
        btnovojogo = new javax.swing.JButton();
        lblnomejogador1 = new javax.swing.JLabel();
        lblnomejogador2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");

        pnljogo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btjogo1.setMaximumSize(new java.awt.Dimension(70, 20));
        btjogo1.setMinimumSize(new java.awt.Dimension(70, 20));
        btjogo1.setPreferredSize(new java.awt.Dimension(70, 20));
        btjogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo1ActionPerformed(evt);
            }
        });

        btjogo2.setPreferredSize(new java.awt.Dimension(70, 20));
        btjogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo2ActionPerformed(evt);
            }
        });

        btjogo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo3ActionPerformed(evt);
            }
        });

        btjogo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo4ActionPerformed(evt);
            }
        });

        btjogo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo5ActionPerformed(evt);
            }
        });

        btjogo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo6ActionPerformed(evt);
            }
        });

        btjogo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo7ActionPerformed(evt);
            }
        });

        btjogo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo8ActionPerformed(evt);
            }
        });

        btjogo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnljogoLayout = new javax.swing.GroupLayout(pnljogo);
        pnljogo.setLayout(pnljogoLayout);
        pnljogoLayout.setHorizontalGroup(
            pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btjogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjogo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnljogoLayout.setVerticalGroup(
            pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjogo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btjogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btjogo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnljogadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu de Jogadores"));

        lblmenujogadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmenujogadores.setText("Jogadores");

        lbljogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbljogador1.setText("Jogador 1:");

        lbljogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbljogador2.setText("Jogador 2:");

        variaveljogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        variaveljogador1.setText("X");

        variaveljogador2.setText("O");

        pnlcontrolejogo.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de Jogo"));

        btjogovoltar.setText("Voltar");
        btjogovoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogovoltarActionPerformed(evt);
            }
        });

        btnovojogo.setText("Novo");
        btnovojogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovojogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlcontrolejogoLayout = new javax.swing.GroupLayout(pnlcontrolejogo);
        pnlcontrolejogo.setLayout(pnlcontrolejogoLayout);
        pnlcontrolejogoLayout.setHorizontalGroup(
            pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontrolejogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnovojogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogovoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlcontrolejogoLayout.setVerticalGroup(
            pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontrolejogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnovojogo)
                .addGap(18, 18, 18)
                .addComponent(btjogovoltar)
                .addContainerGap())
        );

        lblnomejogador1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblnomejogador1.setText("Humano");

        lblnomejogador2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblnomejogador2.setText("Humano");

        javax.swing.GroupLayout pnljogadoresLayout = new javax.swing.GroupLayout(pnljogadores);
        pnljogadores.setLayout(pnljogadoresLayout);
        pnljogadoresLayout.setHorizontalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                                        .addComponent(lbljogador2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(variaveljogador2))
                                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                                        .addComponent(lbljogador1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(variaveljogador1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblnomejogador2))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblnomejogador1))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblmenujogadores)))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnljogadoresLayout.setVerticalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addComponent(lblmenujogadores)
                .addGap(5, 5, 5)
                .addComponent(lblnomejogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(variaveljogador1)
                    .addComponent(lbljogador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnomejogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljogador2)
                    .addComponent(variaveljogador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnljogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnljogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnljogadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnljogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovojogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovojogoActionPerformed
        resetarJogo();
    }//GEN-LAST:event_btnovojogoActionPerformed

    private void btjogovoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogovoltarActionPerformed
        MenuGeral mg = new MenuGeral();
        mg.setLocationRelativeTo(null);
        mg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btjogovoltarActionPerformed

    private void btjogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo1ActionPerformed
        btjogo1.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo1.getText() == "X") {
            btjogo1.setText("O");
        } else {
            btjogo1.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo1ActionPerformed

    private void btjogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo2ActionPerformed
        btjogo2.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo2.getText() == "X") {
            btjogo2.setText("O");
        } else {
            btjogo2.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo2ActionPerformed

    private void btjogo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo3ActionPerformed
        btjogo3.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo3.getText() == "X") {
            btjogo3.setText("O");
        } else {
            btjogo3.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo3ActionPerformed

    private void btjogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo4ActionPerformed
        btjogo4.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo4.getText() == "X") {
            btjogo4.setText("O");
        } else {
            btjogo4.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo4ActionPerformed

    private void btjogo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo5ActionPerformed
        btjogo5.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo5.getText() == "X") {
            btjogo5.setText("O");
        } else {
            btjogo5.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo5ActionPerformed

    private void btjogo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo6ActionPerformed
        btjogo6.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo6.getText() == "X") {
            btjogo6.setText("O");
        } else {
            btjogo6.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo6ActionPerformed

    private void btjogo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo7ActionPerformed
        btjogo7.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo7.getText() == "X") {
            btjogo7.setText("O");
        } else {
            btjogo7.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo7ActionPerformed

    private void btjogo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo8ActionPerformed
        btjogo8.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo8.getText() == "X") {
            btjogo8.setText("O");
        } else {
            btjogo8.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo8ActionPerformed

    private void btjogo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo9ActionPerformed
        btjogo9.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo9.getText() == "X") {
            btjogo9.setText("O");
        } else {
            btjogo9.setText("X");
        }
        vitoria1p();
    }//GEN-LAST:event_btjogo9ActionPerformed

    private void definirNomeJogador() {

        nomeJogador = JOptionPane.showInputDialog(null, "Insira o nome do jogador 1:");
        lbljogador1.setText(nomeJogador + ":");
        nomeJogador = JOptionPane.showInputDialog(null, "Insira o nome do jogador 1:");
        lbljogador2.setText(nomeJogador + ":");

    }

    private void resetarJogo() {
        btjogo1.setText(null);
        btjogo2.setText(null);
        btjogo3.setText(null);
        btjogo4.setText(null);
        btjogo5.setText(null);
        btjogo6.setText(null);
        btjogo7.setText(null);
        btjogo8.setText(null);
        btjogo9.setText(null);
    }

    private void vitoria1p() {

        if ((btjogo1.getText() == "X" && btjogo2.getText() == "X" && btjogo3.getText() == "X")
                || (btjogo4.getText() == "X" && btjogo5.getText() == "X" && btjogo6.getText() == "X")
                || (btjogo7.getText() == "X" && btjogo8.getText() == "X" && btjogo9.getText() == "X")
                || (btjogo1.getText() == "X" && btjogo4.getText() == "X" && btjogo7.getText() == "X")
                || (btjogo2.getText() == "X" && btjogo5.getText() == "X" && btjogo8.getText() == "X")
                || (btjogo3.getText() == "X" && btjogo6.getText() == "X" && btjogo9.getText() == "X")
                || (btjogo1.getText() == "X" && btjogo5.getText() == "X" && btjogo9.getText() == "X")
                || (btjogo7.getText() == "X" && btjogo5.getText() == "X" && btjogo3.getText() == "X")) {
            JOptionPane.showMessageDialog(null, lbljogador1.getText() + " venceu!");
            resetarJogo();
        } else {
            if ((btjogo1.getText() == "O" && btjogo2.getText() == "O" && btjogo3.getText() == "O") || (btjogo4.getText() == "O" && btjogo5.getText() == "O" && btjogo6.getText() == "O") || (btjogo7.getText() == "O" && btjogo8.getText() == "O" && btjogo9.getText() == "O") || (btjogo1.getText() == "O" && btjogo4.getText() == "O" && btjogo7.getText() == "O") || (btjogo2.getText() == "O" && btjogo5.getText() == "O" && btjogo8.getText() == "O") || (btjogo3.getText() == "O" && btjogo6.getText() == "O" && btjogo9.getText() == "O") || (btjogo1.getText() == "O" && btjogo5.getText() == "O" && btjogo9.getText() == "O") || (btjogo7.getText() == "O" && btjogo5.getText() == "O" && btjogo3.getText() == "O")) {
                JOptionPane.showMessageDialog(null, lbljogador2.getText() + " venceu!");
                resetarJogo();
            } else {
                JOptionPane.showMessageDialog(null, "Empate!");
                resetarJogo();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btjogo1;
    private javax.swing.JButton btjogo2;
    private javax.swing.JButton btjogo3;
    private javax.swing.JButton btjogo4;
    private javax.swing.JButton btjogo5;
    private javax.swing.JButton btjogo6;
    private javax.swing.JButton btjogo7;
    private javax.swing.JButton btjogo8;
    private javax.swing.JButton btjogo9;
    private javax.swing.JButton btjogovoltar;
    private javax.swing.JButton btnovojogo;
    private javax.swing.JLabel lbljogador1;
    private javax.swing.JLabel lbljogador2;
    private javax.swing.JLabel lblmenujogadores;
    private javax.swing.JLabel lblnomejogador1;
    private javax.swing.JLabel lblnomejogador2;
    private javax.swing.JPanel pnlcontrolejogo;
    private javax.swing.JPanel pnljogadores;
    private javax.swing.JPanel pnljogo;
    private javax.swing.JLabel variaveljogador1;
    private javax.swing.JLabel variaveljogador2;
    // End of variables declaration//GEN-END:variables

}
