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
public class GameEnemy {
    private double width;
    private double height;
    private int PositionX;
    private int PositionY;
    
    public GameEnemy() {
    }
    public GameEnemy(double width,double height){
        
    }
    public GameEnemy(double width, double height,int PositionX, int PositionY){
    
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
        System.out.println("Enemy Is Running");
    }
}
