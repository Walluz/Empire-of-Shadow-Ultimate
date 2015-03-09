/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.poder;

import game.pecas.Peca;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Walluz
 */
public abstract class Poder {

    protected Image imagem;
    
    public Poder(String img){
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/powerup/"+img));
        imagem = ic.getImage();
    }
    public abstract void acao(Peca escolhida);
    
    public Image getImagem(){
        return imagem;
    }
}
