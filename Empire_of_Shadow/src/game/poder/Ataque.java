/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.poder;

import game.pecas.Peca;

/**
 *
 * @author Walluz
 */
public class Ataque extends Poder {

    public Ataque() {
        super("ATAQUE.png");
    }

    public void acao(Peca p) {
        p.setAtaque(p.getAtaque() * 2);
    }
}
