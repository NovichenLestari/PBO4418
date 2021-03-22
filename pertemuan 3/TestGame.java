/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayer;
/**
 *
 * @author ACER
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        GamePlayer min = new GamePlayer();
        min.setDimension(30, 10);
        min.setPosition(3, 4);
        min.Run();
        
        System.out.println("Player width : " + min.getWidth());
        System.out.println("Player height : "+ min.getHeight());
        System.out.println("Player Position X : "+ min.getX());
        System.out.println("Player Position Y : "+ min.getY());
        min.Run(30);
        
        GameEnemy eny = new GameEnemy();
        eny.setDimension(20, 15);
        eny.setPosition(5, 5);
        eny.Run();
        System.out.println("Player width : " + eny.getWidth());
        System.out.println("Player height : "+ eny.getHeight());
        System.out.println("Player Position X : "+ eny.getX());
        System.out.println("Player Position Y : "+ eny.getY());
    }
}
