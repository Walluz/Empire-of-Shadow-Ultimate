/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.tabuleiro;

import game.pecas.Peca;
import game.poder.*;
import interfaces.Cenario;

/**
 *
 * @author Walluz
 */
public class Tabuleiro {

    private final Roleta roleta;
    private final Casa[] casas;

    public Tabuleiro() {
        roleta = new Roleta();
        casas = new Casa[36];
        criarCasas();
    }

    private void criarCasas() {
        casas[0] = new Casa("Pedra2.png");
        casas[1] = new Casa("Pedra1.png");
        casas[2] = new Casa("Pedra1.png");
        casas[3] = new Casa("Pedra1.png");
        casas[4] = new Casa("Pedra1.png");
        casas[5] = new Casa("Pedra2.png");
        casas[6] = new Casa("Pedra1.png");
        casas[7] = new Casa("peca4.png");
        casas[8] = new Casa("peca3.png");
        casas[9] = new Casa("peca2.png");
        casas[10] = new Casa("Pedra2.png");
        casas[11] = new Casa("Pedra1.png");
        casas[12] = new Casa("Pedra1.png");
        casas[13] = new Casa("peca5.png");
        casas[14] = new Casa("centro4.png");
        casas[15] = new Casa("centro2.png");
        casas[16] = new Casa("peca1.png");
        casas[17] = new Casa("Pedra1.png");
        casas[18] = new Casa("Pedra1.png");
        casas[19] = new Casa("peca6.png");
        casas[20] = new Casa("centro3.png");
        casas[21] = new Casa("centro1.png");
        casas[22] = new Casa("peca11.png");
        casas[23] = new Casa("Pedra1.png");
        casas[24] = new Casa("Pedra1.png");
        casas[25] = new Casa("peca7.png");
        casas[26] = new Casa("peca8.png");
        casas[27] = new Casa("peca9.png");
        casas[28] = new Casa("peca10.png");
        casas[29] = new Casa("Pedra1.png");
        casas[30] = new Casa("Pedra2.png");
        casas[31] = new Casa("Pedra1.png");
        casas[32] = new Casa("Pedra1.png");
        casas[33] = new Casa("Pedra1.png");
        casas[34] = new Casa("Pedra1.png");
        casas[35] = new Casa("Pedra2.png");
    }

    public void negarDispo() {
        for (Casa casa : casas) {
            if (casa.getDispo()) {
                casa.changeDispo(false);
            }
        }
    }

    public Roleta getRoleta() {
        return roleta;
    }

    public boolean alocarPeca(Peca peca, Casa casa) {
        for (Casa casa1 : casas) {
            if (casa1 == casa && casa1.getPeca() == null && casa1.getPower() == null) {
                casa1.setPeca(peca);
            }
        }
        return true;
    }

    public boolean entrarPeca(Peca peca, Casa casa) {
        boolean b = false;
        if (getCasas()[casanova(casa)].getDispo()) {
            getCasas()[casaatual(peca)].retirarPeca();
            getCasas()[casanova(casa)].setPeca(peca);
            b = true;
            if (getCasas()[casanova(casa)].getPower() != null) {
                peca.setPower(getCasas()[casanova(casa)].getPower());
                if (getCasas()[casanova(casa)].getPower() == peca.getPower()) {
                    getCasas()[casanova(casa)].delPower();
                    Cenario.getCenario().repintarCasas();
                }
            }
        }
        return b;
    }

    public void limpartabuleiro() {
        for (Casa casa : getCasas()) {
            if (casa.getPeca() != null && casa.getPeca().getVida() < 1) {
                casa.retirarPeca();
            }
        }
    }

    private int casaatual(Peca p) {
        int ca = 0;
        for (int x = 0; x < casas.length; x++) {
            if (casas[x].getPeca() == p) {
                ca = x;
            }
        }
        return ca;
    }

    private int casanova(Casa casa) {
        int cn = 0;
        for (int x = 0; x < casas.length; x++) {
            if (casas[x] == casa) {
                cn = x;
            }
        }
        return cn;
    }

    public Casa[] getCasas() {
        return casas;
    }

    public void retirarPeca(Casa casa) {
        for (Casa casa1 : casas) {
            if (casa1 == casa) {
                casa1.retirarPeca();
            }
        }
    }

    public void gerarPower() {
        boolean b = false;

        while (!b) {
            int x = roleta.girarCasas();
            if (casas[x].getPeca() == null && casas[x].getPower() == null) {
                casas[x].setPower(new Ataque());
                b = true;
            }
        }
        b = false;
        while (!b) {
            int x = roleta.girarCasas();
            if (casas[x].getPeca() == null && casas[x].getPower() == null) {
                casas[x].setPower(new Defesa());
                b = true;
            }
        }
        b = false;
        while (!b) {
            int x = roleta.girarCasas();
            if (casas[x].getPeca() == null && casas[x].getPower() == null) {
                casas[x].setPower(new Magia());
                b = true;
            }
        }
    }
}
