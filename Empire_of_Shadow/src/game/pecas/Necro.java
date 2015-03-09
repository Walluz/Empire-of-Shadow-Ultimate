/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.pecas;

import game.poder.*;

/**
 *
 * @author Walluz
 */
public class Necro extends Peca {

    Peca zumbi;
    String jogadorpasta;

    public Necro(String jogadorpasta) {
        super(60, 40, 20, 2, "NECROMANCER.png", jogadorpasta);
        this.jogadorpasta = jogadorpasta;
    }
    
    public boolean atacar(Peca adversario){
        if(getPower()!=null)
        {
            poder.acao(this);
            delPower();
            return true;
        }else{
            adversario.defender(getAtaque());
        }
        
        return true;
    }
    
    public void defender(int dano){
        setVida(getVida()-dano);
    }
    
    public void magia(Peca adversario){
        adversario.defender(getAtaque()-(adversario.getDefesa()/2));
    }
    
    public void criarZumbi(){
        zumbi = new Zumbi(jogadorpasta);
    }
    
    public void delZumbi(){
        zumbi = null;
    }
    
    public Peca getZumbi(){
        return zumbi;
    }
    
    public void setPower(Poder p){
        if(p instanceof Magia){
            poder = p;
            imagem = imagempoder;
        }
    }

}
