/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import game.tabuleiro.Casa;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Walluz
 */
public class TelaCasa extends JPanel{
    private Casa casa;
    
    public TelaCasa() {
        super();
        Dimension tam = new Dimension();
        tam.setSize(100, 100);
        setPreferredSize(tam);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }
    
    private void pintar(Graphics g) {
        if (casa != null) {
            g.drawImage(casa.getImagem(), 0, 0, this);
            
             if(casa.getPower()!= null){
                g.drawImage(casa.getPower().getImagem(), 0, 0, this);
            }
            if (casa.getPeca() != null) {
                g.drawImage(casa.getPeca().getImagem(), 0, 0, this);
            }
        }
    }

    public void setCasa(Casa c) {
        casa = c;
    }
    
    public Casa getCasa(){
        return casa;
    }
}
