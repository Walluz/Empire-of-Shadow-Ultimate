package game.controladores;

import interfaces.Cenario;
import game.movimentacao.*;
import game.pecas.*;
import game.ranking.*;
import game.tabuleiro.*;
import java.util.ArrayList;

public class Game {

    private final Jogador[] jogadores;
    private Jogador vencedor;
    private final Tabuleiro tabu;
    private int vez;
    private Peca pecaselecionada;
    private Casa casaselecionada;
    private Peca pecaclicada;
    private static Game instance;
    private int rodada;
    private int rodadapower;
    private int tipopeca;
    private boolean fimjogo;
    private boolean jogadavalida;

    private Game() {
        jogadores = new Jogador[2];
        tabu = new Tabuleiro();
        vez = 1;
        jogadores[0] = new Jogador("j1", "Player 2");
        jogadores[1] = new Jogador("j2", "Player 1");
        alocarPecas();
        fimjogo = false;
        tipopeca = 10;
        rodada = 0;
        pecaselecionada = null;
        casaselecionada = null;
        pecaclicada = null;
        jogadavalida = false;
        girarRoletatipo();
        girarRoletaPower();

    }

    public static synchronized Game getGame() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void Novojogo(String nomej1, String nomej2) {
        jogadores[0].setNome(nomej1);
        jogadores[1].setNome(nomej2);
    }

    private void alocarPecas() {
        for (int x = 0; x < jogadores[0].getPecas().length; x++) {
            tabu.alocarPeca(jogadores[0].getPecas()[x], tabu.getCasas()[x]);
            tabu.alocarPeca(jogadores[1].getPecas()[x], tabu.getCasas()[x + 30]);
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    private void trocarVez() {
        vez = inversoVez();
        jogadavalida = false;
        casaselecionada.delSelect();
        casaselecionada = null;
        pecaselecionada.delSelect();
        pecaselecionada = null;
        pecaclicada = null;
        tipopeca = 10;
        boolean b = false;
        do {
            girarRoletatipo();
            b = jogadores[vez].verificarPeca(tipopeca);
        } while (!b);
        gerarPower();
        limparjogo();
    }

    public void setPecaclicada(Peca p) {
        pecaclicada = p;
    }

    public Peca getPecaclicada() {
        return pecaclicada;
    }

    public Peca getPecaselecionada() {
        return pecaselecionada;
    }

    public boolean getFimjogo() {
        return fimjogo;
    }

    public Tabuleiro getTabu() {
        return tabu;
    }

    public void verificarVencedor() {
        if (!jogadores[0].terPeca() || !jogadores[1].terPeca()) {
            fimjogo = true;
            if (!jogadores[1].terPeca()) {
                vencedor = jogadores[0];
            } else {
                vencedor = jogadores[1];
            }
            Tier tier = new Tier(vencedor.getNome());
            boolean encontrado = false;
            ArrayList ranking = Ranking.getInstance().listar();
            for (Object o : ranking) {
                Tier t = (Tier) o;
                if (t.getNome().equalsIgnoreCase(tier.getNome())) {
                    t.addVitoria();
                    Ranking.getInstance().ordenarRanking();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                ranking.add(tier);
            }
            Cenario.getCenario().menu();
        } else {
            rodada++;
            trocarVez();
        }
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    private void limparjogo() {
        jogadores[0].limparPeca();
        jogadores[1].limparPeca();
        tabu.limpartabuleiro();
        tabu.negarDispo();
        Cenario.getCenario().repintarRoleta();
        Cenario.getCenario().repintarCasas();
        Cenario.getCenario().exibirJogadorNome();
    }

    private void girarRoletaPower() {
        rodadapower = tabu.getRoleta().girarCasas();
        if (rodadapower < 4 && rodadapower > 15) {
            girarRoletaPower();
        }
    }

    private void gerarPower() {
        if (rodada == rodadapower) {
            tabu.gerarPower();
        }
    }

    public int inversoVez() {
        int x = 0;
        if (vez == 0) {
            x = 1;
        }
        if (vez == 1) {
            x = 0;
        }
        return x;
    }

    public int getVez() {
        return vez;
    }
    
    private void girarRoletatipo() {
        boolean b;
        tipopeca = 10;
        do {
            int x = tabu.getRoleta().Rolar();
            if (jogadores[vez].verificarPeca(x)) {
                tipopeca = x;
                b = true;
            }else{
                b = false;
            }
        } while (!b);

    }

    public boolean getJogadaValida() {
        return jogadavalida;
    }

    public void validarJogada(boolean b) {
        jogadavalida = b;
    }

    public int getTipopeca() {
        return tipopeca;
    }

    public void selecionarPeca(Peca p) {

        Peca aux;
        if (p.getTipo() == tipopeca || p.getTipo() == 3) {
            aux = getJogadores()[vez].escolherPeca(p);
            if (aux != null) {
                if (pecaselecionada != null) {
                    pecaselecionada.delSelect();
                }
                pecaselecionada = aux;
                pecaselecionada.selectPeca();

            }
            Cenario.getCenario().repintarCasas();
        }
    }

    public void selecionarCasa(Casa c) {
        if (casaselecionada != null) {
            casaselecionada.delSelect();
        }
        casaselecionada = c;
        casaselecionada.selectCasa();
        Cenario.getCenario().repintarCasas();
    }

    public void verificarDispomove() {
        delDispo();
        if (pecaselecionada != null) {
            int pos = 0;
            for (int y = 0; y < tabu.getCasas().length; y++) {
                if (pecaselecionada == tabu.getCasas()[y].getPeca()) {
                    pos = y;
                }
            }

            if (tabu.getCasas()[Mover.Norte(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Norte(pos, 1)].changeDispo(true);
            }

            if (tabu.getCasas()[Mover.Sul(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Sul(pos, 1)].changeDispo(true);
            }

            if (tabu.getCasas()[Mover.Leste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Leste(pos, 1)].changeDispo(true);
            }

            if (tabu.getCasas()[Mover.Oeste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Oeste(pos, 1)].changeDispo(true);
            }
            if (tabu.getCasas()[Mover.Nordeste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Nordeste(pos, 1)].changeDispo(true);
            }
            if (tabu.getCasas()[Mover.Noroeste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Noroeste(pos, 1)].changeDispo(true);
            }
            if (tabu.getCasas()[Mover.Sudoeste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Sudoeste(pos, 1)].changeDispo(true);
            }
            if (tabu.getCasas()[Mover.Sudeste(pos, 1)].getPeca() == null) {
                tabu.getCasas()[Mover.Sudeste(pos, 1)].changeDispo(true);
            }
            if (pecaselecionada.getTipo() == 0) {
                if (tabu.getCasas()[Mover.Norte(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Norte(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Sul(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Sul(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Leste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Leste(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Oeste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Oeste(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Nordeste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Nordeste(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Noroeste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Noroeste(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Sudoeste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Sudoeste(pos, 2)].changeDispo(true);
                }
                if (tabu.getCasas()[Mover.Sudeste(pos, 2)].getPeca() == null) {
                    tabu.getCasas()[Mover.Sudeste(pos, 2)].changeDispo(true);
                }
            }
            Cenario.getCenario().repintarCasas();
        }
    }

    public void verificarDispoataque() {
        delDispo();
        if (pecaselecionada != null) {
            int pos = 0;
            for (int y = 0; y < tabu.getCasas().length; y++) {
                if (pecaselecionada == tabu.getCasas()[y].getPeca()) {
                    pos = y;
                }
            }

            if (tabu.getCasas()[Mover.Norte(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Norte(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Norte(pos, 1)].changeDispo(true);
                }
            }

            if (tabu.getCasas()[Mover.Sul(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sul(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Sul(pos, 1)].changeDispo(true);
                }
            }

            if (tabu.getCasas()[Mover.Leste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Leste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Leste(pos, 1)].changeDispo(true);
                }
            }

            if (tabu.getCasas()[Mover.Oeste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Oeste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Oeste(pos, 1)].changeDispo(true);
                }
            }
            if (tabu.getCasas()[Mover.Nordeste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Nordeste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Nordeste(pos, 1)].changeDispo(true);
                }
            }
            if (tabu.getCasas()[Mover.Noroeste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Noroeste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Noroeste(pos, 1)].changeDispo(true);
                }
            }
            if (tabu.getCasas()[Mover.Sudoeste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sudoeste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Sudoeste(pos, 1)].changeDispo(true);
                }
            }
            if (tabu.getCasas()[Mover.Sudeste(pos, 1)].getPeca() != null) {
                if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sudeste(pos, 1)].getPeca())) {
                    tabu.getCasas()[Mover.Sudeste(pos, 1)].changeDispo(true);
                }
            }
            if (pecaselecionada.getTipo() == 2) {
                if (pecaselecionada.getPower() == null) {
                    if (tabu.getCasas()[Mover.Norte(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Norte(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Norte(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Sul(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sul(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Sul(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Leste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Leste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Leste(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Oeste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Oeste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Oeste(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Nordeste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Nordeste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Nordeste(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Noroeste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Noroeste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Noroeste(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Sudoeste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sudoeste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Sudoeste(pos, 2)].changeDispo(true);
                        }
                    }
                    if (tabu.getCasas()[Mover.Sudeste(pos, 2)].getPeca() != null) {
                        if (!jogadores[vez].verificarPeca(tabu.getCasas()[Mover.Sudeste(pos, 2)].getPeca())) {
                            tabu.getCasas()[Mover.Sudeste(pos, 2)].changeDispo(true);
                        }
                    }
                } else {
                    for (Casa casa : tabu.getCasas()) {
                        if (casa.getPeca() != null && !jogadores[vez].verificarPeca(casa.getPeca())) {
                            casa.changeDispo(true);
                        }
                    }
                }
            }
            Cenario.getCenario().repintarCasas();
        }
    }

    public void verificarDispozumbi() {
        if (pecaselecionada != null) {
            Necro necro = (Necro) pecaselecionada;
            if (necro.getZumbi() == null) {
                for (Casa casa : tabu.getCasas()) {
                    if (casa.getPeca() == null && casa.getPower() == null) {
                        casa.changeDispo(true);
                    }
                }
            } else {
                pecaselecionada = necro.getZumbi();
                verificarDispoataque();
                pecaselecionada = necro;
            }
            Cenario.getCenario().repintarCasas();
        }
    }

    public void delDispo() {
        tabu.negarDispo();
        Cenario.getCenario().repintarCasas();
    }

    public void acaoMover() {
        if (casaselecionada != null && pecaselecionada != null) {
            if (casaselecionada.getPeca() == null && casaselecionada.getDispo()) {
                validarJogada(tabu.entrarPeca(pecaselecionada, casaselecionada));
            }
            if (getJogadaValida()) {
                verificarVencedor();
            }
        }
    }

    public void acaoAtacar() {
        if (casaselecionada != null && pecaselecionada != null) {
            if (casaselecionada.getPeca() != null && casaselecionada.getDispo()) {
                validarJogada(pecaselecionada.atacar(casaselecionada.getPeca()));
            } else {
                validarJogada(false);
            }
            if (getJogadaValida()) {
                verificarVencedor();
            }
        }
    }

    public void acaoDrenar() {
        if (casaselecionada != null && pecaselecionada != null) {
            if (pecaselecionada.getTipo() == 1) {
                if (casaselecionada.getPeca() != null && casaselecionada.getDispo()) {
                    Vamp v = (Vamp) pecaselecionada;
                    validarJogada(v.atacar(casaselecionada.getPeca()));
                } else {
                    validarJogada(false);
                }
            }
            if (getJogadaValida()) {
                verificarVencedor();
            }
        }
    }

    private void invocarZumbi() {
        if (casaselecionada != null && pecaselecionada != null) {
            if (pecaselecionada.getTipo() == 2) {
                if (casaselecionada.getPeca() == null) {
                    Necro necro = (Necro) pecaselecionada;
                    if (necro.getZumbi() == null) {
                        necro.criarZumbi();
                        validarJogada(tabu.alocarPeca(necro.getZumbi(), casaselecionada));
                    } else {
                        validarJogada(false);
                    }
                } else {
                    validarJogada(false);
                }
            } else {
                validarJogada(false);
            }
            if (getJogadaValida()) {
                verificarVencedor();
            }
        }
    }

    private void acaoZumbiatacar() {
        if (casaselecionada != null && pecaselecionada != null) {
            if (pecaselecionada.getTipo() == 2) {
                if (casaselecionada.getPeca() != null && casaselecionada.getDispo()) {
                    Necro necro = (Necro) pecaselecionada;
                    if (necro.getZumbi() != null) {
                        validarJogada(necro.getZumbi().atacar(casaselecionada.getPeca()));
                    }
                } else {
                    validarJogada(false);
                }

            } else {
                validarJogada(false);
            }
            if (getJogadaValida()) {
                verificarVencedor();
            }
        }
    }

    public void acaoControlarZumbi() {
        if (pecaselecionada != null) {
            Necro necro = (Necro) pecaselecionada;
            if (necro.getZumbi() == null) {
                invocarZumbi();
            } else {
                acaoZumbiatacar();
            }
        }
    }
}
