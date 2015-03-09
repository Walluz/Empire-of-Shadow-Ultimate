/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.controladores.Game;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class TelaJogo extends JPanel {

    public TelaJogo() {
        initComponents();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }

    private void pintar(Graphics g) {
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/fundos/cenario.jpg"));
        Image imagem;
        imagem = ic.getImage();
        g.drawImage(imagem, 0, 0, this);
    }
    
    private void initComponents() {

        tabuleiro = new TelaTabuleiro();
        quadro = new TelaQuadro();
        nomepeca = new javax.swing.JTextField();
        ataquebar = new javax.swing.JProgressBar();
        defesabar = new javax.swing.JProgressBar();
        vidabar = new javax.swing.JProgressBar();
        ataque = new javax.swing.JTextField();
        defesa = new javax.swing.JTextField();
        vida = new javax.swing.JTextField();
        roleta = new TelaRoleta();
        jogadorvez = new javax.swing.JTextField();
        botaodrenar = new javax.swing.JButton();
        botaomover = new javax.swing.JButton();
        botaoatacar = new javax.swing.JButton();
        botaozumbi = new javax.swing.JButton();
        botaoonoff = new javax.swing.JToggleButton();
        powerup = new javax.swing.JTextField();
        powertipo = new javax.swing.JTextField();
        botaojogar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1280, 750));

        tabuleiro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        quadro.setBackground(new java.awt.Color(255, 255, 255));
        quadro.setPreferredSize(new java.awt.Dimension(236, 268));
        quadro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quadroMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                quadroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout quadroLayout = new javax.swing.GroupLayout(quadro);
        quadro.setLayout(quadroLayout);
        quadroLayout.setHorizontalGroup(
                quadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        quadroLayout.setVerticalGroup(
                quadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 268, Short.MAX_VALUE)
        );

        nomepeca.setEditable(false);
        nomepeca.setBackground(new java.awt.Color(204, 204, 204));
        nomepeca.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        nomepeca.setForeground(new java.awt.Color(51, 0, 0));
        nomepeca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomepeca.setVisible(false);

        ataquebar.setForeground(new java.awt.Color(0, 255, 0));
        ataquebar.setMaximum(100);
        ataquebar.setVisible(false);

        defesabar.setForeground(new java.awt.Color(0, 255, 0));
        defesabar.setMaximum(100);
        defesabar.setVisible(false);

        vidabar.setForeground(new java.awt.Color(0, 255, 0));
        vidabar.setMaximum(100);
        vidabar.setVisible(false);

        ataque.setEditable(false);
        ataque.setBackground(new java.awt.Color(37, 33, 33));
        ataque.setForeground(new java.awt.Color(255, 255, 255));
        ataque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ataque.setText("Ataque");
        ataque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ataque.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ataque.setVisible(false);

        defesa.setEditable(false);
        defesa.setBackground(new java.awt.Color(37, 33, 33));
        defesa.setForeground(new java.awt.Color(255, 255, 255));
        defesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defesa.setText("Defesa");
        defesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        defesa.setVisible(false);

        vida.setEditable(false);
        vida.setBackground(new java.awt.Color(32, 29, 29));
        vida.setForeground(new java.awt.Color(255, 255, 255));
        vida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vida.setText("Vida");
        vida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vida.setVisible(false);

        roleta.setBackground(new java.awt.Color(255, 255, 255));
        Cenario.getCenario().setRoleta(roleta);

        javax.swing.GroupLayout roletaLayout = new javax.swing.GroupLayout(roleta);
        roleta.setLayout(roletaLayout);
        roletaLayout.setHorizontalGroup(
                roletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 164, Short.MAX_VALUE)
        );
        roletaLayout.setVerticalGroup(
                roletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 196, Short.MAX_VALUE)
        );

        jogadorvez.setEditable(false);
        jogadorvez.setBackground(new java.awt.Color(204, 204, 204));
        jogadorvez.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        jogadorvez.setForeground(new java.awt.Color(51, 0, 0));
        jogadorvez.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jogadorvez.setText(Game.getGame().getJogadores()[Game.getGame().getVez()].getNome());
        Cenario.getCenario().setJogadornome(jogadorvez);

        botaodrenar.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        botaodrenar.setForeground(new java.awt.Color(102, 0, 0));
        botaodrenar.setText("Drenar");
        botaodrenar.setVisible(false);
        botaodrenar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaodrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaodrenarActionPerformed(evt);
            }
        });

        botaomover.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        botaomover.setForeground(new java.awt.Color(102, 0, 0));
        botaomover.setText("Mover");
        botaomover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaomover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaomoverActionPerformed(evt);
            }
        });

        botaoatacar.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        botaoatacar.setForeground(new java.awt.Color(102, 0, 0));
        botaoatacar.setText("Atacar");
        botaoatacar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoatacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoatacarActionPerformed(evt);
            }
        });

        botaozumbi.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        botaozumbi.setForeground(new java.awt.Color(102, 0, 0));
        botaozumbi.setText("Zumbi");
        botaozumbi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaozumbi.setVisible(false);
        botaozumbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaozumbiActionPerformed(evt);
            }
        });

        new Thread(new Runnable() {

            @Override
            public void run() {     
                try {
                    while (Game.getGame().getFimjogo() == false) {
                    if (Game.getGame().getPecaselecionada() != null) {
                        if (Game.getGame().getPecaselecionada().getTipo() == 2) {
                            botaozumbi.setVisible(true);
                        }else{
                            botaozumbi.setVisible(false);
                        }
                    }else{
                        botaozumbi.setVisible(false);
                    }
                     Thread.sleep(1000);
                }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (Game.getGame().getFimjogo() == false) {
                    if (Game.getGame().getPecaselecionada() != null) {
                        if (Game.getGame().getPecaselecionada().getTipo() == 1) {
                            botaodrenar.setVisible(true);
                        }else{
                            botaodrenar.setVisible(false);
                        }
                    }else{
                         botaodrenar.setVisible(false);
                    }
                      Thread.sleep(1000);
                }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (Game.getGame().getFimjogo() == false) {
                    if (Game.getGame().getPecaclicada() == null) {
                        quadro.setVisible(false);
                    }else{
                         quadro.setVisible(true);
                    }
                      Thread.sleep(1000);
                }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        botaoonoff.setText("OFF");
        botaoonoff.setSelected(false);
        botaoonoff.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botaoonoff.setVisible(false);

        powerup.setEditable(false);
        powerup.setBackground(new java.awt.Color(32, 30, 30));
        powerup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powerup.setForeground(new java.awt.Color(255, 255, 255));
        powerup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        powerup.setText("Power UP:");
        powerup.setVisible(false);
        powerup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        powertipo.setEditable(false);
        powertipo.setBackground(new java.awt.Color(30, 29, 29));
        powertipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powertipo.setForeground(new java.awt.Color(255, 255, 255));
        powertipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        powertipo.setVisible(false);
        powertipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cenario.getCenario().setPainel(nomepeca, ataque, defesa, vida, ataquebar, defesabar, vidabar, powerup, powertipo, botaoonoff, quadro);

        botaojogar.setFont(new java.awt.Font("Vivaldi", 3, 34)); // NOI18N
        botaojogar.setForeground(new java.awt.Color(102, 0, 0));
        botaojogar.setText("Jogar");
        botaojogar.setMaximumSize(new java.awt.Dimension(103, 49));
        botaojogar.setMinimumSize(new java.awt.Dimension(103, 49));
        botaojogar.setPreferredSize(new java.awt.Dimension(103, 49));
        botaojogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaojogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaojogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomepeca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(powerup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(powertipo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(botaoonoff, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(quadro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ataquebar, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                                        .addComponent(defesabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(vidabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ataque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(defesa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                        .addComponent(tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(botaozumbi, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addComponent(botaoatacar, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addComponent(botaomover, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addComponent(botaodrenar, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                .addComponent(jogadorvez, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(roleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(botaojogar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(roleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jogadorvez, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(botaodrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaomover, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoatacar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaozumbi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(botaojogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(quadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomepeca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(ataque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ataquebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(defesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(defesabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vidabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(powerup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(powertipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(botaoonoff, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>  

    private void quadroMouseEntered(java.awt.event.MouseEvent evt) {
        Cenario.getCenario().ativarPainel();
    }

    private void botaodrenarActionPerformed(java.awt.event.ActionEvent evt) {
        botaodrenar.setSelected(true);
        botaomover.setSelected(false);
        botaoatacar.setSelected(false);
        botaozumbi.setSelected(false);
        Game.getGame().verificarDispoataque();
    }

    private void botaomoverActionPerformed(java.awt.event.ActionEvent evt) {
        Game.getGame().delDispo();
        botaomover.setSelected(true);
        botaoatacar.setSelected(false);
        botaozumbi.setSelected(false);
        botaodrenar.setSelected(false);
        Game.getGame().verificarDispomove();
    }

    private void botaoatacarActionPerformed(java.awt.event.ActionEvent evt) {
        botaoatacar.setSelected(true);
        botaomover.setSelected(false);
        botaozumbi.setSelected(false);
        botaodrenar.setSelected(false);
        Game.getGame().verificarDispoataque();
    }

    private void botaozumbiActionPerformed(java.awt.event.ActionEvent evt) {
        botaozumbi.setSelected(true);
        botaodrenar.setSelected(false);
        botaoatacar.setSelected(false);
        botaomover.setSelected(false);
        Game.getGame().verificarDispozumbi();
    }

    private void botaojogarActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (botaoatacar.isSelected()) {
            Game.getGame().acaoAtacar();
        }

        if (botaodrenar.isSelected()) {
            Game.getGame().acaoDrenar();
        }

        if (botaomover.isSelected()) {
            Game.getGame().acaoMover();
        }

        if (botaozumbi.isSelected()) {
            Game.getGame().acaoControlarZumbi();
        }
    }

    private void quadroMouseExited(java.awt.event.MouseEvent evt) {
        Cenario.getCenario().desativarPainel();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaodrenar;
    private javax.swing.JButton botaomover;
    private javax.swing.JButton botaoatacar;
    private javax.swing.JButton botaozumbi;
    private javax.swing.JButton botaojogar;
    private TelaQuadro quadro;
    private TelaRoleta roleta;
    private javax.swing.JProgressBar ataquebar;
    private javax.swing.JProgressBar defesabar;
    private javax.swing.JProgressBar vidabar;
    private javax.swing.JTextField nomepeca;
    private javax.swing.JTextField ataque;
    private javax.swing.JTextField defesa;
    private javax.swing.JTextField vida;
    private javax.swing.JTextField jogadorvez;
    private javax.swing.JTextField powerup;
    private javax.swing.JTextField powertipo;
    private javax.swing.JToggleButton botaoonoff;
    private TelaTabuleiro tabuleiro;
}
