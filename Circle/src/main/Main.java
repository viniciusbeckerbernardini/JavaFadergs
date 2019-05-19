/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Circle;

/**
 *
 * @author vbkJi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ray;
        System.out.println("Type the ray of the circle: ");
        ray = scan.nextDouble();
        
        Circle c = new Circle(ray);
        
        c.calcArea();
        c.calcPerimeter();
    }
    
}
