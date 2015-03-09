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
public class Defesa extends Poder {

    public Defesa() {
        super("DEFESA.png");
    }

    public void acao(Peca escolhida) {
        escolhida.setDefesa(100);
    }
}
