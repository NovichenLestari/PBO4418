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
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        // TODO code application logic here
        GamePlayer hero=new GamePlayer();
        hero.setDimension(12, 12);
        hero.setPosition(10, 220);
        System.out.println("position Player= "+hero.getX()+","+hero.getY());
        hero.Run(12);
        System.out.println("position Player= "+hero.getX()+","+hero.getY());
        GamePlayer hero2=new GamePlayer();
        hero2.setDimension(12, 32);
        hero2.setPosition(10, 10);

        System.out.println("\n");
        
        GameEnemy monster=new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);
        System.out.println("position Enemy= "+monster.getX()+","+monster.getY());
        monster.Run();
        
        System.out.println("=====================================================\n");
        GameEnvironment scane = new GameEnvironment();
        scane.addPlayer(hero);
        scane.addPlayer(hero);
        scane.addPlayer(hero2);
        scane.getAllPlayer();
        scane.removePlayer(hero);
        scane.getAllPlayer();
        scane.addEnemy(monster);
        /*scane.getAllEnemy();*/
        scane.Interaction();

    }
}
