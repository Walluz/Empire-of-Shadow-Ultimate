/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.ranking.*;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class ranking1 extends JPanel {

    public ranking1() {
        initComponents();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }
    
    private void pintar(Graphics g){
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/fundos/cenario.jpg"));
        Image Imagem = ic.getImage();
        g.drawImage(Imagem, 0, 0, this);
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 750));
        setMinimumSize(new java.awt.Dimension(1280, 750));
        setPreferredSize(new java.awt.Dimension(1280, 750));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ranking");
        jLabel1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel2.setText("Posição");
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel3.setText("Nome");
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel4.setText("Vitorias");
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jTextPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jTextPane3.setMinimumSize(new java.awt.Dimension(6, 66));
        jTextPane3.setPreferredSize(new java.awt.Dimension(6, 66));
        jTextPane3.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextPane3);

        ArrayList al = game.ranking.Ranking.getInstance().listar();
        Object[] o = al.toArray();
        for (int x = 0; x < o.length; x++) {
            Tier t = (Tier) o[x];
            jTextPane1.setText("" + (x + 1) + "\n");
            jTextPane2.setText(""+t.getNome()+"\n");
            jTextPane3.setText(""+t.getVitoria()+"\n");
        }
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(393, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(218, 218, 218))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addGap(144, 144, 144)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(147, 147, 147))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(64, 64, 64)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jScrollPane3)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel1)
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane3))))
                        .addGap(372, 372, 372))
        );
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Cenario.getCenario().menu();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
}
