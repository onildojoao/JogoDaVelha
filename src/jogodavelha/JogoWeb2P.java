package jogodavelha;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.text.DefaultCaret;

public class JogoWeb2P extends javax.swing.JFrame {

    private DataOutputStream dos;
    private DataInputStream dis;
    private Socket s;
    private BufferedReader br;
    private InputStreamReader isr;
    private boolean rodar;
    String nomeJogador = "Jogador 1";
    String id;
    String xis ="X";
    String bola ="O";
    String ip;

    public JogoWeb2P(String nome) {
        initComponents();

        //ip = JOptionPane.showInputDialog(null, "Qual o ip a ser conectado?");
        id = JOptionPane.showInputDialog(null, "Qual vai ser a sua variável?");
        //showMessageDialog(null, id);
        this.nomeJogador = nome;
        rodar = true;

        try {
            s = new Socket("127.0.0.1", 5000);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não se conectou ao seridor");
        }
        Thread();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaUsuario = new javax.swing.JTextArea();
        btenviar = new javax.swing.JButton();

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
        btjogovoltar.setAlignmentY(0.0F);
        btjogovoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogovoltarActionPerformed(evt);
            }
        });

        btnovojogo.setText("Novo");
        btnovojogo.setAlignmentY(0.0F);
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
                    .addComponent(btjogovoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(btnovojogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlcontrolejogoLayout.setVerticalGroup(
            pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontrolejogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnovojogo)
                .addGap(18, 18, 18)
                .addComponent(btjogovoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat"));

        areaChat.setColumns(20);
        areaChat.setRows(5);
        jScrollPane1.setViewportView(areaChat);

        areaUsuario.setColumns(20);
        areaUsuario.setRows(5);
        areaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaUsuarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(areaUsuario);

        btenviar.setText("Enviar");
        btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenviarActionPerformed(evt);
            }
        });
        btenviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btenviarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btenviar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btenviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnljogadoresLayout = new javax.swing.GroupLayout(pnljogadores);
        pnljogadores.setLayout(pnljogadoresLayout);
        pnljogadoresLayout.setHorizontalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblmenujogadores))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addComponent(lbljogador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variaveljogador2))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addComponent(lbljogador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variaveljogador1)))
                        .addGap(68, 68, 68)
                        .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnljogadoresLayout.setVerticalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addComponent(lblmenujogadores)
                        .addGap(24, 24, 24)
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variaveljogador1)
                            .addComponent(lbljogador1))
                        .addGap(25, 25, 25)
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbljogador2)
                            .addComponent(variaveljogador2)))
                    .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try {
            s.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        MenuGeral mg = new MenuGeral();
        mg.setLocationRelativeTo(null);
        mg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btjogovoltarActionPerformed

    private void btjogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo1ActionPerformed
        btjogo1.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo1.setText(id);
        atualizarTela("b1,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo1ActionPerformed

    private void btjogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo2ActionPerformed
        btjogo2.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo2.setText(id);
        atualizarTela("b2,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo2ActionPerformed

    private void btjogo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo3ActionPerformed
        btjogo3.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo3.setText(id);
        atualizarTela("b3,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo3ActionPerformed

    private void btjogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo4ActionPerformed
        btjogo4.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo4.setText(id);
        atualizarTela("b4,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo4ActionPerformed

    private void btjogo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo5ActionPerformed
        btjogo5.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo5.setText(id);
        atualizarTela("b5,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo5ActionPerformed

    private void btjogo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo6ActionPerformed
        btjogo6.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo6.setText(id);
        atualizarTela("b6,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo6ActionPerformed

    private void btjogo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo7ActionPerformed
        btjogo7.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo7.setText(id);
        atualizarTela("b7,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo7ActionPerformed

    private void btjogo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo8ActionPerformed
        btjogo8.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo8.setText(id);
        atualizarTela("b8,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo8ActionPerformed

    private void btjogo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo9ActionPerformed
        btjogo9.setFont(new java.awt.Font("Tahoma", 0, 55));
        btjogo9.setText(id);
        atualizarTela("b9,", id);
        vitoria1p();
    }//GEN-LAST:event_btjogo9ActionPerformed

    private void btenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenviarActionPerformed
        enviarMensagem();
    }//GEN-LAST:event_btenviarActionPerformed

    private void btenviarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btenviarKeyReleased
        
    }//GEN-LAST:event_btenviarKeyReleased

    private void areaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaUsuarioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarMensagem();
        }
    }//GEN-LAST:event_areaUsuarioKeyReleased

    private void resetarJogo() {
        btjogo1.setText("");
        btjogo2.setText("");
        btjogo3.setText("");
        btjogo4.setText("");
        btjogo5.setText("");
        btjogo6.setText("");
        btjogo7.setText("");
        btjogo8.setText("");
        btjogo9.setText("");
    }

    private void vitoria1p() {
        //showMessageDialog(null, btjogo1.getText());
        if ((btjogo1.getText().equals(xis) && btjogo2.getText().equals(xis) && btjogo3.getText().equals(xis))
                || (btjogo4.getText().equals(xis) && btjogo5.getText().equals(xis) && btjogo6.getText().equals(xis))
                || (btjogo7.getText().equals(xis) && btjogo8.getText().equals(xis) && btjogo9.getText().equals(xis))
                || (btjogo1.getText().equals(xis) && btjogo4.getText().equals(xis) && btjogo7.getText().equals(xis))
                || (btjogo2.getText().equals(xis) && btjogo5.getText().equals(xis) && btjogo8.getText().equals(xis))
                || (btjogo3.getText().equals(xis) && btjogo6.getText().equals(xis) && btjogo9.getText().equals(xis))
                || (btjogo1.getText().equals(xis) && btjogo5.getText().equals(xis) && btjogo9.getText().equals(xis))
                || (btjogo7.getText().equals(xis) && btjogo5.getText().equals(xis) && btjogo3.getText().equals(xis))) {
            JOptionPane.showMessageDialog(null, nomeJogador + " venceu!");
            resetarJogo();
        } else {
            if ((btjogo1.getText().equals(bola) && btjogo2.getText().equals(bola) && btjogo3.getText().equals(bola))
                    || (btjogo4.getText().equals(bola) && btjogo5.getText().equals(bola) && btjogo6.getText().equals(bola))
                    || (btjogo7.getText().equals(bola) && btjogo8.getText().equals(bola) && btjogo9.getText().equals(bola))
                    || (btjogo1.getText().equals(bola) && btjogo4.getText().equals(bola) && btjogo7.getText().equals(bola))
                    || (btjogo2.getText().equals(bola) && btjogo5.getText().equals(bola) && btjogo8.getText().equals(bola))
                    || (btjogo3.getText().equals(bola) && btjogo6.getText().equals(bola) && btjogo9.getText().equals(bola))
                    || (btjogo1.getText().equals(bola) && btjogo5.getText().equals(bola) && btjogo9.getText().equals(bola))
                    || (btjogo7.getText().equals(bola) && btjogo5.getText().equals(bola) && btjogo3.getText().equals(bola))) {
                JOptionPane.showMessageDialog(null, nomeJogador + " venceu!");
                resetarJogo();
            } else {
                if (btjogo1.getText() != "" && btjogo2.getText() != "" && btjogo3.getText() != ""
                        && btjogo4.getText() != "" && btjogo5.getText() != "" && btjogo6.getText() != ""
                        && btjogo7.getText() != "" && btjogo8.getText() != "" && btjogo9.getText() != "") {
                    JOptionPane.showMessageDialog(null, "Empate!");
                    resetarJogo();
                }
            }
        }
    }

    private void Thread() {

        Thread t = new Thread(new Runnable() {

            String mensagem;

            @Override
            public void run() {
                try {
                    isr = new InputStreamReader(s.getInputStream());
                    br = new BufferedReader(isr);

                    while ((mensagem = br.readLine()) != null) {
                        if (mensagem.equals("b1,X") || mensagem.equals("b1,O")
                                || mensagem.equals("b2,X") || mensagem.equals("b2,O")
                                || mensagem.equals("b3,X") || mensagem.equals("b3,O")
                                || mensagem.equals("b4,X") || mensagem.equals("b4,O")
                                || mensagem.equals("b5,X") || mensagem.equals("b5,O")
                                || mensagem.equals("b6,X") || mensagem.equals("b6,O")
                                || mensagem.equals("b7,X") || mensagem.equals("b7,O")
                                || mensagem.equals("b8,X") || mensagem.equals("b8,O")
                                || mensagem.equals("b9,X") || mensagem.equals("b9,O")) {
                            switch (mensagem) {
                                case "b1,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo1.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo1.setText(teste[1]);
                                    break;
                                }
                                case "b1,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo1.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo1.setText(teste[1]);
                                    break;
                                }
                                case "b2,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo2.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo2.setText(teste[1]);
                                    break;
                                }
                                case "b2,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo2.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo2.setText(teste[1]);
                                    break;
                                }
                                case "b3,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo3.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo3.setText(teste[1]);
                                    break;
                                }
                                case "b3,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo3.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo3.setText(teste[1]);
                                    break;
                                }
                                case "b4,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo4.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo4.setText(teste[1]);
                                    break;
                                }
                                case "b4,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo4.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo4.setText(teste[1]);
                                    break;
                                }
                                case "b5,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo5.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo5.setText(teste[1]);
                                    break;
                                }
                                case "b5,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo5.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo5.setText(teste[1]);
                                    break;
                                }
                                case "b6,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo6.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo6.setText(teste[1]);
                                    break;
                                }
                                case "b6,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo6.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo6.setText(teste[1]);
                                    break;
                                }
                                case "b7,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo7.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo7.setText(teste[1]);
                                    break;
                                }
                                case "b7,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo7.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo7.setText(teste[1]);
                                    break;
                                }
                                case "b8,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo8.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo8.setText(teste[1]);
                                    break;
                                }
                                case "b8,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo8.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo8.setText(teste[1]);
                                    break;
                                }
                                case "b9,X": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo9.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo9.setText(teste[1]);
                                    break;
                                }
                                case "b9,O": {
                                    String[] teste = mensagem.split(Pattern.quote(","));
                                    btjogo9.setFont(new java.awt.Font("Tahoma", 0, 55));
                                    btjogo9.setText(teste[1]);
                                    break;
                                }
                            }

                        } else {
                            areaChat.setText(areaChat.getText() + mensagem + "\n");
                        }
                        if (!rodar) {
                            break;
                        }
                    }
                } catch (IOException ex) {
                    showMessageDialog(null, "Erro na Conexão", "", ERROR_MESSAGE);
                }
            }
        });
        t.start();
    }

    private void enviarMensagem() {
        String mensagem = nomeJogador + " disse: ";

        try {
            PrintStream ps = new PrintStream(s.getOutputStream());
            mensagem += areaUsuario.getText();
            //showMessageDialog(null, mensagem);
            ps.println(mensagem);
            ps.flush();

            areaUsuario.setText("");
            areaUsuario.requestFocus();
            DefaultCaret caret = (DefaultCaret) areaChat.getCaret();
            caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        } catch (IOException ex) {
            showMessageDialog(null, "Não conseguiu enviar a mensagem!", "", ERROR_MESSAGE);
        }
    }

    private void atualizarTela(String valor, String id) {
        String mensagem = "";
        try {
            PrintStream ps = new PrintStream(s.getOutputStream());
            mensagem += valor + id;
            //showMessageDialog(null, mensagem);
            ps.println(mensagem);
            ps.flush();

        } catch (Exception e) {
            showMessageDialog(null, "Deu Errado!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaChat;
    private javax.swing.JTextArea areaUsuario;
    private javax.swing.JButton btenviar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbljogador1;
    private javax.swing.JLabel lbljogador2;
    private javax.swing.JLabel lblmenujogadores;
    private javax.swing.JPanel pnlcontrolejogo;
    private javax.swing.JPanel pnljogadores;
    private javax.swing.JPanel pnljogo;
    private javax.swing.JLabel variaveljogador1;
    private javax.swing.JLabel variaveljogador2;
    // End of variables declaration//GEN-END:variables

}
