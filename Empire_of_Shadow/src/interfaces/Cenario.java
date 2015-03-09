/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.controladores.Game;
import game.controladores.Player;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Walluz
 */
public class Cenario {

    private final ArrayList<TelaCasa> casas;
    private static Cenario instance;
    private TelaRoleta roleta;
    private JTextField Painelnomedapeca;
    private JTextField Jogadornome;
    private JTextField Painelataque;
    private JTextField Paineldefesa;
    private JTextField Painelvida;
    private JProgressBar Painelataquebar;
    private JProgressBar Paineldefesabar;
    private JProgressBar Painelvidabar;
    private JTextField Painelpower;
    private JTextField Paineltipopower;
    private JToggleButton Painelonoff;
    private TelaQuadro Painelquadro;
    private tela jogo;
    private telamenu menu; 
    private telaplayers nomes;
    private telaranking ranking;
    private telacredito credito;
    
    private Cenario() {
        casas = new ArrayList();
    }

    public static synchronized Cenario getCenario() {
        if (instance == null) {
            instance = new Cenario();
        }
        return instance;
    }

    public void setTelas(TelaCasa c) {
        casas.add(c);
    }

    public void setJogadornome(JTextField j) {
        Jogadornome = j;
    }

    public void exibirJogadorNome() {
        Jogadornome.setText(Game.getGame().getJogadores()[Game.getGame().getVez()].getNome());
    }

    public void setRoleta(TelaRoleta r) {
        roleta = r;
    }

    public synchronized void repintarCasas() {
        for (TelaCasa casa : casas) {
            casa.repaint();
        }
        Painelquadro.repaint();
    }

    public synchronized void repintarRoleta() {
        roleta.repaint();
    }

    public synchronized void repintarQuadro() {
        Painelquadro.repaint();
    }

    public void setPainel(JTextField nomedapecaPainel, JTextField forcaPainel, JTextField defesaPainel, JTextField vidaPainel,
            JProgressBar forcabarPainel, JProgressBar defesabarPainel, JProgressBar vidabarPainel, JTextField powerPainel, JTextField tipopowerPainel, JToggleButton onoffPainel, TelaQuadro quadroPainel) {
        this.Painelnomedapeca = nomedapecaPainel;
        this.Painelataque = forcaPainel;
        this.Paineldefesa = defesaPainel;
        this.Painelvida = vidaPainel;
        this.Painelataquebar = forcabarPainel;
        this.Paineldefesabar = defesabarPainel;
        this.Painelvidabar = vidabarPainel;
        this.Painelpower = powerPainel;
        this.Paineltipopower = tipopowerPainel;
        this.Painelonoff = onoffPainel;
        this.Painelquadro = quadroPainel;
    }

    public synchronized void ativarPainel() {

        if (Game.getGame().getPecaclicada() != null) {

            if (Game.getGame().getPecaclicada().getTipo() == 0) {
                Painelnomedapeca.setText("Lycan");
                Paineltipopower.setText("ATAQUE");
            }

            if (Game.getGame().getPecaclicada().getTipo() == 1) {
                Painelnomedapeca.setText("Vampire");
                Paineltipopower.setText("DEFESA");
            }

            if (Game.getGame().getPecaclicada().getTipo() == 2) {
                Painelnomedapeca.setText("Necromancer");
                Paineltipopower.setText("MAGIA");
            }

            if (Game.getGame().getPecaclicada().getTipo() == 3) {
                Painelnomedapeca.setText("Zumbi");
                Paineltipopower.setText("");
            }

            if (Game.getGame().getPecaclicada().getPower() != null) {
                Painelonoff.setSelected(true);
                Painelonoff.setText("On");
            } else {
                Painelonoff.setSelected(false);
                Painelonoff.setText("Off");
            }

            Painelataquebar.setValue(Game.getGame().getPecaclicada().getAtaque());
            Paineldefesabar.setValue(Game.getGame().getPecaclicada().getDefesa());
            Painelvidabar.setValue(Game.getGame().getPecaclicada().getVida());

            Painelnomedapeca.setVisible(true);
            Painelataque.setVisible(true);
            Paineldefesa.setVisible(true);
            Painelvida.setVisible(true);
            Painelataquebar.setVisible(true);
            Paineldefesabar.setVisible(true);
            Painelvidabar.setVisible(true);
            Painelpower.setVisible(true);
            Paineltipopower.setVisible(true);
            Painelonoff.setVisible(true);
            Painelquadro.repaint();
        }
    }

    public synchronized void desativarPainel() {
        Painelnomedapeca.setVisible(false);
        Painelataque.setVisible(false);
        Paineldefesa.setVisible(false);
        Painelvida.setVisible(false);
        Painelataquebar.setVisible(false);
        Paineldefesabar.setVisible(false);
        Painelvidabar.setVisible(false);
        Painelpower.setVisible(false);
        Paineltipopower.setVisible(false);
        Painelonoff.setVisible(false);
        Painelquadro.repaint();
    }
    
    public void iniciar(){
        menu = new telamenu();
        menu.setVisible(true);
        Player.getPlayer().play("Menu2.wav");
    }
    
    public void nomes(){
        if(menu!=null){
            menu.setVisible(false);
        }
        nomes = new telaplayers();
        nomes.setVisible(true);
    }
    
    public void jogar(){
        Player.getPlayer().stop();
        if(nomes!=null){
            nomes.setVisible(false);
        }
       jogo = new tela();
       jogo.setVisible(true);
       Player.getPlayer().play("Piano.wav");
    }
    
    public void menu(){
        Player.getPlayer().stop();
        if(jogo!=null){
            jogo.setVisible(false);
        }
        if(ranking!=null){
            ranking.setVisible(false);
        }
        menu.setVisible(true);
        Player.getPlayer().play("Menu2.wav");
    }
    
    public void ranking(){
        if(menu!=null){
            menu.setVisible(false);
        }
        ranking = new telaranking();
        ranking.setVisible(true);
    }
    
    public void credito(){
        if(menu!=null){
            menu.setVisible(false);
        }
        credito = new telacredito();
        credito.setVisible(true);
    }
}
