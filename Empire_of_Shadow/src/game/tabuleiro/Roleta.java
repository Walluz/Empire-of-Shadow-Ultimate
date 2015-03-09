/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.tabuleiro;

import java.util.Random;

/**
 *
 * @author Walluz
 */
public class Roleta {
    
    public Roleta()
    {
        // initialise instance variables
    }
    
     public int Rolar(){
         int x;
            Random randomGenerator = new Random();
            x = randomGenerator.nextInt(6);
            if(x==3){
             x = 2;
            }
            if(x==4){
                x = 1;
            }
            if(x==5){
                x = 0;
            }
            return x;
    }
    
    public int girarCasas(){
        int y;
        Random randomGenerator = new Random();
        do{
            y = randomGenerator.nextInt(35);
        }while(y==0||y==1||y==2||y==3||y==4||y==5||y==30||y==31||y==32||y==33||y==34||y==35);
        return y;
    }
}
