/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.ranking;

import java.util.ArrayList;

/**
 *
 * @author Walluz
 */
public class Ranking {

    private static Ranking instance;
    private final ArrayList<Tier> ranking;
    private Tier list;

    private Ranking() {
        list = null;
        ranking = new ArrayList();
    }
    
    public static Ranking getInstance() {
        if (instance == null) {
            instance = new Ranking();
        }
        return instance;
    }

    public void inserir(Tier v) {
        Tier novo;
        Tier atual;
        Tier antes;
        atual = list;
        antes = null;
        novo = v;

        while ((atual != null) && atual.getVitoria() > novo.getVitoria()) {
            antes = atual;
            atual = atual.getNext();
        }
        if (list == null) {
            list = novo;
        } else {
            antes.setNext(novo);
        }
    }

    public ArrayList listar() {
        Tier atual;
        atual = list;
        if (atual != null) {
            while (atual != null) {
                ranking.add(atual);
                atual = atual.getNext();
            }
        }
        return ranking;
    }

    public void ordenarRanking() {
        int i, j, qtd;
        Tier aux;
        Tier[] t = new Tier[ranking.size()];
        Object o[] = new Object[ranking.size()];
        o = ranking.toArray();
        for (int x = 0; x < o.length; x++) {
            t[x] = (Tier) o[x];
        }
        for (i = 1; i < ranking.size(); i++) {
            j = i;
            while (t[j].getVitoria() > t[j - 1].getVitoria() && j > 0) {
                aux = t[j];
                t[j] = t[j - 1];
                t[j - 1] = aux;
                j--;
            }
        }
        ranking.clear();
        for (int x = 0; x < t.length; x++) {
            ranking.add(t[x]);
        }
    }

}
