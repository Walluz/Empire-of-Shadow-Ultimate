/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.movimentacao;

public class Mover {

    public static int Norte(int pos, int alcance) {
        int novapos;
        if (pos == 30 || pos == 31 || pos == 32 || pos == 33 || pos == 34 || pos == 35) {
            return pos;
        }
        if (pos == 24 || pos == 25 || pos == 26 || pos == 27 || pos == 28 || pos == 29) {
            novapos = pos + (6);
        } else {
            novapos = pos + (6 * alcance);
        }

        return novapos;
    }
    
    public static int Leste(int pos, int alcance) {
        int novapos;
        if (pos == 5 || pos == 11 || pos == 17 || pos == 23 || pos == 29 || pos == 35) {
            return pos;
        }
        if (pos == 4 || pos == 10 || pos == 16 || pos == 22 || pos == 28 || pos == 34) {
            novapos = pos + (1);
        } else {
            novapos = pos + (1 * alcance);
        }
        return novapos;
    }
    
    public static int Oeste(int pos, int alcance) {
        int novapos;
        if (pos == 0 || pos == 6 || pos == 12 || pos == 18 || pos == 24 || pos == 30) {
            return pos;
        }
        if (pos == 1 || pos == 7 || pos == 13 || pos == 19 || pos == 25 || pos == 31) {
            novapos = pos - (1);
        } else {
            novapos = pos - (1 * alcance);
        }
        return novapos;
    }
    
    public static int Sul(int pos, int alcance) {
        int novapos;
        if (pos == 0 || pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5) {
            return pos;
        }
        if (pos == 6 || pos == 7 || pos == 8 || pos == 9 || pos == 10 || pos == 11) {
            novapos = pos - (6);
        } else {
            novapos = pos - (6 * alcance);
        }
        return novapos;
    }
    
     public static int Nordeste(int pos, int alcance) {
        int novapos;
        if (pos == 30 || pos == 31 || pos == 32 || pos == 33 || pos == 34 || pos == 35 || pos == 5 || pos == 11 || pos == 17 || pos == 23 || pos == 29) {
            return pos;
        }
        if (pos == 4 || pos == 10 || pos == 16 || pos == 22 || pos == 28 || pos == 24 || pos == 25 || pos == 26 || pos == 27) {
            novapos = pos + (7);
        } else {
            novapos = pos + (7 * alcance);
        }
        return novapos;
    }
     
     public static int Noroeste(int pos, int alcance) {
        int novapos;
        if (pos == 30 || pos == 31 || pos == 32 || pos == 33 || pos == 34 || pos == 35 || pos == 0 || pos == 6 || pos == 12 || pos == 18 || pos == 24) {
            return pos;
        }
        if (pos == 25 || pos == 26 || pos == 27 || pos == 28 || pos == 29 || pos == 1 || pos == 7 || pos == 13 || pos == 19) {
            novapos = pos + (5);
        } else {
            novapos = pos + (5 * alcance);
        }
        return novapos;
    }
     
     public static int Sudeste(int pos, int alcance) {
        int novapos;
        if (pos == 0 || pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5 || pos == 11 || pos == 17 || pos == 23 || pos == 29 || pos == 35) {
            return pos;
        }
        if (pos == 6 || pos == 7 || pos == 8 || pos == 9 || pos == 10 || pos == 16 || pos == 22 || pos == 28 || pos == 34) {
            novapos = pos - (5);
        } else {
            novapos = pos - (5 * alcance);
        }
        return novapos;
    }
     
     public static int Sudoeste(int pos, int alcance) {
        int novapos;
        if (pos == 0 || pos == 6 || pos == 12 || pos == 18 || pos == 24 || pos == 30 || pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5) {
            return pos;
        }
        if (pos == 7 || pos == 8 || pos == 9 || pos == 10 || pos == 11 || pos == 13 || pos == 19 || pos == 25 || pos == 31) {
            novapos = pos - (7);
        } else {
            novapos = pos - (7 * alcance);
        }
        return novapos;
    }
}
