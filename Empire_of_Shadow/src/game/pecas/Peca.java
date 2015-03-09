/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.pecas;
import game.poder.*;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Walluz
 */
public abstract class Peca {
    protected int vida;
    protected int ataque;
    protected int vidamax;
    protected int defesa;
    protected Poder poder;
    protected int tipo;
    protected Image imagem;
    protected Image imagemnormal;
    protected Image imagempoder;
    protected Image imagemselnormal;
    protected Image imagemselpoder;
    
    public Peca(int vida, int ataque, int defesa, int tipo, String img, String jogadorpasta) {
        this.vida = vida;
        vidamax = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
        ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("resource/" + jogadorpasta + "/" + img));
        imagemnormal = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/" + jogadorpasta + "/PowerUP/" + img));
        imagempoder = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/" + jogadorpasta + "/Selected/" + img));
        imagemselnormal = ic.getImage();
        ic = new ImageIcon(getClass().getClassLoader().getResource("resource/" + jogadorpasta + "/Selected/PowerUP/" + img));
        imagemselpoder = ic.getImage();
        imagem = imagemnormal;
    }
    
    public abstract boolean atacar(Peca adversario);

    public abstract void defender(int dano);
    
    public Image getImagem() {
        return imagem;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int novavida) {
        vida = novavida;
    }

    public int getVidamax() {
        return vidamax;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int a) {
        ataque = a;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int novadefesa) {
        defesa = novadefesa;
    }

    public int getTipo() {
        return tipo;
    }

    public abstract void setPower(Poder p);

    public Poder getPower() {
        return poder;
    }

    public void delPower() {
        if (poder != null) {
            poder = null;
            imagem = imagemnormal;
        }
    }

    public void selectPeca() {
        if (poder != null) {
            imagem = imagemselpoder;
        } else {
            imagem = imagemselnormal;
        }
    }

    public void delSelect() {
        if(poder == null){
            imagem = imagemnormal;
        }else{
            imagem = imagempoder;
        }
    }
}
