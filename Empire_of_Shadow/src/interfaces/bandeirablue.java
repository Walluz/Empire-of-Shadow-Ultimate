/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class bandeirablue extends JPanel {

    public bandeirablue() {
        initComponents();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }

    private void pintar(Graphics g) {
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/bandeiras/blue.png"));
        Image imagem = ic.getImage();
        g.drawImage(imagem, 0, 0, this);
    }
    
     private void initComponents() {
        setPreferredSize(new java.awt.Dimension(236, 268));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
        );
    }
}
