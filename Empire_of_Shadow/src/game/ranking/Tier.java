/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.ranking;

/**
 *
 * @author Walluz
 */
public class Tier {

    private String nome;
    private int num;
    private Tier next;

    public Tier(String nome) {
        this.nome = nome;
        num = 1;
        next = null;
    }

    public int getVitoria() {
        return num;
    }

    public void addVitoria() {
        num++;
    }

    public String getNome() {
        return nome;
    }

    public Tier getNext() {
        return next;
    }

    public void setNext(Tier t) {
        next = t;
    }
}
