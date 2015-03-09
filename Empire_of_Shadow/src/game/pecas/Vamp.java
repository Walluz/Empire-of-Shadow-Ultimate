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
public class Vamp extends Peca {

    public Vamp(String jogadorpasta) {
        super(80, 60, 100, 1, "VAMPIRO.png", jogadorpasta);
    }

    public boolean atacar(Peca adversario) {
        int dano = getAtaque() - adversario.getDefesa();
        adversario.defender(dano);
        return true;
    }

    public void defender(int dano) {
        if (getPower() != null) {
            poder.acao(this);
            delPower();
        } else {

            if (getVida() > (getVida() - dano)) {
                setVida(getVida() - dano);
            }
            if (getDefesa() > 30) {
                setDefesa(getDefesa() - 10);
            }
        }
    }

    public boolean drenarVida(Peca adversario) {
        int dano = getAtaque() / 2;
        adversario.defender(dano);
        setVida(getVida() + dano);
        return true;
    }

    public void setPower(Poder p) {
        if (p instanceof Defesa) {
            poder = p;
            imagem = imagempoder;
        }
    }
}
