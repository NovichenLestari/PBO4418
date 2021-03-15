/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOVICHEN
 */
public class TestSimpleCircle {

    /**
     * @param args the line arguments
     */
        // TODO code application logic here
    public static void main (String[] args) {
        SimpleCircle circle = new SimpleCircle(10);
        System.out.println(circle.radius + " Area is " + circle.getArea());
        
        SimpleCircle circle1 = new SimpleCircle(25);
        System.out.println(circle1.radius + " Area is " + circle1.getArea());
        
        SimpleCircle circle2 = new SimpleCircle(125);
        System.out.println(circle2.radius + " Area is " + circle2.getArea());
        
        circle2.radius = 100;
        System.out.println(circle2.radius + " Area is " + circle2.getArea());

    }
}

class SimpleCircle{
    double radius = 1;

    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI ;
    }

    double perimeterSet() {
        return 2 * radius * Math.PI;
    }

    /**
    static void radiusSet(double newRadius) {
        radius = newRadius;
    } 
    */
}
