/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.poder;

import game.controladores.Game;
import game.pecas.Necro;
import game.pecas.Peca;

/**
 *
 * @author Walluz
 */
public class Magia extends Poder {

    public Magia() {
        super("MAGIA.png");
    }

    public void acao(Peca escolhida) {
        Necro necro = (Necro) escolhida;
        for (Peca peca : Game.getGame().getJogadores()[Game.getGame().inversoVez()].getPecas()) {
            if (peca != null) {
                necro.magia(peca);
            }
        }
    }
}
