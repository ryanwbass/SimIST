/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author rwb5529
 */
public class NPC extends Rectangle{
    private String animation = "down1.png";
    private int nPCX = 100;
    private int nPCY = 100;
    
    public NPC(int npcX, int npcY)
    {
        x = npcX;
        y = npcY;
    }
    
    private int genRandNum(int max, int min){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void NPCMovement(){
        
        this.setnPCX(this.getnPCX() + 1);
        
//        int stepsTaken = 0;
//        int direction = 0; 
//        if (stepsTaken == 0){
//            direction = genRandNum(1,4);
//        }else if(stepsTaken == 5){
//            direction = genRandNum(1,4);
//        }
//        if(direction == 1){
//            this.setnPCX(x + 1);
//            stepsTaken++;
//        }else if(direction == 2){
//            this.setnPCY(y + 1);
//            stepsTaken++;
//        }else if(direction == 3){
//            this.setnPCX(x - 1);
//            stepsTaken++;
//        }else if(direction == 4){
//            this.setnPCY(y - 1);
//            stepsTaken++;
//        }else{
//            
//        }
        
        
    }

    /**
     * @return the nPCX
     */
    public int getnPCX() {
        return nPCX;
    }

    /**
     * @param nPCX the nPCX to set
     */
    public void setnPCX(int nPCX) {
        this.nPCX = nPCX;
    }

    /**
     * @return the nPCY
     */
    public int getnPCY() {
        return nPCY;
    }

    /**
     * @param nPCY the nPCY to set
     */
    public void setnPCY(int nPCY) {
        this.nPCY = nPCY;
    }
}
