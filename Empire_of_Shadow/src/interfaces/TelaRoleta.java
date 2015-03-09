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
public class TelaRoleta extends JPanel{
    public TelaRoleta(){
        super();
        setPreferredSize(new Dimension(164, 196));
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintar(g);
    }
    
    private void pintar(Graphics g){
       Image imagem;
       ImageIcon ic;
       if(Game.getGame().getTipopeca()==0){
           ic = new ImageIcon(getClass().getClassLoader().getResource("resource/roleta/WOLF.png"));
           imagem = ic.getImage();
           g.drawImage(imagem, 0, 0, this);
       }
       
       if(Game.getGame().getTipopeca()==1){
           ic = new ImageIcon(getClass().getClassLoader().getResource("resource/roleta/VAMPIRO.png"));
           imagem = ic.getImage();
           g.drawImage(imagem, 0, 0, this);
       }
       
       if(Game.getGame().getTipopeca()==2){
           ic = new ImageIcon(getClass().getClassLoader().getResource("resource/roleta/NECROMANCER.png"));
           imagem = ic.getImage();
           g.drawImage(imagem, 0, 0, this);
       }
   }
}
