/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Retangle;

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

        double side1, side2;

        System.out.print("Type the first side of the retangle: ");
        side1 = scan.nextDouble();
        System.out.print("Type the second side of the retangle: ");
        side2 = scan.nextDouble();
        
        Retangle r = new Retangle(side1,side2);
        
        r.calcArea();
        r.calcPerimeter();
    }

}
