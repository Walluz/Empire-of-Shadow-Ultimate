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
public class Zumbi extends Peca {

    public Zumbi(String jogadorpasta) {
        super(10, 10, 0, 3, "ZUMBI.png", jogadorpasta);
    }
    
    public boolean atacar(Peca adversario){
        adversario.defender(getAtaque());
        return true;
    }
    
    public void defender(int dano){
        setVida(getVida()-dano);
    }
    
    public void setPower(Poder p){
        poder = null;
    }
}
