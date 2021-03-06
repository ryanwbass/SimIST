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
public class NPC extends Rectangle {

    private String animation = "down1.png";
    private int nPCX;
    private int nPCY;
    int stepsTaken = 0;
    int direction = 0; 
    int waitTime = 0;

    public NPC(int nPCX, int nPCY) {
        this.nPCX = nPCX;
        this.nPCY = nPCY;
    }

    private int genRandNum(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void NPCMovement() {
        /*
        nPCY+=yDir;
        if (nPCY == 300) {
            yDir=-1;
        } if (nPCY == 50) {
            yDir=1;
        }
        */
        
        
        
        if (stepsTaken == 0 ){
            direction = genRandNum(4,1);
        }else if(stepsTaken == 50){
            stepsTaken = 0;
            direction = genRandNum(4,1);
        }
        if(direction == 1 && nPCX < 550){
            setAnimation("right1.png");
            this.setnPCX(this.getnPCX() + 1);
            stepsTaken++;
        }else if(direction == 2 && nPCY < 400){
            setAnimation("down1.png");
            this.setnPCY(this.getnPCY() + 1);
            stepsTaken++;
        }else if(direction == 3 && nPCX > 140){
            setAnimation("left2.png");
            this.setnPCX(this.getnPCX() - 1);
            stepsTaken++;
        }else if(direction == 4 && nPCY > 105){
            setAnimation("up1.png");
            this.setnPCY(this.getnPCY() - 1);
            stepsTaken++;
        }else{
            stepsTaken = 0;
        }

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

    /**
     * @return the animation
     */
    public String getAnimation() {
        return animation;
    }

    /**
     * @param animation the animation to set
     */
    public void setAnimation(String animation) {
        this.animation = animation;
    }
}
