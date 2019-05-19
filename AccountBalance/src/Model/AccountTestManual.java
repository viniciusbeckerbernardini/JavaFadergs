/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vbkJi
 */
public class AccountTestManual {
    
    public void testAccountWithBalance(double value){
        Account a = new Account(value);
        if(a.hasBalance()){
            System.out.println("Balance - OK");
        }
        if(!a.hasBalance()){
            System.out.println("Balance - ERROR");
        }
    }
    
    public void testAccountWithoutBalance(double value){
        Account a = new Account(value);
        if(!a.hasBalance()){
            System.out.println("Without Balance - OK");
        }
        if(a.hasBalance()){
            System.out.println("Without Balance - ERROR");
        }
    }
    
    public void testAccountBalanceWithNullValue(){
        Account a = new Account(null);
        if(a.hasBalance()){
            System.out.println("Null balance - OK");
        }
        if(!a.hasBalance()){
            System.out.println("Null balance - ERROR");
        }
    }
    
}
