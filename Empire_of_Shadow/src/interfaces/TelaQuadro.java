/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.controladores.Game;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class TelaQuadro extends JPanel {

    private final Image zumbi;
    private final Image vampiro;
    private final Image lycan;
    private final Image necro;

    public TelaQuadro() {
        super();
        setPreferredSize(new Dimension(236, 268));

        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/quadro/VAMPIRO.jpg"));
        vampiro = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/quadro/NECROMANCER.jpg"));
        necro = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/quadro/LYCAN.jpg"));
        lycan = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/quadro/ZUMBI.jpg"));
        zumbi = ic.getImage();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }

    private void pintar(Graphics g) {
        this.setVisible(false);
        if (Game.getGame().getPecaclicada() != null) {
            this.setVisible(true);
            if (Game.getGame().getPecaclicada().getTipo() == 0) {
                g.drawImage(lycan, 0, 0, this);
            }

            if (Game.getGame().getPecaclicada().getTipo() == 1) {
                g.drawImage(vampiro, 0, 0, this);
            }

            if (Game.getGame().getPecaclicada().getTipo() == 2) {
                g.drawImage(necro, 0, 0, this);
            }

            if (Game.getGame().getPecaclicada().getTipo() == 3) {
                g.drawImage(zumbi, 0, 0, this);
            }
        }
    }
}
