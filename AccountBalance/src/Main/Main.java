/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.AccountTestManual;
import java.util.Scanner;

/**
 *
 * @author vbkJi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancing the classes we gonna use on the application 
        Scanner read = new Scanner(System.in);
        AccountTestManual at = new AccountTestManual();
        // Declaring the variables to use the interface        
        double accountValue;
        byte menuOption;
        do {
            // Menu
            System.out.println("1 - Verify if the account has balance");
            System.out.println("2 - Verify if the account no have balance");
            System.out.println("3 - Verify with a null value");
            System.out.println("0 - Exit");
            System.out.print("Type your option:");
            menuOption = read.nextByte();

            switch (menuOption) {
                case 1:
                    System.out.print("Type the account balance: ");
                    accountValue = read.nextDouble();

                    at.testAccountWithBalance(accountValue);
                    break;
                case 2:
                    System.out.print("Type the account balance: ");
                    accountValue = read.nextDouble();

                    at.testAccountWithoutBalance(accountValue);
                    break;
                case 3:
                    at.testAccountBalanceWithNullValue();
                    break;
                default:
                    System.out.println("Non available option");
                    break;
            }
        } while (menuOption != 0);
    }

}
