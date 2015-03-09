/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.controladores;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Walluz
 */
public class Player {

    private static Player instance;
    private AudioClip clip;
    
    public static synchronized Player getPlayer(){
      if(instance==null){
          instance = new Player();
      }
      return instance;
  }
  

   public void stop(){
       if(clip !=null){
             clip.stop();
       }
   }
   
   public void play(String som){
        clip = Applet.newAudioClip(getClass().getClassLoader().getResource("resource/som/"+som));
       clip.loop();
   }
}
