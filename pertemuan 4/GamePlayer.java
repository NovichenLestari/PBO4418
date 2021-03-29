/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayer;

/**
 *
 * @author Novichen
 */
public class GamePlayer {

    private double width;
    private double height;
    private int PositionX;
    private int PositionY;
    
    public GamePlayer() {
    }
    public GamePlayer(double width,double height){
        
    }
    public GamePlayer(double width, double height,int PositionX, int PositionY){
    
    }
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int PositionX, int PositionY){
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public int getX(){
        return this.PositionX;
    }
    public int getY(){
        return this.PositionY;
    }
    public void Run(){
        System.out.println("Player Is Running");
    }  
    public void Run(int incrementX){
        this.PositionX = PositionX + incrementX;
        System.out.println("Player still running...current X position= "
        + this.PositionX);
    }
}

