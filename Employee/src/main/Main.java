/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Employee;

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
        Employee e = new Employee();
        String op;

        System.out.print("Set the employee name: ");
        e.setName(scan.next());
        System.out.print("Set the employee subname: ");
        e.setSubname(scan.next());
        System.out.print("Set the worked hours of " + e.getName()+ ": ");
        e.setWorkHours(scan.nextInt());
        System.out.print("Set the work hour value of " + e.getName() + ": $");
        e.setPricePerHour(scan.nextDouble());
        e.setCompleteName();
        e.calcSalary();
        System.out.print("He has extra hours? (Y/N): > ");
        op = scan.next();
        
        System.out.println(op);
        
        if ("Y".equals(op) || "y".equals(op)) {
            System.out.println("How many extra hours " + e.getName() + " did?");
            e.setExtraHours(scan.nextInt());
        }
    }
}
