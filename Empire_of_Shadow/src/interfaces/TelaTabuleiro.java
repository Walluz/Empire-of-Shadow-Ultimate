/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.controladores.Game;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class TelaTabuleiro extends JPanel {

    public TelaTabuleiro() {
        initComponents();
        setPreferredSize(new java.awt.Dimension(723, 710));

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }

    private void pintar(Graphics g) {
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/tabuleiro/borda.jpg"));
        Image imagem;
        imagem = ic.getImage();
        g.drawImage(imagem, 0, 0, this);
    }

    private void initComponents() {

        telaCasa1 = new TelaCasa();
        telaCasa2 = new TelaCasa();
        telaCasa3 = new TelaCasa();
        telaCasa4 = new TelaCasa();
        telaCasa5 = new TelaCasa();
        telaCasa6 = new TelaCasa();
        telaCasa7 = new TelaCasa();
        telaCasa8 = new TelaCasa();
        telaCasa9 = new TelaCasa();
        telaCasa10 = new TelaCasa();
        telaCasa11 = new TelaCasa();
        telaCasa12 = new TelaCasa();
        telaCasa13 = new TelaCasa();
        telaCasa14 = new TelaCasa();
        telaCasa15 = new TelaCasa();
        telaCasa16 = new TelaCasa();
        telaCasa17 = new TelaCasa();
        telaCasa18 = new TelaCasa();
        telaCasa19 = new TelaCasa();
        telaCasa20 = new TelaCasa();
        telaCasa21 = new TelaCasa();
        telaCasa22 = new TelaCasa();
        telaCasa23 = new TelaCasa();
        telaCasa24 = new TelaCasa();
        telaCasa25 = new TelaCasa();
        telaCasa26 = new TelaCasa();
        telaCasa27 = new TelaCasa();
        telaCasa28 = new TelaCasa();
        telaCasa29 = new TelaCasa();
        telaCasa30 = new TelaCasa();
        telaCasa31 = new TelaCasa();
        telaCasa32 = new TelaCasa();
        telaCasa33 = new TelaCasa();
        telaCasa34 = new TelaCasa();
        telaCasa35 = new TelaCasa();
        telaCasa36 = new TelaCasa();

        telaCasa1.setCasa(Game.getGame().getTabu().getCasas()[0]);
        telaCasa2.setCasa(Game.getGame().getTabu().getCasas()[1]);
        telaCasa3.setCasa(Game.getGame().getTabu().getCasas()[2]);
        telaCasa4.setCasa(Game.getGame().getTabu().getCasas()[3]);
        telaCasa5.setCasa(Game.getGame().getTabu().getCasas()[4]);
        telaCasa6.setCasa(Game.getGame().getTabu().getCasas()[5]);
        telaCasa7.setCasa(Game.getGame().getTabu().getCasas()[6]);
        telaCasa8.setCasa(Game.getGame().getTabu().getCasas()[7]);
        telaCasa9.setCasa(Game.getGame().getTabu().getCasas()[8]);
        telaCasa10.setCasa(Game.getGame().getTabu().getCasas()[9]);
        telaCasa11.setCasa(Game.getGame().getTabu().getCasas()[10]);
        telaCasa12.setCasa(Game.getGame().getTabu().getCasas()[11]);
        telaCasa13.setCasa(Game.getGame().getTabu().getCasas()[12]);
        telaCasa14.setCasa(Game.getGame().getTabu().getCasas()[13]);
        telaCasa15.setCasa(Game.getGame().getTabu().getCasas()[14]);
        telaCasa16.setCasa(Game.getGame().getTabu().getCasas()[15]);
        telaCasa17.setCasa(Game.getGame().getTabu().getCasas()[16]);
        telaCasa18.setCasa(Game.getGame().getTabu().getCasas()[17]);
        telaCasa19.setCasa(Game.getGame().getTabu().getCasas()[18]);
        telaCasa20.setCasa(Game.getGame().getTabu().getCasas()[19]);
        telaCasa21.setCasa(Game.getGame().getTabu().getCasas()[20]);
        telaCasa22.setCasa(Game.getGame().getTabu().getCasas()[21]);
        telaCasa23.setCasa(Game.getGame().getTabu().getCasas()[22]);
        telaCasa24.setCasa(Game.getGame().getTabu().getCasas()[23]);
        telaCasa25.setCasa(Game.getGame().getTabu().getCasas()[24]);
        telaCasa26.setCasa(Game.getGame().getTabu().getCasas()[25]);
        telaCasa27.setCasa(Game.getGame().getTabu().getCasas()[26]);
        telaCasa28.setCasa(Game.getGame().getTabu().getCasas()[27]);
        telaCasa29.setCasa(Game.getGame().getTabu().getCasas()[28]);
        telaCasa30.setCasa(Game.getGame().getTabu().getCasas()[29]);
        telaCasa31.setCasa(Game.getGame().getTabu().getCasas()[30]);
        telaCasa32.setCasa(Game.getGame().getTabu().getCasas()[31]);
        telaCasa33.setCasa(Game.getGame().getTabu().getCasas()[32]);
        telaCasa34.setCasa(Game.getGame().getTabu().getCasas()[33]);
        telaCasa35.setCasa(Game.getGame().getTabu().getCasas()[34]);
        telaCasa36.setCasa(Game.getGame().getTabu().getCasas()[35]);

        Cenario.getCenario().setTelas(telaCasa1);
        Cenario.getCenario().setTelas(telaCasa2);
        Cenario.getCenario().setTelas(telaCasa3);
        Cenario.getCenario().setTelas(telaCasa4);
        Cenario.getCenario().setTelas(telaCasa5);
        Cenario.getCenario().setTelas(telaCasa6);
        Cenario.getCenario().setTelas(telaCasa7);
        Cenario.getCenario().setTelas(telaCasa8);
        Cenario.getCenario().setTelas(telaCasa9);
        Cenario.getCenario().setTelas(telaCasa10);
        Cenario.getCenario().setTelas(telaCasa11);
        Cenario.getCenario().setTelas(telaCasa12);
        Cenario.getCenario().setTelas(telaCasa13);
        Cenario.getCenario().setTelas(telaCasa14);
        Cenario.getCenario().setTelas(telaCasa15);
        Cenario.getCenario().setTelas(telaCasa16);
        Cenario.getCenario().setTelas(telaCasa17);
        Cenario.getCenario().setTelas(telaCasa18);
        Cenario.getCenario().setTelas(telaCasa19);
        Cenario.getCenario().setTelas(telaCasa20);
        Cenario.getCenario().setTelas(telaCasa21);
        Cenario.getCenario().setTelas(telaCasa22);
        Cenario.getCenario().setTelas(telaCasa23);
        Cenario.getCenario().setTelas(telaCasa24);
        Cenario.getCenario().setTelas(telaCasa25);
        Cenario.getCenario().setTelas(telaCasa26);
        Cenario.getCenario().setTelas(telaCasa27);
        Cenario.getCenario().setTelas(telaCasa28);
        Cenario.getCenario().setTelas(telaCasa29);
        Cenario.getCenario().setTelas(telaCasa30);
        Cenario.getCenario().setTelas(telaCasa31);
        Cenario.getCenario().setTelas(telaCasa32);
        Cenario.getCenario().setTelas(telaCasa33);
        Cenario.getCenario().setTelas(telaCasa34);
        Cenario.getCenario().setTelas(telaCasa35);
        Cenario.getCenario().setTelas(telaCasa36);

        telaCasa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa1Layout = new javax.swing.GroupLayout(telaCasa1);
        telaCasa1.setLayout(telaCasa1Layout);
        telaCasa1Layout.setHorizontalGroup(
                telaCasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa1Layout.setVerticalGroup(
                telaCasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa2Layout = new javax.swing.GroupLayout(telaCasa2);
        telaCasa2.setLayout(telaCasa2Layout);
        telaCasa2Layout.setHorizontalGroup(
                telaCasa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa2Layout.setVerticalGroup(
                telaCasa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa3Layout = new javax.swing.GroupLayout(telaCasa3);
        telaCasa3.setLayout(telaCasa3Layout);
        telaCasa3Layout.setHorizontalGroup(
                telaCasa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa3Layout.setVerticalGroup(
                telaCasa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa4Layout = new javax.swing.GroupLayout(telaCasa4);
        telaCasa4.setLayout(telaCasa4Layout);
        telaCasa4Layout.setHorizontalGroup(
                telaCasa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa4Layout.setVerticalGroup(
                telaCasa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa5Layout = new javax.swing.GroupLayout(telaCasa5);
        telaCasa5.setLayout(telaCasa5Layout);
        telaCasa5Layout.setHorizontalGroup(
                telaCasa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa5Layout.setVerticalGroup(
                telaCasa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa6Layout = new javax.swing.GroupLayout(telaCasa6);
        telaCasa6.setLayout(telaCasa6Layout);
        telaCasa6Layout.setHorizontalGroup(
                telaCasa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa6Layout.setVerticalGroup(
                telaCasa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa7Layout = new javax.swing.GroupLayout(telaCasa7);
        telaCasa7.setLayout(telaCasa7Layout);
        telaCasa7Layout.setHorizontalGroup(
                telaCasa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa7Layout.setVerticalGroup(
                telaCasa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa8Layout = new javax.swing.GroupLayout(telaCasa8);
        telaCasa8.setLayout(telaCasa8Layout);
        telaCasa8Layout.setHorizontalGroup(
                telaCasa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa8Layout.setVerticalGroup(
                telaCasa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa9Layout = new javax.swing.GroupLayout(telaCasa9);
        telaCasa9.setLayout(telaCasa9Layout);
        telaCasa9Layout.setHorizontalGroup(
                telaCasa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa9Layout.setVerticalGroup(
                telaCasa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa10Layout = new javax.swing.GroupLayout(telaCasa10);
        telaCasa10.setLayout(telaCasa10Layout);
        telaCasa10Layout.setHorizontalGroup(
                telaCasa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa10Layout.setVerticalGroup(
                telaCasa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa11Layout = new javax.swing.GroupLayout(telaCasa11);
        telaCasa11.setLayout(telaCasa11Layout);
        telaCasa11Layout.setHorizontalGroup(
                telaCasa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa11Layout.setVerticalGroup(
                telaCasa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa12Layout = new javax.swing.GroupLayout(telaCasa12);
        telaCasa12.setLayout(telaCasa12Layout);
        telaCasa12Layout.setHorizontalGroup(
                telaCasa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa12Layout.setVerticalGroup(
                telaCasa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa13Layout = new javax.swing.GroupLayout(telaCasa13);
        telaCasa13.setLayout(telaCasa13Layout);
        telaCasa13Layout.setHorizontalGroup(
                telaCasa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa13Layout.setVerticalGroup(
                telaCasa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa14Layout = new javax.swing.GroupLayout(telaCasa14);
        telaCasa14.setLayout(telaCasa14Layout);
        telaCasa14Layout.setHorizontalGroup(
                telaCasa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa14Layout.setVerticalGroup(
                telaCasa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa15Layout = new javax.swing.GroupLayout(telaCasa15);
        telaCasa15.setLayout(telaCasa15Layout);
        telaCasa15Layout.setHorizontalGroup(
                telaCasa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa15Layout.setVerticalGroup(
                telaCasa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa16Layout = new javax.swing.GroupLayout(telaCasa16);
        telaCasa16.setLayout(telaCasa16Layout);
        telaCasa16Layout.setHorizontalGroup(
                telaCasa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa16Layout.setVerticalGroup(
                telaCasa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa17Layout = new javax.swing.GroupLayout(telaCasa17);
        telaCasa17.setLayout(telaCasa17Layout);
        telaCasa17Layout.setHorizontalGroup(
                telaCasa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa17Layout.setVerticalGroup(
                telaCasa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa18Layout = new javax.swing.GroupLayout(telaCasa18);
        telaCasa18.setLayout(telaCasa18Layout);
        telaCasa18Layout.setHorizontalGroup(
                telaCasa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa18Layout.setVerticalGroup(
                telaCasa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa19Layout = new javax.swing.GroupLayout(telaCasa19);
        telaCasa19.setLayout(telaCasa19Layout);
        telaCasa19Layout.setHorizontalGroup(
                telaCasa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa19Layout.setVerticalGroup(
                telaCasa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa20Layout = new javax.swing.GroupLayout(telaCasa20);
        telaCasa20.setLayout(telaCasa20Layout);
        telaCasa20Layout.setHorizontalGroup(
                telaCasa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa20Layout.setVerticalGroup(
                telaCasa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa21Layout = new javax.swing.GroupLayout(telaCasa21);
        telaCasa21.setLayout(telaCasa21Layout);
        telaCasa21Layout.setHorizontalGroup(
                telaCasa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa21Layout.setVerticalGroup(
                telaCasa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa22Layout = new javax.swing.GroupLayout(telaCasa22);
        telaCasa22.setLayout(telaCasa22Layout);
        telaCasa22Layout.setHorizontalGroup(
                telaCasa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa22Layout.setVerticalGroup(
                telaCasa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa23Layout = new javax.swing.GroupLayout(telaCasa23);
        telaCasa23.setLayout(telaCasa23Layout);
        telaCasa23Layout.setHorizontalGroup(
                telaCasa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa23Layout.setVerticalGroup(
                telaCasa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa24Layout = new javax.swing.GroupLayout(telaCasa24);
        telaCasa24.setLayout(telaCasa24Layout);
        telaCasa24Layout.setHorizontalGroup(
                telaCasa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa24Layout.setVerticalGroup(
                telaCasa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa25Layout = new javax.swing.GroupLayout(telaCasa25);
        telaCasa25.setLayout(telaCasa25Layout);
        telaCasa25Layout.setHorizontalGroup(
                telaCasa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa25Layout.setVerticalGroup(
                telaCasa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa26Layout = new javax.swing.GroupLayout(telaCasa26);
        telaCasa26.setLayout(telaCasa26Layout);
        telaCasa26Layout.setHorizontalGroup(
                telaCasa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa26Layout.setVerticalGroup(
                telaCasa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa27Layout = new javax.swing.GroupLayout(telaCasa27);
        telaCasa27.setLayout(telaCasa27Layout);
        telaCasa27Layout.setHorizontalGroup(
                telaCasa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa27Layout.setVerticalGroup(
                telaCasa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa28Layout = new javax.swing.GroupLayout(telaCasa28);
        telaCasa28.setLayout(telaCasa28Layout);
        telaCasa28Layout.setHorizontalGroup(
                telaCasa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa28Layout.setVerticalGroup(
                telaCasa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa29Layout = new javax.swing.GroupLayout(telaCasa29);
        telaCasa29.setLayout(telaCasa29Layout);
        telaCasa29Layout.setHorizontalGroup(
                telaCasa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa29Layout.setVerticalGroup(
                telaCasa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa30Layout = new javax.swing.GroupLayout(telaCasa30);
        telaCasa30.setLayout(telaCasa30Layout);
        telaCasa30Layout.setHorizontalGroup(
                telaCasa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa30Layout.setVerticalGroup(
                telaCasa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa31Layout = new javax.swing.GroupLayout(telaCasa31);
        telaCasa31.setLayout(telaCasa31Layout);
        telaCasa31Layout.setHorizontalGroup(
                telaCasa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa31Layout.setVerticalGroup(
                telaCasa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa32Layout = new javax.swing.GroupLayout(telaCasa32);
        telaCasa32.setLayout(telaCasa32Layout);
        telaCasa32Layout.setHorizontalGroup(
                telaCasa32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa32Layout.setVerticalGroup(
                telaCasa32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa33Layout = new javax.swing.GroupLayout(telaCasa33);
        telaCasa33.setLayout(telaCasa33Layout);
        telaCasa33Layout.setHorizontalGroup(
                telaCasa33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa33Layout.setVerticalGroup(
                telaCasa33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa34Layout = new javax.swing.GroupLayout(telaCasa34);
        telaCasa34.setLayout(telaCasa34Layout);
        telaCasa34Layout.setHorizontalGroup(
                telaCasa34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa34Layout.setVerticalGroup(
                telaCasa34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa35Layout = new javax.swing.GroupLayout(telaCasa35);
        telaCasa35.setLayout(telaCasa35Layout);
        telaCasa35Layout.setHorizontalGroup(
                telaCasa35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa35Layout.setVerticalGroup(
                telaCasa35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        telaCasa36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaCasa36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaCasa36Layout = new javax.swing.GroupLayout(telaCasa36);
        telaCasa36.setLayout(telaCasa36Layout);
        telaCasa36Layout.setHorizontalGroup(
                telaCasa36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );
        telaCasa36Layout.setVerticalGroup(
                telaCasa36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telaCasa36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telaCasa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telaCasa6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(telaCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(telaCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telaCasa32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telaCasa26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telaCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telaCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telaCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(telaCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telaCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telaCasa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telaCasa31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
        );
    }// </editor-fold>                        

    private void telaCasa1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa1.getCasa());
        if (telaCasa1.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa1.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa1.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa2.getCasa());
        if (telaCasa2.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa2.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa2.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa3MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa3.getCasa());
        if (telaCasa3.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa3.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa3.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa4MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa4.getCasa());
        if (telaCasa4.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa4.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa4.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa5MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa5.getCasa());
        if (telaCasa5.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa5.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa5.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa6MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa6.getCasa());
        if (telaCasa6.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa6.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa6.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa7MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa7.getCasa());
        if (telaCasa7.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa7.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa7.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa8MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa8.getCasa());
        if (telaCasa8.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa8.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa8.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa9MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa9.getCasa());
        if (telaCasa9.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa9.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa9.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa10MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa10.getCasa());
        if (telaCasa10.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa10.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa10.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa11MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa11.getCasa());
        if (telaCasa11.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa11.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa11.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa12MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa12.getCasa());
        if (telaCasa12.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa12.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa12.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa13MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa13.getCasa());
        if (telaCasa13.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa13.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa13.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa14MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa14.getCasa());
        if (telaCasa14.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa14.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa14.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa15MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa15.getCasa());
        if (telaCasa15.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa15.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa15.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa16MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa16.getCasa());
        if (telaCasa16.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa16.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa16.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa17MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa17.getCasa());
        if (telaCasa17.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa17.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa17.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa18MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa18.getCasa());
        if (telaCasa18.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa18.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa18.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa19MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa19.getCasa());
        if (telaCasa19.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa19.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa19.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa20MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa20.getCasa());
        if (telaCasa20.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa20.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa20.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa21MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa21.getCasa());
        if (telaCasa21.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa21.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa21.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa22MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa22.getCasa());
        if (telaCasa22.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa22.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa22.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa23MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa23.getCasa());
        if (telaCasa23.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa23.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa23.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa24MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa24.getCasa());
        if (telaCasa24.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa24.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa24.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa25MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa25.getCasa());
        if (telaCasa25.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa25.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa25.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa26MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa26.getCasa());
        if (telaCasa26.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa26.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa26.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa27MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa27.getCasa());
        if (telaCasa27.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa27.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa27.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa28MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa28.getCasa());
        if (telaCasa28.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa28.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa28.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa29MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa29.getCasa());
        if (telaCasa29.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa29.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa29.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa30MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa30.getCasa());
        if (telaCasa30.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa30.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa30.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa31MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa31.getCasa());
        if (telaCasa31.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa31.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa31.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa32MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa32.getCasa());
        if (telaCasa32.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa32.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa32.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa33MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa33.getCasa());
        if (telaCasa33.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa33.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa33.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa34MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa34.getCasa());
        if (telaCasa34.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa34.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa34.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa35MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa35.getCasa());
        if (telaCasa35.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa35.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa35.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    private void telaCasa36MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Game.getGame().setPecaclicada(null);
        Game.getGame().selecionarCasa(telaCasa36.getCasa());
        if (telaCasa36.getCasa().getPeca() != null) {
            Game.getGame().selecionarPeca(telaCasa36.getCasa().getPeca());
            Game.getGame().setPecaclicada(telaCasa36.getCasa().getPeca());
        }
        Cenario.getCenario().repintarQuadro();
    }

    // Variables declaration - do not modify                     
    private TelaCasa telaCasa1;
    private TelaCasa telaCasa10;
    private TelaCasa telaCasa11;
    private TelaCasa telaCasa12;
    private TelaCasa telaCasa13;
    private TelaCasa telaCasa14;
    private TelaCasa telaCasa15;
    private TelaCasa telaCasa16;
    private TelaCasa telaCasa17;
    private TelaCasa telaCasa18;
    private TelaCasa telaCasa19;
    private TelaCasa telaCasa2;
    private TelaCasa telaCasa20;
    private TelaCasa telaCasa21;
    private TelaCasa telaCasa22;
    private TelaCasa telaCasa23;
    private TelaCasa telaCasa24;
    private TelaCasa telaCasa25;
    private TelaCasa telaCasa26;
    private TelaCasa telaCasa27;
    private TelaCasa telaCasa28;
    private TelaCasa telaCasa29;
    private TelaCasa telaCasa3;
    private TelaCasa telaCasa30;
    private TelaCasa telaCasa31;
    private TelaCasa telaCasa32;
    private TelaCasa telaCasa33;
    private TelaCasa telaCasa34;
    private TelaCasa telaCasa35;
    private TelaCasa telaCasa36;
    private TelaCasa telaCasa4;
    private TelaCasa telaCasa5;
    private TelaCasa telaCasa6;
    private TelaCasa telaCasa7;
    private TelaCasa telaCasa8;
    private TelaCasa telaCasa9;
}
