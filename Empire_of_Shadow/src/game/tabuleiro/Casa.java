/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.tabuleiro;

import game.pecas.Peca;
import game.poder.*;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Walluz
 */
public class Casa {
    private Peca peca;
    private Poder poder;
    private Image imagem;
    private final Image imagemnormal;
    private final Image imagemdispo;
    private final Image imagemseldispo;
    private final Image imagemselnormal;
    private boolean disponibilidade;
    
    public Casa(String img) {
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/casas/" + img));
        imagemnormal = ic.getImage();

        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/casas/Selected/" + img));
        imagemselnormal = ic.getImage();

        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/casas/Dispo/" + img));
        imagemdispo = ic.getImage();

        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/casas/Selected/Dispo/" + img));
        imagemseldispo = ic.getImage();

        disponibilidade = false;
        imagem = imagemnormal;
    }
    
     public void setPeca(Peca p) {
        peca = p;
    }

    public Peca getPeca() {
        return peca;
    }

    public boolean getDispo() {
        return disponibilidade;
    }

    public void changeDispo(boolean b) {
        disponibilidade = b;
        if (getDispo()) {

            imagem = imagemdispo;
        }
        if (!getDispo()) {
            imagem = imagemnormal;
        }
    }

    public void selectCasa() {
        if (getDispo()) {
            imagem = imagemseldispo;
        }
        if(!getDispo()){
            imagem = imagemselnormal;
        }
    }

    public void delSelect() {
        if (getDispo()) {
            imagem = imagemdispo;
        }
        if(!getDispo()){
            imagem = imagemnormal;
        }
    }

    public void retirarPeca() {
        peca = null;
    }

    public void setPower(Poder p) {
        poder = p;
    }

    public Poder getPower() {
        return poder;
    }

    public void delPower() {
        poder = null;
    }

    public Image getImagem() {
        return imagem;
    }
}
