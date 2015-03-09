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
public class Lycan extends Peca {

    public Lycan(String jogadorpasta) {
        super(100, 100, 20, 0, "WOLF.png", jogadorpasta);
    }

    public boolean atacar(Peca adversario) {
        if (getPower() != null) {
            poder.acao(this);

        }
        int dano = getAtaque() - adversario.getDefesa();
        adversario.defender(dano);
        delPower();
        return true;
    }

    public void defender(int dano) {
        setVida(getVida() - dano);
    }

    public void delPower() {
        if (getPower() != null) {
            setAtaque(getAtaque() / 2);
            poder = null;
            imagem = imagemnormal;
        }
    }

    public void setPower(Poder p) {
        if (p instanceof Ataque) {
            poder = p;
            imagem = imagempoder;
        }
    }
}
