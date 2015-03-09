/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.controladores;

import game.pecas.*;

/**
 *
 * @author Walluz
 */

public class Jogador {

    private final Peca[] peca;
    private String nomejogador;

    public Jogador(String jogadorpasta, String nome) {
        this.nomejogador = nome;
        peca = new Peca[6];
        peca[0] = new Lycan(jogadorpasta);
        peca[1] = new Necro(jogadorpasta);
        
        peca[2] = new Vamp(jogadorpasta);
        
        peca[3] = new Vamp(jogadorpasta);
        
        peca[4] = new Necro(jogadorpasta);
        
        peca[5] = new Lycan(jogadorpasta);
    }
    

    public String getNome() {
        return nomejogador;
    }

    public void setNome(String nome) {
        nomejogador = nome;
    }

    public void limparPeca() {
        for (Peca peca : getPecas()) {
            if (peca != null && peca.getVida() < 1) {
                peca = null;
            }
            if (peca != null && peca.getTipo() == 2) {
                Necro n = (Necro) peca;
                if (n.getZumbi() != null && n.getZumbi().getVida() < 1) {
                    n.delZumbi();
                }
            }
        }
    }

    public Peca[] getPecas() {
        return peca;
    }

    public boolean terPeca(){
        for(Peca peca : getPecas()){
            if(peca != null){
                return true;
            }
        }
        return false;
    }
    
    public Peca escolherPeca(Peca p) {
        Peca escolha = null;
        if (p.getTipo() == 3) {
            for (Peca peca1 : getPecas()) {
                if (peca1.getTipo() == 2) {
                    Necro n = (Necro) peca1;
                    if (n.getZumbi() == p) {
                        return n;
                    }
                }
            }
        } else {
            for (Peca peca1 : getPecas()) {
                if (peca1 == p) {
                    escolha = p;
                }
            }
        }
        return escolha;
    }

    public boolean verificarPeca(Peca p) {
        for (Peca peca1 : getPecas()) {
            if (peca1 == p) {
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarPeca(int i) {
        for (int x = 0; x < getPecas().length; x++) {
            if (getPecas()[x] != null && getPecas()[x].getTipo() == i) {
                return true;
            }
        }
        return false;
    }
    
}
